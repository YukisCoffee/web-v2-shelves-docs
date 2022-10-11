package io.github.yukiscoffee.innertube.shelves;

import java.util.Base64;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuation;
import com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationAppendAction;
import com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper;
import com.google.protos.youtube.api.innertube.ContinuationTypeWrapperOuterClass.ContinuationTypeWrapper;
import com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper;

/**
 * Implements a set of utilities to easily get shelves (categorised) homepage
 * on the WEB v2 client.
 * 
 * This works by converting a reload continuation (encoded in Protocol Buffers)
 * of a client that supports shelves so that the WEB client can use it.
 * 
 * The output is a set of rich shelf renderers that replicate the older shelves
 * interface. They can then be converted to the same markup format as needed
 * by the programmer.
 * 
 * @author Taniko Yamamoto <kirasicecreamm@gmail.com>
 */
public class WebV2Shelves
{
    /**
     * Convert a shelves client continuation to a WEB-compatible one.
     * 
     * The code is quite disgusting for this, however it's a quite simple modification. This digs
     * into the inner layers of this code to change two variables to convert the type, then returns
     * a new valid continuation.
     * 
     * @param continuation A continuation from a client with shelves, i.e. ANDROID, IOS, TVHTML5.
     * @return A web continuation.
     */
    public static String continuationToWeb(String continuation) throws InvalidProtocolBufferException
    {
        byte[] decoded = decodeContinuation(continuation);

        // Unwrap in order to modify the class.
        ContinuationWrapper outerWrapper =  ContinuationWrapper.parseFrom(decoded);
        BrowseContinuationWrapper innerWrapper = outerWrapper.getBrowseContinuation();

        byte[] rawTypeWrapper = decodeContinuation(innerWrapper.getEncodedAction());
        ContinuationTypeWrapper typeWrapper = ContinuationTypeWrapper.parseFrom(rawTypeWrapper);

        byte[] rawBrowseContinuation = decodeContinuation(typeWrapper.getReloadContinuation());
        BrowseContinuation browseContinuation = BrowseContinuation.parseFrom(rawBrowseContinuation);

        // Now work in reverse to form a new continuation token.
        BrowseContinuation.Builder bcBuilder = BrowseContinuation.newBuilder().mergeFrom(browseContinuation);
        bcBuilder.clearReloadAction();
        bcBuilder.setAppendAction(BrowseContinuationAppendAction.newBuilder().setA(0));
        String newBrowseContinuation = encodeContinuation(bcBuilder.build().toByteArray());

        ContinuationTypeWrapper.Builder ctwBuilder = ContinuationTypeWrapper.newBuilder();
        ctwBuilder.setAppendContinuation(newBrowseContinuation);
        String newTypeWrapper = encodeContinuation(ctwBuilder.build().toByteArray());

        BrowseContinuationWrapper.Builder bcwBuilder = BrowseContinuationWrapper.newBuilder();
        bcwBuilder.setBrowseId("FEwhat_to_watch");
        bcwBuilder.setEncodedAction(newTypeWrapper);
        bcwBuilder.setTargetId("browse-feedFEwhat_to_watch");
        BrowseContinuationWrapper newInnerWrapper = bcwBuilder.build();

        ContinuationWrapper.Builder cwBuilder = ContinuationWrapper.newBuilder();
        cwBuilder.setBrowseContinuation(newInnerWrapper);
        String newOuterWrapper = encodeContinuation(cwBuilder.build().toByteArray());

        return newOuterWrapper;
    }

    /**
     * Decode a continuation for internal use.
     */
    protected static byte[] decodeContinuation(String base64Continuation)
    {
        return Base64.getUrlDecoder().decode(base64Continuation.replaceAll("%3D", ""));
    }

    /**
     * Encode a continuation for internal use.
     */
    protected static String encodeContinuation(byte[] raw)
    {
        return Base64.getUrlEncoder().withoutPadding().encodeToString(raw);
    }
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: continuation_wrapper.proto

package com.google.protos.youtube.api.innertube;

public final class ContinuationWrapperOuterClass {
  private ContinuationWrapperOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ContinuationWrapperOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.google.protos.youtube.api.innertube.ContinuationWrapper)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * internal id for browse continuation wrapper
     * </pre>
     *
     * <code>.com.google.protos.youtube.api.innertube.BrowseContinuationWrapper browse_continuation = 80226972;</code>
     * @return Whether the browseContinuation field is set.
     */
    boolean hasBrowseContinuation();
    /**
     * <pre>
     * internal id for browse continuation wrapper
     * </pre>
     *
     * <code>.com.google.protos.youtube.api.innertube.BrowseContinuationWrapper browse_continuation = 80226972;</code>
     * @return The browseContinuation.
     */
    com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper getBrowseContinuation();
    /**
     * <pre>
     * internal id for browse continuation wrapper
     * </pre>
     *
     * <code>.com.google.protos.youtube.api.innertube.BrowseContinuationWrapper browse_continuation = 80226972;</code>
     */
    com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapperOrBuilder getBrowseContinuationOrBuilder();
  }
  /**
   * Protobuf type {@code com.google.protos.youtube.api.innertube.ContinuationWrapper}
   */
  public static final class ContinuationWrapper extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.google.protos.youtube.api.innertube.ContinuationWrapper)
      ContinuationWrapperOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ContinuationWrapper.newBuilder() to construct.
    private ContinuationWrapper(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ContinuationWrapper() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ContinuationWrapper();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ContinuationWrapper(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 641815778: {
              com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper.Builder subBuilder = null;
              if (browseContinuation_ != null) {
                subBuilder = browseContinuation_.toBuilder();
              }
              browseContinuation_ = input.readMessage(com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(browseContinuation_);
                browseContinuation_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.internal_static_com_google_protos_youtube_api_innertube_ContinuationWrapper_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.internal_static_com_google_protos_youtube_api_innertube_ContinuationWrapper_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper.class, com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper.Builder.class);
    }

    public static final int BROWSE_CONTINUATION_FIELD_NUMBER = 80226972;
    private com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper browseContinuation_;
    /**
     * <pre>
     * internal id for browse continuation wrapper
     * </pre>
     *
     * <code>.com.google.protos.youtube.api.innertube.BrowseContinuationWrapper browse_continuation = 80226972;</code>
     * @return Whether the browseContinuation field is set.
     */
    @java.lang.Override
    public boolean hasBrowseContinuation() {
      return browseContinuation_ != null;
    }
    /**
     * <pre>
     * internal id for browse continuation wrapper
     * </pre>
     *
     * <code>.com.google.protos.youtube.api.innertube.BrowseContinuationWrapper browse_continuation = 80226972;</code>
     * @return The browseContinuation.
     */
    @java.lang.Override
    public com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper getBrowseContinuation() {
      return browseContinuation_ == null ? com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper.getDefaultInstance() : browseContinuation_;
    }
    /**
     * <pre>
     * internal id for browse continuation wrapper
     * </pre>
     *
     * <code>.com.google.protos.youtube.api.innertube.BrowseContinuationWrapper browse_continuation = 80226972;</code>
     */
    @java.lang.Override
    public com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapperOrBuilder getBrowseContinuationOrBuilder() {
      return getBrowseContinuation();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (browseContinuation_ != null) {
        output.writeMessage(80226972, getBrowseContinuation());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (browseContinuation_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(80226972, getBrowseContinuation());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper)) {
        return super.equals(obj);
      }
      com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper other = (com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper) obj;

      if (hasBrowseContinuation() != other.hasBrowseContinuation()) return false;
      if (hasBrowseContinuation()) {
        if (!getBrowseContinuation()
            .equals(other.getBrowseContinuation())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasBrowseContinuation()) {
        hash = (37 * hash) + BROWSE_CONTINUATION_FIELD_NUMBER;
        hash = (53 * hash) + getBrowseContinuation().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.google.protos.youtube.api.innertube.ContinuationWrapper}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.google.protos.youtube.api.innertube.ContinuationWrapper)
        com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapperOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.internal_static_com_google_protos_youtube_api_innertube_ContinuationWrapper_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.internal_static_com_google_protos_youtube_api_innertube_ContinuationWrapper_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper.class, com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper.Builder.class);
      }

      // Construct using com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (browseContinuationBuilder_ == null) {
          browseContinuation_ = null;
        } else {
          browseContinuation_ = null;
          browseContinuationBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.internal_static_com_google_protos_youtube_api_innertube_ContinuationWrapper_descriptor;
      }

      @java.lang.Override
      public com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper getDefaultInstanceForType() {
        return com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper.getDefaultInstance();
      }

      @java.lang.Override
      public com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper build() {
        com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper buildPartial() {
        com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper result = new com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper(this);
        if (browseContinuationBuilder_ == null) {
          result.browseContinuation_ = browseContinuation_;
        } else {
          result.browseContinuation_ = browseContinuationBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper) {
          return mergeFrom((com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper other) {
        if (other == com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper.getDefaultInstance()) return this;
        if (other.hasBrowseContinuation()) {
          mergeBrowseContinuation(other.getBrowseContinuation());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper browseContinuation_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper, com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper.Builder, com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapperOrBuilder> browseContinuationBuilder_;
      /**
       * <pre>
       * internal id for browse continuation wrapper
       * </pre>
       *
       * <code>.com.google.protos.youtube.api.innertube.BrowseContinuationWrapper browse_continuation = 80226972;</code>
       * @return Whether the browseContinuation field is set.
       */
      public boolean hasBrowseContinuation() {
        return browseContinuationBuilder_ != null || browseContinuation_ != null;
      }
      /**
       * <pre>
       * internal id for browse continuation wrapper
       * </pre>
       *
       * <code>.com.google.protos.youtube.api.innertube.BrowseContinuationWrapper browse_continuation = 80226972;</code>
       * @return The browseContinuation.
       */
      public com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper getBrowseContinuation() {
        if (browseContinuationBuilder_ == null) {
          return browseContinuation_ == null ? com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper.getDefaultInstance() : browseContinuation_;
        } else {
          return browseContinuationBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * internal id for browse continuation wrapper
       * </pre>
       *
       * <code>.com.google.protos.youtube.api.innertube.BrowseContinuationWrapper browse_continuation = 80226972;</code>
       */
      public Builder setBrowseContinuation(com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper value) {
        if (browseContinuationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          browseContinuation_ = value;
          onChanged();
        } else {
          browseContinuationBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * internal id for browse continuation wrapper
       * </pre>
       *
       * <code>.com.google.protos.youtube.api.innertube.BrowseContinuationWrapper browse_continuation = 80226972;</code>
       */
      public Builder setBrowseContinuation(
          com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper.Builder builderForValue) {
        if (browseContinuationBuilder_ == null) {
          browseContinuation_ = builderForValue.build();
          onChanged();
        } else {
          browseContinuationBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * internal id for browse continuation wrapper
       * </pre>
       *
       * <code>.com.google.protos.youtube.api.innertube.BrowseContinuationWrapper browse_continuation = 80226972;</code>
       */
      public Builder mergeBrowseContinuation(com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper value) {
        if (browseContinuationBuilder_ == null) {
          if (browseContinuation_ != null) {
            browseContinuation_ =
              com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper.newBuilder(browseContinuation_).mergeFrom(value).buildPartial();
          } else {
            browseContinuation_ = value;
          }
          onChanged();
        } else {
          browseContinuationBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * internal id for browse continuation wrapper
       * </pre>
       *
       * <code>.com.google.protos.youtube.api.innertube.BrowseContinuationWrapper browse_continuation = 80226972;</code>
       */
      public Builder clearBrowseContinuation() {
        if (browseContinuationBuilder_ == null) {
          browseContinuation_ = null;
          onChanged();
        } else {
          browseContinuation_ = null;
          browseContinuationBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * internal id for browse continuation wrapper
       * </pre>
       *
       * <code>.com.google.protos.youtube.api.innertube.BrowseContinuationWrapper browse_continuation = 80226972;</code>
       */
      public com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper.Builder getBrowseContinuationBuilder() {
        
        onChanged();
        return getBrowseContinuationFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * internal id for browse continuation wrapper
       * </pre>
       *
       * <code>.com.google.protos.youtube.api.innertube.BrowseContinuationWrapper browse_continuation = 80226972;</code>
       */
      public com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapperOrBuilder getBrowseContinuationOrBuilder() {
        if (browseContinuationBuilder_ != null) {
          return browseContinuationBuilder_.getMessageOrBuilder();
        } else {
          return browseContinuation_ == null ?
              com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper.getDefaultInstance() : browseContinuation_;
        }
      }
      /**
       * <pre>
       * internal id for browse continuation wrapper
       * </pre>
       *
       * <code>.com.google.protos.youtube.api.innertube.BrowseContinuationWrapper browse_continuation = 80226972;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper, com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper.Builder, com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapperOrBuilder> 
          getBrowseContinuationFieldBuilder() {
        if (browseContinuationBuilder_ == null) {
          browseContinuationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper, com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapper.Builder, com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.BrowseContinuationWrapperOrBuilder>(
                  getBrowseContinuation(),
                  getParentForChildren(),
                  isClean());
          browseContinuation_ = null;
        }
        return browseContinuationBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.google.protos.youtube.api.innertube.ContinuationWrapper)
    }

    // @@protoc_insertion_point(class_scope:com.google.protos.youtube.api.innertube.ContinuationWrapper)
    private static final com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper();
    }

    public static com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ContinuationWrapper>
        PARSER = new com.google.protobuf.AbstractParser<ContinuationWrapper>() {
      @java.lang.Override
      public ContinuationWrapper parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ContinuationWrapper(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ContinuationWrapper> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ContinuationWrapper> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protos.youtube.api.innertube.ContinuationWrapperOuterClass.ContinuationWrapper getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_google_protos_youtube_api_innertube_ContinuationWrapper_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_google_protos_youtube_api_innertube_ContinuationWrapper_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032continuation_wrapper.proto\022\'com.google" +
      ".protos.youtube.api.innertube\032\031browse_co" +
      "ntinuation.proto\"y\n\023ContinuationWrapper\022" +
      "b\n\023browse_continuation\030\234\325\240& \001(\0132B.com.go" +
      "ogle.protos.youtube.api.innertube.Browse" +
      "ContinuationWrapperb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.getDescriptor(),
        });
    internal_static_com_google_protos_youtube_api_innertube_ContinuationWrapper_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_google_protos_youtube_api_innertube_ContinuationWrapper_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_google_protos_youtube_api_innertube_ContinuationWrapper_descriptor,
        new java.lang.String[] { "BrowseContinuation", });
    com.google.protos.youtube.api.innertube.BrowseContinuationOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

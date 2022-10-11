# YouTube WEB v2 Shelves

It's possible to force the InnerTube WEB v2 client to return a list of categorised shelves, like v1 had, by modifying an MWEB continuation. This has a few benefits over the ANDROID/IOS APIs.

The continuations are stored in Protocol Buffers, which must be compiled to a target language in order to be interfaced with. I have included semi-documented protos, as well as a Java implementation in this project.

The protos can be compiled with the `protoc` tool. But everything should also be included in the Java folder for use.

## How to use

You'll need to make two network requests to make this possible. First off, a browse request with this signature:

```js
{
    "client": {
        "clientName": "IOS",
        "clientVersion": "17.02"
    },
    "browseId": "FEwhat_to_watch"
}
```

From this request, you must extract the *reload* continuation renderer from the browse results. Once you do that, you can run

```java
String webContinuation = WebV2Shelves.continuationToWeb(baseContinuation);
```

to convert the original continuation to a web one. Then make a WEB v2 browse request like such:

```js
{
    "client": {
        "clientName": "WEB",
        "clientVersion": "2.20221011"
    },
    "continuation": baseContinuation
}
```

and you should get a set of rich shelves!
<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: browse_continuation.proto

namespace Com\Google\Protos\Youtube\Api\Innertube;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Stores information about the action timing. 
 *
 * Generated from protobuf message <code>com.google.protos.youtube.api.innertube.BrowseContinuationActionTiming</code>
 */
class BrowseContinuationActionTiming extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>int64 timestamp = 1;</code>
     */
    protected $timestamp = 0;
    /**
     * Generated from protobuf field <code>fixed64 a = 2;</code>
     */
    protected $a = 0;
    /**
     * Generated from protobuf field <code>fixed64 b = 3;</code>
     */
    protected $b = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int|string $timestamp
     *     @type int|string $a
     *     @type int|string $b
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\BrowseContinuation::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>int64 timestamp = 1;</code>
     * @return int|string
     */
    public function getTimestamp()
    {
        return $this->timestamp;
    }

    /**
     * Generated from protobuf field <code>int64 timestamp = 1;</code>
     * @param int|string $var
     * @return $this
     */
    public function setTimestamp($var)
    {
        GPBUtil::checkInt64($var);
        $this->timestamp = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>fixed64 a = 2;</code>
     * @return int|string
     */
    public function getA()
    {
        return $this->a;
    }

    /**
     * Generated from protobuf field <code>fixed64 a = 2;</code>
     * @param int|string $var
     * @return $this
     */
    public function setA($var)
    {
        GPBUtil::checkUint64($var);
        $this->a = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>fixed64 b = 3;</code>
     * @return int|string
     */
    public function getB()
    {
        return $this->b;
    }

    /**
     * Generated from protobuf field <code>fixed64 b = 3;</code>
     * @param int|string $var
     * @return $this
     */
    public function setB($var)
    {
        GPBUtil::checkUint64($var);
        $this->b = $var;

        return $this;
    }

}


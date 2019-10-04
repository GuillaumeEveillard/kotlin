// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

/**
 * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin}
 */
public final class IrStatementOrigin extends
    org.jetbrains.kotlin.protobuf.GeneratedMessageLite implements
    // @@protoc_insertion_point(message_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin)
    IrStatementOriginOrBuilder {
  // Use IrStatementOrigin.newBuilder() to construct.
  private IrStatementOrigin(org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private IrStatementOrigin(boolean noInit) { this.unknownFields = org.jetbrains.kotlin.protobuf.ByteString.EMPTY;}

  private static final IrStatementOrigin defaultInstance;
  public static IrStatementOrigin getDefaultInstance() {
    return defaultInstance;
  }

  public IrStatementOrigin getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final org.jetbrains.kotlin.protobuf.ByteString unknownFields;
  private IrStatementOrigin(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    initFields();
    int mutable_bitField0_ = 0;
    org.jetbrains.kotlin.protobuf.ByteString.Output unknownFieldsOutput =
        org.jetbrains.kotlin.protobuf.ByteString.newOutput();
    org.jetbrains.kotlin.protobuf.CodedOutputStream unknownFieldsCodedOutput =
        org.jetbrains.kotlin.protobuf.CodedOutputStream.newInstance(
            unknownFieldsOutput, 1);
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(input, unknownFieldsCodedOutput,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = name_.toBuilder();
            }
            name_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(name_);
              name_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
        }
      }
    } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      try {
        unknownFieldsCodedOutput.flush();
      } catch (java.io.IOException e) {
      // Should not happen
      } finally {
        unknownFields = unknownFieldsOutput.toByteString();
      }
      makeExtensionsImmutable();
    }
  }
  public static org.jetbrains.kotlin.protobuf.Parser<IrStatementOrigin> PARSER =
      new org.jetbrains.kotlin.protobuf.AbstractParser<IrStatementOrigin>() {
    public IrStatementOrigin parsePartialFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
      return new IrStatementOrigin(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public org.jetbrains.kotlin.protobuf.Parser<IrStatementOrigin> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name_;
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name = 1;</code>
   */
  public boolean hasName() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name = 1;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex getName() {
    return name_;
  }

  private void initFields() {
    name_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.getDefaultInstance();
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasName()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getName().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(org.jetbrains.kotlin.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, name_);
    }
    output.writeRawBytes(unknownFields);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(1, name_);
    }
    size += unknownFields.size();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin parseFrom(byte[] data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin parseFrom(
      byte[] data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin parseFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin parseDelimitedFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  /**
   * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin}
   */
  public static final class Builder extends
      org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder<
        org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin, Builder>
      implements
      // @@protoc_insertion_point(builder_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin)
      org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOriginOrBuilder {
    // Construct using org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      name_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin getDefaultInstanceForType() {
      return org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin.getDefaultInstance();
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin build() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin buildPartial() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin result = new org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.name_ = name_;
      result.bitField0_ = to_bitField0_;
      return result;
    }

    public Builder mergeFrom(org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin other) {
      if (other == org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin.getDefaultInstance()) return this;
      if (other.hasName()) {
        mergeName(other.getName());
      }
      setUnknownFields(
          getUnknownFields().concat(other.unknownFields));
      return this;
    }

    public final boolean isInitialized() {
      if (!hasName()) {
        
        return false;
      }
      if (!getName().isInitialized()) {
        
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.getDefaultInstance();
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name = 1;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex getName() {
      return name_;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name = 1;</code>
     */
    public Builder setName(org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name = 1;</code>
     */
    public Builder setName(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.Builder builderForValue) {
      name_ = builderForValue.build();

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name = 1;</code>
     */
    public Builder mergeName(org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex value) {
      if (((bitField0_ & 0x00000001) == 0x00000001) &&
          name_ != org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.getDefaultInstance()) {
        name_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.newBuilder(name_).mergeFrom(value).buildPartial();
      } else {
        name_ = value;
      }

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name = 1;</code>
     */
    public Builder clearName() {
      name_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin)
  }

  static {
    defaultInstance = new IrStatementOrigin(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin)
}

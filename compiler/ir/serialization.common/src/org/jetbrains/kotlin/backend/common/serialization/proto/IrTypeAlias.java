// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

/**
 * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias}
 */
public final class IrTypeAlias extends
    org.jetbrains.kotlin.protobuf.GeneratedMessageLite implements
    // @@protoc_insertion_point(message_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias)
    IrTypeAliasOrBuilder {
  // Use IrTypeAlias.newBuilder() to construct.
  private IrTypeAlias(org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private IrTypeAlias(boolean noInit) { this.unknownFields = org.jetbrains.kotlin.protobuf.ByteString.EMPTY;}

  private static final IrTypeAlias defaultInstance;
  public static IrTypeAlias getDefaultInstance() {
    return defaultInstance;
  }

  public IrTypeAlias getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final org.jetbrains.kotlin.protobuf.ByteString unknownFields;
  private IrTypeAlias(
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
            org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = base_.toBuilder();
            }
            base_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(base_);
              base_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              subBuilder = name_.toBuilder();
            }
            name_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(name_);
              name_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
          case 26: {
            org.jetbrains.kotlin.backend.common.serialization.proto.Visibility.Builder subBuilder = null;
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
              subBuilder = visibility_.toBuilder();
            }
            visibility_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.Visibility.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(visibility_);
              visibility_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000004;
            break;
          }
          case 34: {
            org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer.Builder subBuilder = null;
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
              subBuilder = typeParameters_.toBuilder();
            }
            typeParameters_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(typeParameters_);
              typeParameters_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000008;
            break;
          }
          case 42: {
            org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.Builder subBuilder = null;
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
              subBuilder = expandedType_.toBuilder();
            }
            expandedType_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(expandedType_);
              expandedType_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000010;
            break;
          }
          case 48: {
            bitField0_ |= 0x00000020;
            isActual_ = input.readBool();
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
  public static org.jetbrains.kotlin.protobuf.Parser<IrTypeAlias> PARSER =
      new org.jetbrains.kotlin.protobuf.AbstractParser<IrTypeAlias>() {
    public IrTypeAlias parsePartialFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
      return new IrTypeAlias(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public org.jetbrains.kotlin.protobuf.Parser<IrTypeAlias> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int BASE_FIELD_NUMBER = 1;
  private org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase base_;
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase base = 1;</code>
   */
  public boolean hasBase() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase base = 1;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase getBase() {
    return base_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name_;
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name = 2;</code>
   */
  public boolean hasName() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name = 2;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex getName() {
    return name_;
  }

  public static final int VISIBILITY_FIELD_NUMBER = 3;
  private org.jetbrains.kotlin.backend.common.serialization.proto.Visibility visibility_;
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Visibility visibility = 3;</code>
   */
  public boolean hasVisibility() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Visibility visibility = 3;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.Visibility getVisibility() {
    return visibility_;
  }

  public static final int TYPE_PARAMETERS_FIELD_NUMBER = 4;
  private org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer typeParameters_;
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer type_parameters = 4;</code>
   */
  public boolean hasTypeParameters() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer type_parameters = 4;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer getTypeParameters() {
    return typeParameters_;
  }

  public static final int EXPANDED_TYPE_FIELD_NUMBER = 5;
  private org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex expandedType_;
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex expanded_type = 5;</code>
   */
  public boolean hasExpandedType() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex expanded_type = 5;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex getExpandedType() {
    return expandedType_;
  }

  public static final int IS_ACTUAL_FIELD_NUMBER = 6;
  private boolean isActual_;
  /**
   * <code>required bool is_actual = 6;</code>
   */
  public boolean hasIsActual() {
    return ((bitField0_ & 0x00000020) == 0x00000020);
  }
  /**
   * <code>required bool is_actual = 6;</code>
   */
  public boolean getIsActual() {
    return isActual_;
  }

  private void initFields() {
    base_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase.getDefaultInstance();
    name_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.getDefaultInstance();
    visibility_ = org.jetbrains.kotlin.backend.common.serialization.proto.Visibility.getDefaultInstance();
    typeParameters_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer.getDefaultInstance();
    expandedType_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.getDefaultInstance();
    isActual_ = false;
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasBase()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasName()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasVisibility()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasTypeParameters()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasExpandedType()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasIsActual()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getBase().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getName().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getVisibility().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getTypeParameters().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getExpandedType().isInitialized()) {
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
      output.writeMessage(1, base_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, name_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(3, visibility_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeMessage(4, typeParameters_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeMessage(5, expandedType_);
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      output.writeBool(6, isActual_);
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
        .computeMessageSize(1, base_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(2, name_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(3, visibility_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(4, typeParameters_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(5, expandedType_);
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeBoolSize(6, isActual_);
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

  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias parseFrom(byte[] data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias parseFrom(
      byte[] data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias parseFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias parseDelimitedFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  /**
   * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias}
   */
  public static final class Builder extends
      org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder<
        org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias, Builder>
      implements
      // @@protoc_insertion_point(builder_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias)
      org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAliasOrBuilder {
    // Construct using org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias.newBuilder()
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
      base_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000002);
      visibility_ = org.jetbrains.kotlin.backend.common.serialization.proto.Visibility.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000004);
      typeParameters_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000008);
      expandedType_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000010);
      isActual_ = false;
      bitField0_ = (bitField0_ & ~0x00000020);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias getDefaultInstanceForType() {
      return org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias.getDefaultInstance();
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias build() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias buildPartial() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias result = new org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.base_ = base_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.name_ = name_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.visibility_ = visibility_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.typeParameters_ = typeParameters_;
      if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
        to_bitField0_ |= 0x00000010;
      }
      result.expandedType_ = expandedType_;
      if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
        to_bitField0_ |= 0x00000020;
      }
      result.isActual_ = isActual_;
      result.bitField0_ = to_bitField0_;
      return result;
    }

    public Builder mergeFrom(org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias other) {
      if (other == org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias.getDefaultInstance()) return this;
      if (other.hasBase()) {
        mergeBase(other.getBase());
      }
      if (other.hasName()) {
        mergeName(other.getName());
      }
      if (other.hasVisibility()) {
        mergeVisibility(other.getVisibility());
      }
      if (other.hasTypeParameters()) {
        mergeTypeParameters(other.getTypeParameters());
      }
      if (other.hasExpandedType()) {
        mergeExpandedType(other.getExpandedType());
      }
      if (other.hasIsActual()) {
        setIsActual(other.getIsActual());
      }
      setUnknownFields(
          getUnknownFields().concat(other.unknownFields));
      return this;
    }

    public final boolean isInitialized() {
      if (!hasBase()) {
        
        return false;
      }
      if (!hasName()) {
        
        return false;
      }
      if (!hasVisibility()) {
        
        return false;
      }
      if (!hasTypeParameters()) {
        
        return false;
      }
      if (!hasExpandedType()) {
        
        return false;
      }
      if (!hasIsActual()) {
        
        return false;
      }
      if (!getBase().isInitialized()) {
        
        return false;
      }
      if (!getName().isInitialized()) {
        
        return false;
      }
      if (!getVisibility().isInitialized()) {
        
        return false;
      }
      if (!getTypeParameters().isInitialized()) {
        
        return false;
      }
      if (!getExpandedType().isInitialized()) {
        
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase base_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase.getDefaultInstance();
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase base = 1;</code>
     */
    public boolean hasBase() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase base = 1;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase getBase() {
      return base_;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase base = 1;</code>
     */
    public Builder setBase(org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase value) {
      if (value == null) {
        throw new NullPointerException();
      }
      base_ = value;

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase base = 1;</code>
     */
    public Builder setBase(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase.Builder builderForValue) {
      base_ = builderForValue.build();

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase base = 1;</code>
     */
    public Builder mergeBase(org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase value) {
      if (((bitField0_ & 0x00000001) == 0x00000001) &&
          base_ != org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase.getDefaultInstance()) {
        base_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase.newBuilder(base_).mergeFrom(value).buildPartial();
      } else {
        base_ = value;
      }

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase base = 1;</code>
     */
    public Builder clearBase() {
      base_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    private org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.getDefaultInstance();
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name = 2;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name = 2;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex getName() {
      return name_;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name = 2;</code>
     */
    public Builder setName(org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;

      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name = 2;</code>
     */
    public Builder setName(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.Builder builderForValue) {
      name_ = builderForValue.build();

      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name = 2;</code>
     */
    public Builder mergeName(org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex value) {
      if (((bitField0_ & 0x00000002) == 0x00000002) &&
          name_ != org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.getDefaultInstance()) {
        name_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.newBuilder(name_).mergeFrom(value).buildPartial();
      } else {
        name_ = value;
      }

      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name = 2;</code>
     */
    public Builder clearName() {
      name_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    private org.jetbrains.kotlin.backend.common.serialization.proto.Visibility visibility_ = org.jetbrains.kotlin.backend.common.serialization.proto.Visibility.getDefaultInstance();
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Visibility visibility = 3;</code>
     */
    public boolean hasVisibility() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Visibility visibility = 3;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.Visibility getVisibility() {
      return visibility_;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Visibility visibility = 3;</code>
     */
    public Builder setVisibility(org.jetbrains.kotlin.backend.common.serialization.proto.Visibility value) {
      if (value == null) {
        throw new NullPointerException();
      }
      visibility_ = value;

      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Visibility visibility = 3;</code>
     */
    public Builder setVisibility(
        org.jetbrains.kotlin.backend.common.serialization.proto.Visibility.Builder builderForValue) {
      visibility_ = builderForValue.build();

      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Visibility visibility = 3;</code>
     */
    public Builder mergeVisibility(org.jetbrains.kotlin.backend.common.serialization.proto.Visibility value) {
      if (((bitField0_ & 0x00000004) == 0x00000004) &&
          visibility_ != org.jetbrains.kotlin.backend.common.serialization.proto.Visibility.getDefaultInstance()) {
        visibility_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.Visibility.newBuilder(visibility_).mergeFrom(value).buildPartial();
      } else {
        visibility_ = value;
      }

      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Visibility visibility = 3;</code>
     */
    public Builder clearVisibility() {
      visibility_ = org.jetbrains.kotlin.backend.common.serialization.proto.Visibility.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    private org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer typeParameters_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer.getDefaultInstance();
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer type_parameters = 4;</code>
     */
    public boolean hasTypeParameters() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer type_parameters = 4;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer getTypeParameters() {
      return typeParameters_;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer type_parameters = 4;</code>
     */
    public Builder setTypeParameters(org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer value) {
      if (value == null) {
        throw new NullPointerException();
      }
      typeParameters_ = value;

      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer type_parameters = 4;</code>
     */
    public Builder setTypeParameters(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer.Builder builderForValue) {
      typeParameters_ = builderForValue.build();

      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer type_parameters = 4;</code>
     */
    public Builder mergeTypeParameters(org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer value) {
      if (((bitField0_ & 0x00000008) == 0x00000008) &&
          typeParameters_ != org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer.getDefaultInstance()) {
        typeParameters_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer.newBuilder(typeParameters_).mergeFrom(value).buildPartial();
      } else {
        typeParameters_ = value;
      }

      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer type_parameters = 4;</code>
     */
    public Builder clearTypeParameters() {
      typeParameters_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    private org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex expandedType_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.getDefaultInstance();
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex expanded_type = 5;</code>
     */
    public boolean hasExpandedType() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex expanded_type = 5;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex getExpandedType() {
      return expandedType_;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex expanded_type = 5;</code>
     */
    public Builder setExpandedType(org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex value) {
      if (value == null) {
        throw new NullPointerException();
      }
      expandedType_ = value;

      bitField0_ |= 0x00000010;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex expanded_type = 5;</code>
     */
    public Builder setExpandedType(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.Builder builderForValue) {
      expandedType_ = builderForValue.build();

      bitField0_ |= 0x00000010;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex expanded_type = 5;</code>
     */
    public Builder mergeExpandedType(org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex value) {
      if (((bitField0_ & 0x00000010) == 0x00000010) &&
          expandedType_ != org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.getDefaultInstance()) {
        expandedType_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.newBuilder(expandedType_).mergeFrom(value).buildPartial();
      } else {
        expandedType_ = value;
      }

      bitField0_ |= 0x00000010;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex expanded_type = 5;</code>
     */
    public Builder clearExpandedType() {
      expandedType_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    private boolean isActual_ ;
    /**
     * <code>required bool is_actual = 6;</code>
     */
    public boolean hasIsActual() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>required bool is_actual = 6;</code>
     */
    public boolean getIsActual() {
      return isActual_;
    }
    /**
     * <code>required bool is_actual = 6;</code>
     */
    public Builder setIsActual(boolean value) {
      bitField0_ |= 0x00000020;
      isActual_ = value;
      
      return this;
    }
    /**
     * <code>required bool is_actual = 6;</code>
     */
    public Builder clearIsActual() {
      bitField0_ = (bitField0_ & ~0x00000020);
      isActual_ = false;
      
      return this;
    }

    // @@protoc_insertion_point(builder_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias)
  }

  static {
    defaultInstance = new IrTypeAlias(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias)
}

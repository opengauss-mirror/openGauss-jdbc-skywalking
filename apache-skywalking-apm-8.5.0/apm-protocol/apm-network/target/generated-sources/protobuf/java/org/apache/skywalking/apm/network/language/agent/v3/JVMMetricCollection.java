// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/JVMMetric.proto

package org.apache.skywalking.apm.network.language.agent.v3;

/**
 * Protobuf type {@code skywalking.v3.JVMMetricCollection}
 */
public final class JVMMetricCollection extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:skywalking.v3.JVMMetricCollection)
    JVMMetricCollectionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JVMMetricCollection.newBuilder() to construct.
  private JVMMetricCollection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JVMMetricCollection() {
    metrics_ = java.util.Collections.emptyList();
    service_ = "";
    serviceInstance_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JVMMetricCollection();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JVMMetricCollection(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              metrics_ = new java.util.ArrayList<org.apache.skywalking.apm.network.language.agent.v3.JVMMetric>();
              mutable_bitField0_ |= 0x00000001;
            }
            metrics_.add(
                input.readMessage(org.apache.skywalking.apm.network.language.agent.v3.JVMMetric.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            service_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            serviceInstance_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        metrics_ = java.util.Collections.unmodifiableList(metrics_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.skywalking.apm.network.language.agent.v3.JVMMetricOuterClass.internal_static_skywalking_v3_JVMMetricCollection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.skywalking.apm.network.language.agent.v3.JVMMetricOuterClass.internal_static_skywalking_v3_JVMMetricCollection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection.class, org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection.Builder.class);
  }

  public static final int METRICS_FIELD_NUMBER = 1;
  private java.util.List<org.apache.skywalking.apm.network.language.agent.v3.JVMMetric> metrics_;
  /**
   * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.apache.skywalking.apm.network.language.agent.v3.JVMMetric> getMetricsList() {
    return metrics_;
  }
  /**
   * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.apache.skywalking.apm.network.language.agent.v3.JVMMetricOrBuilder> 
      getMetricsOrBuilderList() {
    return metrics_;
  }
  /**
   * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
   */
  @java.lang.Override
  public int getMetricsCount() {
    return metrics_.size();
  }
  /**
   * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
   */
  @java.lang.Override
  public org.apache.skywalking.apm.network.language.agent.v3.JVMMetric getMetrics(int index) {
    return metrics_.get(index);
  }
  /**
   * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
   */
  @java.lang.Override
  public org.apache.skywalking.apm.network.language.agent.v3.JVMMetricOrBuilder getMetricsOrBuilder(
      int index) {
    return metrics_.get(index);
  }

  public static final int SERVICE_FIELD_NUMBER = 2;
  private volatile java.lang.Object service_;
  /**
   * <code>string service = 2;</code>
   * @return The service.
   */
  @java.lang.Override
  public java.lang.String getService() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      service_ = s;
      return s;
    }
  }
  /**
   * <code>string service = 2;</code>
   * @return The bytes for service.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServiceBytes() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      service_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICEINSTANCE_FIELD_NUMBER = 3;
  private volatile java.lang.Object serviceInstance_;
  /**
   * <code>string serviceInstance = 3;</code>
   * @return The serviceInstance.
   */
  @java.lang.Override
  public java.lang.String getServiceInstance() {
    java.lang.Object ref = serviceInstance_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceInstance_ = s;
      return s;
    }
  }
  /**
   * <code>string serviceInstance = 3;</code>
   * @return The bytes for serviceInstance.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServiceInstanceBytes() {
    java.lang.Object ref = serviceInstance_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceInstance_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < metrics_.size(); i++) {
      output.writeMessage(1, metrics_.get(i));
    }
    if (!getServiceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, service_);
    }
    if (!getServiceInstanceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, serviceInstance_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < metrics_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, metrics_.get(i));
    }
    if (!getServiceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, service_);
    }
    if (!getServiceInstanceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, serviceInstance_);
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
    if (!(obj instanceof org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection)) {
      return super.equals(obj);
    }
    org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection other = (org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection) obj;

    if (!getMetricsList()
        .equals(other.getMetricsList())) return false;
    if (!getService()
        .equals(other.getService())) return false;
    if (!getServiceInstance()
        .equals(other.getServiceInstance())) return false;
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
    if (getMetricsCount() > 0) {
      hash = (37 * hash) + METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getMetricsList().hashCode();
    }
    hash = (37 * hash) + SERVICE_FIELD_NUMBER;
    hash = (53 * hash) + getService().hashCode();
    hash = (37 * hash) + SERVICEINSTANCE_FIELD_NUMBER;
    hash = (53 * hash) + getServiceInstance().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection parseFrom(
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
  public static Builder newBuilder(org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection prototype) {
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
   * Protobuf type {@code skywalking.v3.JVMMetricCollection}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:skywalking.v3.JVMMetricCollection)
      org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.skywalking.apm.network.language.agent.v3.JVMMetricOuterClass.internal_static_skywalking_v3_JVMMetricCollection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.skywalking.apm.network.language.agent.v3.JVMMetricOuterClass.internal_static_skywalking_v3_JVMMetricCollection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection.class, org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection.Builder.class);
    }

    // Construct using org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection.newBuilder()
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
        getMetricsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (metricsBuilder_ == null) {
        metrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        metricsBuilder_.clear();
      }
      service_ = "";

      serviceInstance_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.skywalking.apm.network.language.agent.v3.JVMMetricOuterClass.internal_static_skywalking_v3_JVMMetricCollection_descriptor;
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection getDefaultInstanceForType() {
      return org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection build() {
      org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection buildPartial() {
      org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection result = new org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection(this);
      int from_bitField0_ = bitField0_;
      if (metricsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          metrics_ = java.util.Collections.unmodifiableList(metrics_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.metrics_ = metrics_;
      } else {
        result.metrics_ = metricsBuilder_.build();
      }
      result.service_ = service_;
      result.serviceInstance_ = serviceInstance_;
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
      if (other instanceof org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection) {
        return mergeFrom((org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection other) {
      if (other == org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection.getDefaultInstance()) return this;
      if (metricsBuilder_ == null) {
        if (!other.metrics_.isEmpty()) {
          if (metrics_.isEmpty()) {
            metrics_ = other.metrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMetricsIsMutable();
            metrics_.addAll(other.metrics_);
          }
          onChanged();
        }
      } else {
        if (!other.metrics_.isEmpty()) {
          if (metricsBuilder_.isEmpty()) {
            metricsBuilder_.dispose();
            metricsBuilder_ = null;
            metrics_ = other.metrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
            metricsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMetricsFieldBuilder() : null;
          } else {
            metricsBuilder_.addAllMessages(other.metrics_);
          }
        }
      }
      if (!other.getService().isEmpty()) {
        service_ = other.service_;
        onChanged();
      }
      if (!other.getServiceInstance().isEmpty()) {
        serviceInstance_ = other.serviceInstance_;
        onChanged();
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
      org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.apache.skywalking.apm.network.language.agent.v3.JVMMetric> metrics_ =
      java.util.Collections.emptyList();
    private void ensureMetricsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        metrics_ = new java.util.ArrayList<org.apache.skywalking.apm.network.language.agent.v3.JVMMetric>(metrics_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.skywalking.apm.network.language.agent.v3.JVMMetric, org.apache.skywalking.apm.network.language.agent.v3.JVMMetric.Builder, org.apache.skywalking.apm.network.language.agent.v3.JVMMetricOrBuilder> metricsBuilder_;

    /**
     * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
     */
    public java.util.List<org.apache.skywalking.apm.network.language.agent.v3.JVMMetric> getMetricsList() {
      if (metricsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(metrics_);
      } else {
        return metricsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
     */
    public int getMetricsCount() {
      if (metricsBuilder_ == null) {
        return metrics_.size();
      } else {
        return metricsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.v3.JVMMetric getMetrics(int index) {
      if (metricsBuilder_ == null) {
        return metrics_.get(index);
      } else {
        return metricsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
     */
    public Builder setMetrics(
        int index, org.apache.skywalking.apm.network.language.agent.v3.JVMMetric value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.set(index, value);
        onChanged();
      } else {
        metricsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
     */
    public Builder setMetrics(
        int index, org.apache.skywalking.apm.network.language.agent.v3.JVMMetric.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.set(index, builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
     */
    public Builder addMetrics(org.apache.skywalking.apm.network.language.agent.v3.JVMMetric value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.add(value);
        onChanged();
      } else {
        metricsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
     */
    public Builder addMetrics(
        int index, org.apache.skywalking.apm.network.language.agent.v3.JVMMetric value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.add(index, value);
        onChanged();
      } else {
        metricsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
     */
    public Builder addMetrics(
        org.apache.skywalking.apm.network.language.agent.v3.JVMMetric.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.add(builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
     */
    public Builder addMetrics(
        int index, org.apache.skywalking.apm.network.language.agent.v3.JVMMetric.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.add(index, builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
     */
    public Builder addAllMetrics(
        java.lang.Iterable<? extends org.apache.skywalking.apm.network.language.agent.v3.JVMMetric> values) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, metrics_);
        onChanged();
      } else {
        metricsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
     */
    public Builder clearMetrics() {
      if (metricsBuilder_ == null) {
        metrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        metricsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
     */
    public Builder removeMetrics(int index) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.remove(index);
        onChanged();
      } else {
        metricsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.v3.JVMMetric.Builder getMetricsBuilder(
        int index) {
      return getMetricsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.v3.JVMMetricOrBuilder getMetricsOrBuilder(
        int index) {
      if (metricsBuilder_ == null) {
        return metrics_.get(index);  } else {
        return metricsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
     */
    public java.util.List<? extends org.apache.skywalking.apm.network.language.agent.v3.JVMMetricOrBuilder> 
         getMetricsOrBuilderList() {
      if (metricsBuilder_ != null) {
        return metricsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(metrics_);
      }
    }
    /**
     * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.v3.JVMMetric.Builder addMetricsBuilder() {
      return getMetricsFieldBuilder().addBuilder(
          org.apache.skywalking.apm.network.language.agent.v3.JVMMetric.getDefaultInstance());
    }
    /**
     * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.v3.JVMMetric.Builder addMetricsBuilder(
        int index) {
      return getMetricsFieldBuilder().addBuilder(
          index, org.apache.skywalking.apm.network.language.agent.v3.JVMMetric.getDefaultInstance());
    }
    /**
     * <code>repeated .skywalking.v3.JVMMetric metrics = 1;</code>
     */
    public java.util.List<org.apache.skywalking.apm.network.language.agent.v3.JVMMetric.Builder> 
         getMetricsBuilderList() {
      return getMetricsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.skywalking.apm.network.language.agent.v3.JVMMetric, org.apache.skywalking.apm.network.language.agent.v3.JVMMetric.Builder, org.apache.skywalking.apm.network.language.agent.v3.JVMMetricOrBuilder> 
        getMetricsFieldBuilder() {
      if (metricsBuilder_ == null) {
        metricsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.apache.skywalking.apm.network.language.agent.v3.JVMMetric, org.apache.skywalking.apm.network.language.agent.v3.JVMMetric.Builder, org.apache.skywalking.apm.network.language.agent.v3.JVMMetricOrBuilder>(
                metrics_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        metrics_ = null;
      }
      return metricsBuilder_;
    }

    private java.lang.Object service_ = "";
    /**
     * <code>string service = 2;</code>
     * @return The service.
     */
    public java.lang.String getService() {
      java.lang.Object ref = service_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        service_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string service = 2;</code>
     * @return The bytes for service.
     */
    public com.google.protobuf.ByteString
        getServiceBytes() {
      java.lang.Object ref = service_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        service_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string service = 2;</code>
     * @param value The service to set.
     * @return This builder for chaining.
     */
    public Builder setService(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      service_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string service = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearService() {
      
      service_ = getDefaultInstance().getService();
      onChanged();
      return this;
    }
    /**
     * <code>string service = 2;</code>
     * @param value The bytes for service to set.
     * @return This builder for chaining.
     */
    public Builder setServiceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      service_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object serviceInstance_ = "";
    /**
     * <code>string serviceInstance = 3;</code>
     * @return The serviceInstance.
     */
    public java.lang.String getServiceInstance() {
      java.lang.Object ref = serviceInstance_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceInstance_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string serviceInstance = 3;</code>
     * @return The bytes for serviceInstance.
     */
    public com.google.protobuf.ByteString
        getServiceInstanceBytes() {
      java.lang.Object ref = serviceInstance_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceInstance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string serviceInstance = 3;</code>
     * @param value The serviceInstance to set.
     * @return This builder for chaining.
     */
    public Builder setServiceInstance(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serviceInstance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string serviceInstance = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearServiceInstance() {
      
      serviceInstance_ = getDefaultInstance().getServiceInstance();
      onChanged();
      return this;
    }
    /**
     * <code>string serviceInstance = 3;</code>
     * @param value The bytes for serviceInstance to set.
     * @return This builder for chaining.
     */
    public Builder setServiceInstanceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serviceInstance_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:skywalking.v3.JVMMetricCollection)
  }

  // @@protoc_insertion_point(class_scope:skywalking.v3.JVMMetricCollection)
  private static final org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection();
  }

  public static org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JVMMetricCollection>
      PARSER = new com.google.protobuf.AbstractParser<JVMMetricCollection>() {
    @java.lang.Override
    public JVMMetricCollection parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JVMMetricCollection(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JVMMetricCollection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JVMMetricCollection> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.skywalking.apm.network.language.agent.v3.JVMMetricCollection getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


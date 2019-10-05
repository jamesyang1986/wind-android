// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: plugin/hai_group_removeMember.proto

package com.windchat.proto.plugin;

public final class HaiGroupRemoveMemberProto {
  private HaiGroupRemoveMemberProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface HaiGroupRemoveMemberRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:plugin.HaiGroupRemoveMemberRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *群组ID
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    String getGroupId();
    /**
     * <pre>
     *群组ID
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getGroupIdBytes();

    /**
     * <pre>
     *需要删除的群组成员！！不能删除管理员
     * </pre>
     *
     * <code>repeated string group_member = 3;</code>
     */
    java.util.List<String>
        getGroupMemberList();
    /**
     * <pre>
     *需要删除的群组成员！！不能删除管理员
     * </pre>
     *
     * <code>repeated string group_member = 3;</code>
     */
    int getGroupMemberCount();
    /**
     * <pre>
     *需要删除的群组成员！！不能删除管理员
     * </pre>
     *
     * <code>repeated string group_member = 3;</code>
     */
    String getGroupMember(int index);
    /**
     * <pre>
     *需要删除的群组成员！！不能删除管理员
     * </pre>
     *
     * <code>repeated string group_member = 3;</code>
     */
    com.google.protobuf.ByteString
        getGroupMemberBytes(int index);
  }
  /**
   * <pre>
   **
   *删除群成员
   *----
   *接口名
   *----
   * /hai/group/removeMember
   *错误码
   *----
   *- success
   *- error.alert
   * </pre>
   *
   * Protobuf type {@code plugin.HaiGroupRemoveMemberRequest}
   */
  public  static final class HaiGroupRemoveMemberRequest extends
      com.google.protobuf.GeneratedMessageLite<
          HaiGroupRemoveMemberRequest, HaiGroupRemoveMemberRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:plugin.HaiGroupRemoveMemberRequest)
      HaiGroupRemoveMemberRequestOrBuilder {
    private HaiGroupRemoveMemberRequest() {
      groupId_ = "";
      groupMember_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }
    private int bitField0_;
    public static final int GROUP_ID_FIELD_NUMBER = 1;
    private String groupId_;
    /**
     * <pre>
     *群组ID
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    public String getGroupId() {
      return groupId_;
    }
    /**
     * <pre>
     *群组ID
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGroupIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(groupId_);
    }
    /**
     * <pre>
     *群组ID
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    private void setGroupId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      groupId_ = value;
    }
    /**
     * <pre>
     *群组ID
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    private void clearGroupId() {

      groupId_ = getDefaultInstance().getGroupId();
    }
    /**
     * <pre>
     *群组ID
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    private void setGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      groupId_ = value.toStringUtf8();
    }

    public static final int GROUP_MEMBER_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.ProtobufList<String> groupMember_;
    /**
     * <pre>
     *需要删除的群组成员！！不能删除管理员
     * </pre>
     *
     * <code>repeated string group_member = 3;</code>
     */
    public java.util.List<String> getGroupMemberList() {
      return groupMember_;
    }
    /**
     * <pre>
     *需要删除的群组成员！！不能删除管理员
     * </pre>
     *
     * <code>repeated string group_member = 3;</code>
     */
    public int getGroupMemberCount() {
      return groupMember_.size();
    }
    /**
     * <pre>
     *需要删除的群组成员！！不能删除管理员
     * </pre>
     *
     * <code>repeated string group_member = 3;</code>
     */
    public String getGroupMember(int index) {
      return groupMember_.get(index);
    }
    /**
     * <pre>
     *需要删除的群组成员！！不能删除管理员
     * </pre>
     *
     * <code>repeated string group_member = 3;</code>
     */
    public com.google.protobuf.ByteString
        getGroupMemberBytes(int index) {
      return com.google.protobuf.ByteString.copyFromUtf8(
          groupMember_.get(index));
    }
    private void ensureGroupMemberIsMutable() {
      if (!groupMember_.isModifiable()) {
        groupMember_ =
            com.google.protobuf.GeneratedMessageLite.mutableCopy(groupMember_);
       }
    }
    /**
     * <pre>
     *需要删除的群组成员！！不能删除管理员
     * </pre>
     *
     * <code>repeated string group_member = 3;</code>
     */
    private void setGroupMember(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureGroupMemberIsMutable();
      groupMember_.set(index, value);
    }
    /**
     * <pre>
     *需要删除的群组成员！！不能删除管理员
     * </pre>
     *
     * <code>repeated string group_member = 3;</code>
     */
    private void addGroupMember(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureGroupMemberIsMutable();
      groupMember_.add(value);
    }
    /**
     * <pre>
     *需要删除的群组成员！！不能删除管理员
     * </pre>
     *
     * <code>repeated string group_member = 3;</code>
     */
    private void addAllGroupMember(
        Iterable<String> values) {
      ensureGroupMemberIsMutable();
      com.google.protobuf.AbstractMessageLite.addAll(
          values, groupMember_);
    }
    /**
     * <pre>
     *需要删除的群组成员！！不能删除管理员
     * </pre>
     *
     * <code>repeated string group_member = 3;</code>
     */
    private void clearGroupMember() {
      groupMember_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }
    /**
     * <pre>
     *需要删除的群组成员！！不能删除管理员
     * </pre>
     *
     * <code>repeated string group_member = 3;</code>
     */
    private void addGroupMemberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureGroupMemberIsMutable();
      groupMember_.add(value.toStringUtf8());
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!groupId_.isEmpty()) {
        output.writeString(1, getGroupId());
      }
      for (int i = 0; i < groupMember_.size(); i++) {
        output.writeString(3, groupMember_.get(i));
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!groupId_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getGroupId());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < groupMember_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeStringSizeNoTag(groupMember_.get(i));
        }
        size += dataSize;
        size += 1 * getGroupMemberList().size();
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static HaiGroupRemoveMemberRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiGroupRemoveMemberRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiGroupRemoveMemberRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiGroupRemoveMemberRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiGroupRemoveMemberRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiGroupRemoveMemberRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiGroupRemoveMemberRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static HaiGroupRemoveMemberRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiGroupRemoveMemberRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiGroupRemoveMemberRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(HaiGroupRemoveMemberRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * <pre>
     **
     *删除群成员
     *----
     *接口名
     *----
     * /hai/group/removeMember
     *错误码
     *----
     *- success
     *- error.alert
     * </pre>
     *
     * Protobuf type {@code plugin.HaiGroupRemoveMemberRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          HaiGroupRemoveMemberRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:plugin.HaiGroupRemoveMemberRequest)
        HaiGroupRemoveMemberRequestOrBuilder {
      // Construct using com.windchat.proto.plugin.HaiGroupRemoveMemberProto.HaiGroupRemoveMemberRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *群组ID
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public String getGroupId() {
        return instance.getGroupId();
      }
      /**
       * <pre>
       *群组ID
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getGroupIdBytes() {
        return instance.getGroupIdBytes();
      }
      /**
       * <pre>
       *群组ID
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public Builder setGroupId(
          String value) {
        copyOnWrite();
        instance.setGroupId(value);
        return this;
      }
      /**
       * <pre>
       *群组ID
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public Builder clearGroupId() {
        copyOnWrite();
        instance.clearGroupId();
        return this;
      }
      /**
       * <pre>
       *群组ID
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public Builder setGroupIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setGroupIdBytes(value);
        return this;
      }

      /**
       * <pre>
       *需要删除的群组成员！！不能删除管理员
       * </pre>
       *
       * <code>repeated string group_member = 3;</code>
       */
      public java.util.List<String>
          getGroupMemberList() {
        return java.util.Collections.unmodifiableList(
            instance.getGroupMemberList());
      }
      /**
       * <pre>
       *需要删除的群组成员！！不能删除管理员
       * </pre>
       *
       * <code>repeated string group_member = 3;</code>
       */
      public int getGroupMemberCount() {
        return instance.getGroupMemberCount();
      }
      /**
       * <pre>
       *需要删除的群组成员！！不能删除管理员
       * </pre>
       *
       * <code>repeated string group_member = 3;</code>
       */
      public String getGroupMember(int index) {
        return instance.getGroupMember(index);
      }
      /**
       * <pre>
       *需要删除的群组成员！！不能删除管理员
       * </pre>
       *
       * <code>repeated string group_member = 3;</code>
       */
      public com.google.protobuf.ByteString
          getGroupMemberBytes(int index) {
        return instance.getGroupMemberBytes(index);
      }
      /**
       * <pre>
       *需要删除的群组成员！！不能删除管理员
       * </pre>
       *
       * <code>repeated string group_member = 3;</code>
       */
      public Builder setGroupMember(
          int index, String value) {
        copyOnWrite();
        instance.setGroupMember(index, value);
        return this;
      }
      /**
       * <pre>
       *需要删除的群组成员！！不能删除管理员
       * </pre>
       *
       * <code>repeated string group_member = 3;</code>
       */
      public Builder addGroupMember(
          String value) {
        copyOnWrite();
        instance.addGroupMember(value);
        return this;
      }
      /**
       * <pre>
       *需要删除的群组成员！！不能删除管理员
       * </pre>
       *
       * <code>repeated string group_member = 3;</code>
       */
      public Builder addAllGroupMember(
          Iterable<String> values) {
        copyOnWrite();
        instance.addAllGroupMember(values);
        return this;
      }
      /**
       * <pre>
       *需要删除的群组成员！！不能删除管理员
       * </pre>
       *
       * <code>repeated string group_member = 3;</code>
       */
      public Builder clearGroupMember() {
        copyOnWrite();
        instance.clearGroupMember();
        return this;
      }
      /**
       * <pre>
       *需要删除的群组成员！！不能删除管理员
       * </pre>
       *
       * <code>repeated string group_member = 3;</code>
       */
      public Builder addGroupMemberBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.addGroupMemberBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:plugin.HaiGroupRemoveMemberRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new HaiGroupRemoveMemberRequest();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          groupMember_.makeImmutable();
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          HaiGroupRemoveMemberRequest other = (HaiGroupRemoveMemberRequest) arg1;
          groupId_ = visitor.visitString(!groupId_.isEmpty(), groupId_,
              !other.groupId_.isEmpty(), other.groupId_);
          groupMember_= visitor.visitList(groupMember_, other.groupMember_);
          if (visitor == MergeFromVisitor
              .INSTANCE) {
            bitField0_ |= other.bitField0_;
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!input.skipField(tag)) {
                    done = true;
                  }
                  break;
                }
                case 10: {
                  String s = input.readStringRequireUtf8();

                  groupId_ = s;
                  break;
                }
                case 26: {
                  String s = input.readStringRequireUtf8();
                  if (!groupMember_.isModifiable()) {
                    groupMember_ =
                        com.google.protobuf.GeneratedMessageLite.mutableCopy(groupMember_);
                  }
                  groupMember_.add(s);
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (HaiGroupRemoveMemberRequest.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:plugin.HaiGroupRemoveMemberRequest)
    private static final HaiGroupRemoveMemberRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HaiGroupRemoveMemberRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static HaiGroupRemoveMemberRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<HaiGroupRemoveMemberRequest> PARSER;

    public static com.google.protobuf.Parser<HaiGroupRemoveMemberRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface HaiGroupRemoveMemberResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:plugin.HaiGroupRemoveMemberResponse)
      com.google.protobuf.MessageLiteOrBuilder {
  }
  /**
   * Protobuf type {@code plugin.HaiGroupRemoveMemberResponse}
   */
  public  static final class HaiGroupRemoveMemberResponse extends
      com.google.protobuf.GeneratedMessageLite<
          HaiGroupRemoveMemberResponse, HaiGroupRemoveMemberResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:plugin.HaiGroupRemoveMemberResponse)
      HaiGroupRemoveMemberResponseOrBuilder {
    private HaiGroupRemoveMemberResponse() {
    }
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      memoizedSerializedSize = size;
      return size;
    }

    public static HaiGroupRemoveMemberResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiGroupRemoveMemberResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiGroupRemoveMemberResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiGroupRemoveMemberResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiGroupRemoveMemberResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiGroupRemoveMemberResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiGroupRemoveMemberResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static HaiGroupRemoveMemberResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiGroupRemoveMemberResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiGroupRemoveMemberResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(HaiGroupRemoveMemberResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code plugin.HaiGroupRemoveMemberResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          HaiGroupRemoveMemberResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:plugin.HaiGroupRemoveMemberResponse)
        HaiGroupRemoveMemberResponseOrBuilder {
      // Construct using com.windchat.proto.plugin.HaiGroupRemoveMemberProto.HaiGroupRemoveMemberResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      // @@protoc_insertion_point(builder_scope:plugin.HaiGroupRemoveMemberResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new HaiGroupRemoveMemberResponse();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          HaiGroupRemoveMemberResponse other = (HaiGroupRemoveMemberResponse) arg1;
          if (visitor == MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!input.skipField(tag)) {
                    done = true;
                  }
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (HaiGroupRemoveMemberResponse.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:plugin.HaiGroupRemoveMemberResponse)
    private static final HaiGroupRemoveMemberResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HaiGroupRemoveMemberResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static HaiGroupRemoveMemberResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<HaiGroupRemoveMemberResponse> PARSER;

    public static com.google.protobuf.Parser<HaiGroupRemoveMemberResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
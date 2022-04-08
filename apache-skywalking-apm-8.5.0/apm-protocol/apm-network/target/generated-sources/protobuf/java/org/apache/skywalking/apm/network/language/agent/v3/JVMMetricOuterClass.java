// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/JVMMetric.proto

package org.apache.skywalking.apm.network.language.agent.v3;

public final class JVMMetricOuterClass {
  private JVMMetricOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_JVMMetricCollection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_JVMMetricCollection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_JVMMetric_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_JVMMetric_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_Memory_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_Memory_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_MemoryPool_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_MemoryPool_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_GC_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_GC_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_Thread_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_Thread_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036language-agent/JVMMetric.proto\022\rskywal" +
      "king.v3\032\023common/Common.proto\"j\n\023JVMMetri" +
      "cCollection\022)\n\007metrics\030\001 \003(\0132\030.skywalkin" +
      "g.v3.JVMMetric\022\017\n\007service\030\002 \001(\t\022\027\n\017servi" +
      "ceInstance\030\003 \001(\t\"\326\001\n\tJVMMetric\022\014\n\004time\030\001" +
      " \001(\003\022\037\n\003cpu\030\002 \001(\0132\022.skywalking.v3.CPU\022%\n" +
      "\006memory\030\003 \003(\0132\025.skywalking.v3.Memory\022-\n\n" +
      "memoryPool\030\004 \003(\0132\031.skywalking.v3.MemoryP" +
      "ool\022\035\n\002gc\030\005 \003(\0132\021.skywalking.v3.GC\022%\n\006th" +
      "read\030\006 \001(\0132\025.skywalking.v3.Thread\"T\n\006Mem" +
      "ory\022\016\n\006isHeap\030\001 \001(\010\022\014\n\004init\030\002 \001(\003\022\013\n\003max" +
      "\030\003 \001(\003\022\014\n\004used\030\004 \001(\003\022\021\n\tcommitted\030\005 \001(\003\"" +
      "o\n\nMemoryPool\022%\n\004type\030\001 \001(\0162\027.skywalking" +
      ".v3.PoolType\022\014\n\004init\030\002 \001(\003\022\013\n\003max\030\003 \001(\003\022" +
      "\014\n\004used\030\004 \001(\003\022\021\n\tcommitted\030\005 \001(\003\"J\n\002GC\022\'" +
      "\n\006phrase\030\001 \001(\0162\027.skywalking.v3.GCPhrase\022" +
      "\r\n\005count\030\002 \001(\003\022\014\n\004time\030\003 \001(\003\"C\n\006Thread\022\021" +
      "\n\tliveCount\030\001 \001(\003\022\023\n\013daemonCount\030\002 \001(\003\022\021" +
      "\n\tpeakCount\030\003 \001(\003*\200\001\n\010PoolType\022\024\n\020CODE_C" +
      "ACHE_USAGE\020\000\022\020\n\014NEWGEN_USAGE\020\001\022\020\n\014OLDGEN" +
      "_USAGE\020\002\022\022\n\016SURVIVOR_USAGE\020\003\022\021\n\rPERMGEN_" +
      "USAGE\020\004\022\023\n\017METASPACE_USAGE\020\005*\034\n\010GCPhrase" +
      "\022\007\n\003NEW\020\000\022\007\n\003OLD\020\0012b\n\026JVMMetricReportSer" +
      "vice\022H\n\007collect\022\".skywalking.v3.JVMMetri" +
      "cCollection\032\027.skywalking.v3.Commands\"\000B}" +
      "\n3org.apache.skywalking.apm.network.lang" +
      "uage.agent.v3P\001Z$skywalking/network/lang" +
      "uage/agent/v3\252\002\035SkyWalking.NetworkProtoc" +
      "ol.V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.skywalking.apm.network.common.v3.Common.getDescriptor(),
        });
    internal_static_skywalking_v3_JVMMetricCollection_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_skywalking_v3_JVMMetricCollection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_JVMMetricCollection_descriptor,
        new java.lang.String[] { "Metrics", "Service", "ServiceInstance", });
    internal_static_skywalking_v3_JVMMetric_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_skywalking_v3_JVMMetric_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_JVMMetric_descriptor,
        new java.lang.String[] { "Time", "Cpu", "Memory", "MemoryPool", "Gc", "Thread", });
    internal_static_skywalking_v3_Memory_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_skywalking_v3_Memory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_Memory_descriptor,
        new java.lang.String[] { "IsHeap", "Init", "Max", "Used", "Committed", });
    internal_static_skywalking_v3_MemoryPool_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_skywalking_v3_MemoryPool_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_MemoryPool_descriptor,
        new java.lang.String[] { "Type", "Init", "Max", "Used", "Committed", });
    internal_static_skywalking_v3_GC_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_skywalking_v3_GC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_GC_descriptor,
        new java.lang.String[] { "Phrase", "Count", "Time", });
    internal_static_skywalking_v3_Thread_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_skywalking_v3_Thread_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_Thread_descriptor,
        new java.lang.String[] { "LiveCount", "DaemonCount", "PeakCount", });
    org.apache.skywalking.apm.network.common.v3.Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

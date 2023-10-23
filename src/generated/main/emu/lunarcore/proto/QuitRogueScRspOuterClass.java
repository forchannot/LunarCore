// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class QuitRogueScRspOuterClass {
  /**
   * Protobuf type {@code QuitRogueScRsp}
   */
  public static final class QuitRogueScRsp extends ProtoMessage<QuitRogueScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 7;</code>
     */
    private int retcode;

    /**
     * <code>optional .RogueInfo rogue_info = 1;</code>
     */
    private final RogueInfoOuterClass.RogueInfo rogueInfo = RogueInfoOuterClass.RogueInfo.newInstance();

    /**
     * <code>optional .RogueFinishInfo finish_info = 13;</code>
     */
    private final RogueFinishInfoOuterClass.RogueFinishInfo finishInfo = RogueFinishInfoOuterClass.RogueFinishInfo.newInstance();

    private QuitRogueScRsp() {
    }

    /**
     * @return a new empty instance of {@code QuitRogueScRsp}
     */
    public static QuitRogueScRsp newInstance() {
      return new QuitRogueScRsp();
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return this
     */
    public QuitRogueScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @param value the retcode to set
     * @return this
     */
    public QuitRogueScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .RogueInfo rogue_info = 1;</code>
     * @return whether the rogueInfo field is set
     */
    public boolean hasRogueInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .RogueInfo rogue_info = 1;</code>
     * @return this
     */
    public QuitRogueScRsp clearRogueInfo() {
      bitField0_ &= ~0x00000002;
      rogueInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueInfo rogue_info = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueInfoOuterClass.RogueInfo getRogueInfo() {
      return rogueInfo;
    }

    /**
     * <code>optional .RogueInfo rogue_info = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueInfoOuterClass.RogueInfo getMutableRogueInfo() {
      bitField0_ |= 0x00000002;
      return rogueInfo;
    }

    /**
     * <code>optional .RogueInfo rogue_info = 1;</code>
     * @param value the rogueInfo to set
     * @return this
     */
    public QuitRogueScRsp setRogueInfo(final RogueInfoOuterClass.RogueInfo value) {
      bitField0_ |= 0x00000002;
      rogueInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueFinishInfo finish_info = 13;</code>
     * @return whether the finishInfo field is set
     */
    public boolean hasFinishInfo() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .RogueFinishInfo finish_info = 13;</code>
     * @return this
     */
    public QuitRogueScRsp clearFinishInfo() {
      bitField0_ &= ~0x00000004;
      finishInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueFinishInfo finish_info = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableFinishInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueFinishInfoOuterClass.RogueFinishInfo getFinishInfo() {
      return finishInfo;
    }

    /**
     * <code>optional .RogueFinishInfo finish_info = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueFinishInfoOuterClass.RogueFinishInfo getMutableFinishInfo() {
      bitField0_ |= 0x00000004;
      return finishInfo;
    }

    /**
     * <code>optional .RogueFinishInfo finish_info = 13;</code>
     * @param value the finishInfo to set
     * @return this
     */
    public QuitRogueScRsp setFinishInfo(final RogueFinishInfoOuterClass.RogueFinishInfo value) {
      bitField0_ |= 0x00000004;
      finishInfo.copyFrom(value);
      return this;
    }

    @Override
    public QuitRogueScRsp copyFrom(final QuitRogueScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        rogueInfo.copyFrom(other.rogueInfo);
        finishInfo.copyFrom(other.finishInfo);
      }
      return this;
    }

    @Override
    public QuitRogueScRsp mergeFrom(final QuitRogueScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasRogueInfo()) {
        getMutableRogueInfo().mergeFrom(other.rogueInfo);
      }
      if (other.hasFinishInfo()) {
        getMutableFinishInfo().mergeFrom(other.finishInfo);
      }
      return this;
    }

    @Override
    public QuitRogueScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      rogueInfo.clear();
      finishInfo.clear();
      return this;
    }

    @Override
    public QuitRogueScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueInfo.clearQuick();
      finishInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof QuitRogueScRsp)) {
        return false;
      }
      QuitRogueScRsp other = (QuitRogueScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasRogueInfo() || rogueInfo.equals(other.rogueInfo))
        && (!hasFinishInfo() || finishInfo.equals(other.finishInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 10);
        output.writeMessageNoTag(rogueInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 106);
        output.writeMessageNoTag(finishInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(finishInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public QuitRogueScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // rogueInfo
            input.readMessage(rogueInfo);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // finishInfo
            input.readMessage(finishInfo);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.rogueInfo, rogueInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.finishInfo, finishInfo);
      }
      output.endObject();
    }

    @Override
    public QuitRogueScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 655808936:
          case -1124583437: {
            if (input.isAtField(FieldNames.rogueInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueInfo);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1151198177:
          case 1347581146: {
            if (input.isAtField(FieldNames.finishInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(finishInfo);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public QuitRogueScRsp clone() {
      return new QuitRogueScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static QuitRogueScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new QuitRogueScRsp(), data).checkInitialized();
    }

    public static QuitRogueScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new QuitRogueScRsp(), input).checkInitialized();
    }

    public static QuitRogueScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new QuitRogueScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating QuitRogueScRsp messages
     */
    public static MessageFactory<QuitRogueScRsp> getFactory() {
      return QuitRogueScRspFactory.INSTANCE;
    }

    private enum QuitRogueScRspFactory implements MessageFactory<QuitRogueScRsp> {
      INSTANCE;

      @Override
      public QuitRogueScRsp create() {
        return QuitRogueScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName rogueInfo = FieldName.forField("rogueInfo", "rogue_info");

      static final FieldName finishInfo = FieldName.forField("finishInfo", "finish_info");
    }
  }
}

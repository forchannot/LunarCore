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

public final class RogueHandbookEventOuterClass {
  /**
   * Protobuf type {@code RogueHandbookEvent}
   */
  public static final class RogueHandbookEvent extends ProtoMessage<RogueHandbookEvent> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 event_id = 14;</code>
     */
    private int eventId;

    /**
     * <code>optional bool is_unlocked = 6;</code>
     */
    private boolean isUnlocked;

    private RogueHandbookEvent() {
    }

    /**
     * @return a new empty instance of {@code RogueHandbookEvent}
     */
    public static RogueHandbookEvent newInstance() {
      return new RogueHandbookEvent();
    }

    /**
     * <code>optional uint32 event_id = 14;</code>
     * @return whether the eventId field is set
     */
    public boolean hasEventId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 event_id = 14;</code>
     * @return this
     */
    public RogueHandbookEvent clearEventId() {
      bitField0_ &= ~0x00000001;
      eventId = 0;
      return this;
    }

    /**
     * <code>optional uint32 event_id = 14;</code>
     * @return the eventId
     */
    public int getEventId() {
      return eventId;
    }

    /**
     * <code>optional uint32 event_id = 14;</code>
     * @param value the eventId to set
     * @return this
     */
    public RogueHandbookEvent setEventId(final int value) {
      bitField0_ |= 0x00000001;
      eventId = value;
      return this;
    }

    /**
     * <code>optional bool is_unlocked = 6;</code>
     * @return whether the isUnlocked field is set
     */
    public boolean hasIsUnlocked() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional bool is_unlocked = 6;</code>
     * @return this
     */
    public RogueHandbookEvent clearIsUnlocked() {
      bitField0_ &= ~0x00000002;
      isUnlocked = false;
      return this;
    }

    /**
     * <code>optional bool is_unlocked = 6;</code>
     * @return the isUnlocked
     */
    public boolean getIsUnlocked() {
      return isUnlocked;
    }

    /**
     * <code>optional bool is_unlocked = 6;</code>
     * @param value the isUnlocked to set
     * @return this
     */
    public RogueHandbookEvent setIsUnlocked(final boolean value) {
      bitField0_ |= 0x00000002;
      isUnlocked = value;
      return this;
    }

    @Override
    public RogueHandbookEvent copyFrom(final RogueHandbookEvent other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        eventId = other.eventId;
        isUnlocked = other.isUnlocked;
      }
      return this;
    }

    @Override
    public RogueHandbookEvent mergeFrom(final RogueHandbookEvent other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEventId()) {
        setEventId(other.eventId);
      }
      if (other.hasIsUnlocked()) {
        setIsUnlocked(other.isUnlocked);
      }
      return this;
    }

    @Override
    public RogueHandbookEvent clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      eventId = 0;
      isUnlocked = false;
      return this;
    }

    @Override
    public RogueHandbookEvent clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueHandbookEvent)) {
        return false;
      }
      RogueHandbookEvent other = (RogueHandbookEvent) o;
      return bitField0_ == other.bitField0_
        && (!hasEventId() || eventId == other.eventId)
        && (!hasIsUnlocked() || isUnlocked == other.isUnlocked);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(eventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 48);
        output.writeBoolNoTag(isUnlocked);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(eventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueHandbookEvent mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 112: {
            // eventId
            eventId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // isUnlocked
            isUnlocked = input.readBool();
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.eventId, eventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeBool(FieldNames.isUnlocked, isUnlocked);
      }
      output.endObject();
    }

    @Override
    public RogueHandbookEvent mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1376502443:
          case 278118624: {
            if (input.isAtField(FieldNames.eventId)) {
              if (!input.trySkipNullValue()) {
                eventId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1004219859:
          case -945979816: {
            if (input.isAtField(FieldNames.isUnlocked)) {
              if (!input.trySkipNullValue()) {
                isUnlocked = input.readBool();
                bitField0_ |= 0x00000002;
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
    public RogueHandbookEvent clone() {
      return new RogueHandbookEvent().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueHandbookEvent parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueHandbookEvent(), data).checkInitialized();
    }

    public static RogueHandbookEvent parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueHandbookEvent(), input).checkInitialized();
    }

    public static RogueHandbookEvent parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueHandbookEvent(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueHandbookEvent messages
     */
    public static MessageFactory<RogueHandbookEvent> getFactory() {
      return RogueHandbookEventFactory.INSTANCE;
    }

    private enum RogueHandbookEventFactory implements MessageFactory<RogueHandbookEvent> {
      INSTANCE;

      @Override
      public RogueHandbookEvent create() {
        return RogueHandbookEvent.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName eventId = FieldName.forField("eventId", "event_id");

      static final FieldName isUnlocked = FieldName.forField("isUnlocked", "is_unlocked");
    }
  }
}

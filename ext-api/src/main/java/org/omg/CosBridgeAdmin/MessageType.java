package org.omg.CosBridgeAdmin;
/**
 * Generated from IDL enum "MessageType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public final class MessageType
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _JMS_MESSAGE = 0;
	public static final MessageType JMS_MESSAGE = new MessageType(_JMS_MESSAGE);
	public static final int _STRUCTURED_EVENT = 1;
	public static final MessageType STRUCTURED_EVENT = new MessageType(_STRUCTURED_EVENT);
	public static final int _SEQUENCE_EVENT = 2;
	public static final MessageType SEQUENCE_EVENT = new MessageType(_SEQUENCE_EVENT);
	public int value()
	{
		return value;
	}
	public static MessageType from_int(int value)
	{
		switch (value) {
			case _JMS_MESSAGE: return JMS_MESSAGE;
			case _STRUCTURED_EVENT: return STRUCTURED_EVENT;
			case _SEQUENCE_EVENT: return SEQUENCE_EVENT;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _JMS_MESSAGE: return "JMS_MESSAGE";
			case _STRUCTURED_EVENT: return "STRUCTURED_EVENT";
			case _SEQUENCE_EVENT: return "SEQUENCE_EVENT";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected MessageType(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}

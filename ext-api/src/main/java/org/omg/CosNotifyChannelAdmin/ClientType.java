package org.omg.CosNotifyChannelAdmin;
/**
 * Generated from IDL enum "ClientType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class ClientType
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _ANY_EVENT = 0;
	public static final ClientType ANY_EVENT = new ClientType(_ANY_EVENT);
	public static final int _STRUCTURED_EVENT = 1;
	public static final ClientType STRUCTURED_EVENT = new ClientType(_STRUCTURED_EVENT);
	public static final int _SEQUENCE_EVENT = 2;
	public static final ClientType SEQUENCE_EVENT = new ClientType(_SEQUENCE_EVENT);
	public int value()
	{
		return value;
	}
	public static ClientType from_int(int value)
	{
		switch (value) {
			case _ANY_EVENT: return ANY_EVENT;
			case _STRUCTURED_EVENT: return STRUCTURED_EVENT;
			case _SEQUENCE_EVENT: return SEQUENCE_EVENT;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _ANY_EVENT: return "ANY_EVENT";
			case _STRUCTURED_EVENT: return "STRUCTURED_EVENT";
			case _SEQUENCE_EVENT: return "SEQUENCE_EVENT";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ClientType(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}

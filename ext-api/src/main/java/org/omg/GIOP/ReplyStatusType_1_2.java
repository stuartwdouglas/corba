package org.omg.GIOP;
/**
 * Generated from IDL enum "ReplyStatusType_1_2".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class ReplyStatusType_1_2
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _NO_EXCEPTION = 0;
	public static final ReplyStatusType_1_2 NO_EXCEPTION = new ReplyStatusType_1_2(_NO_EXCEPTION);
	public static final int _USER_EXCEPTION = 1;
	public static final ReplyStatusType_1_2 USER_EXCEPTION = new ReplyStatusType_1_2(_USER_EXCEPTION);
	public static final int _SYSTEM_EXCEPTION = 2;
	public static final ReplyStatusType_1_2 SYSTEM_EXCEPTION = new ReplyStatusType_1_2(_SYSTEM_EXCEPTION);
	public static final int _LOCATION_FORWARD = 3;
	public static final ReplyStatusType_1_2 LOCATION_FORWARD = new ReplyStatusType_1_2(_LOCATION_FORWARD);
	public static final int _LOCATION_FORWARD_PERM = 4;
	public static final ReplyStatusType_1_2 LOCATION_FORWARD_PERM = new ReplyStatusType_1_2(_LOCATION_FORWARD_PERM);
	public static final int _NEEDS_ADDRESSING_MODE = 5;
	public static final ReplyStatusType_1_2 NEEDS_ADDRESSING_MODE = new ReplyStatusType_1_2(_NEEDS_ADDRESSING_MODE);
	public int value()
	{
		return value;
	}
	public static ReplyStatusType_1_2 from_int(int value)
	{
		switch (value) {
			case _NO_EXCEPTION: return NO_EXCEPTION;
			case _USER_EXCEPTION: return USER_EXCEPTION;
			case _SYSTEM_EXCEPTION: return SYSTEM_EXCEPTION;
			case _LOCATION_FORWARD: return LOCATION_FORWARD;
			case _LOCATION_FORWARD_PERM: return LOCATION_FORWARD_PERM;
			case _NEEDS_ADDRESSING_MODE: return NEEDS_ADDRESSING_MODE;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _NO_EXCEPTION: return "NO_EXCEPTION";
			case _USER_EXCEPTION: return "USER_EXCEPTION";
			case _SYSTEM_EXCEPTION: return "SYSTEM_EXCEPTION";
			case _LOCATION_FORWARD: return "LOCATION_FORWARD";
			case _LOCATION_FORWARD_PERM: return "LOCATION_FORWARD_PERM";
			case _NEEDS_ADDRESSING_MODE: return "NEEDS_ADDRESSING_MODE";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ReplyStatusType_1_2(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}

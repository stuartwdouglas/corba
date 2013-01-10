package org.omg.GIOP;
/**
 * Generated from IDL enum "LocateStatusType_1_2".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class LocateStatusType_1_2
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _UNKNOWN_OBJECT = 0;
	public static final LocateStatusType_1_2 UNKNOWN_OBJECT = new LocateStatusType_1_2(_UNKNOWN_OBJECT);
	public static final int _OBJECT_HERE = 1;
	public static final LocateStatusType_1_2 OBJECT_HERE = new LocateStatusType_1_2(_OBJECT_HERE);
	public static final int _OBJECT_FORWARD = 2;
	public static final LocateStatusType_1_2 OBJECT_FORWARD = new LocateStatusType_1_2(_OBJECT_FORWARD);
	public static final int _OBJECT_FORWARD_PERM = 3;
	public static final LocateStatusType_1_2 OBJECT_FORWARD_PERM = new LocateStatusType_1_2(_OBJECT_FORWARD_PERM);
	public static final int _LOC_SYSTEM_EXCEPTION = 4;
	public static final LocateStatusType_1_2 LOC_SYSTEM_EXCEPTION = new LocateStatusType_1_2(_LOC_SYSTEM_EXCEPTION);
	public static final int _LOC_NEEDS_ADDRESSING_MODE = 5;
	public static final LocateStatusType_1_2 LOC_NEEDS_ADDRESSING_MODE = new LocateStatusType_1_2(_LOC_NEEDS_ADDRESSING_MODE);
	public int value()
	{
		return value;
	}
	public static LocateStatusType_1_2 from_int(int value)
	{
		switch (value) {
			case _UNKNOWN_OBJECT: return UNKNOWN_OBJECT;
			case _OBJECT_HERE: return OBJECT_HERE;
			case _OBJECT_FORWARD: return OBJECT_FORWARD;
			case _OBJECT_FORWARD_PERM: return OBJECT_FORWARD_PERM;
			case _LOC_SYSTEM_EXCEPTION: return LOC_SYSTEM_EXCEPTION;
			case _LOC_NEEDS_ADDRESSING_MODE: return LOC_NEEDS_ADDRESSING_MODE;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _UNKNOWN_OBJECT: return "UNKNOWN_OBJECT";
			case _OBJECT_HERE: return "OBJECT_HERE";
			case _OBJECT_FORWARD: return "OBJECT_FORWARD";
			case _OBJECT_FORWARD_PERM: return "OBJECT_FORWARD_PERM";
			case _LOC_SYSTEM_EXCEPTION: return "LOC_SYSTEM_EXCEPTION";
			case _LOC_NEEDS_ADDRESSING_MODE: return "LOC_NEEDS_ADDRESSING_MODE";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected LocateStatusType_1_2(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}

package org.omg.GIOP;
/**
 * Generated from IDL enum "LocateStatusType_1_0".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class LocateStatusType_1_0
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _UNKNOWN_OBJECT = 0;
	public static final LocateStatusType_1_0 UNKNOWN_OBJECT = new LocateStatusType_1_0(_UNKNOWN_OBJECT);
	public static final int _OBJECT_HERE = 1;
	public static final LocateStatusType_1_0 OBJECT_HERE = new LocateStatusType_1_0(_OBJECT_HERE);
	public static final int _OBJECT_FORWARD = 2;
	public static final LocateStatusType_1_0 OBJECT_FORWARD = new LocateStatusType_1_0(_OBJECT_FORWARD);
	public int value()
	{
		return value;
	}
	public static LocateStatusType_1_0 from_int(int value)
	{
		switch (value) {
			case _UNKNOWN_OBJECT: return UNKNOWN_OBJECT;
			case _OBJECT_HERE: return OBJECT_HERE;
			case _OBJECT_FORWARD: return OBJECT_FORWARD;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _UNKNOWN_OBJECT: return "UNKNOWN_OBJECT";
			case _OBJECT_HERE: return "OBJECT_HERE";
			case _OBJECT_FORWARD: return "OBJECT_FORWARD";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected LocateStatusType_1_0(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}

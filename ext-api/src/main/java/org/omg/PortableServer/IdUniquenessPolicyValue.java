package org.omg.PortableServer;
/**
 * Generated from IDL enum "IdUniquenessPolicyValue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class IdUniquenessPolicyValue
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _UNIQUE_ID = 0;
	public static final IdUniquenessPolicyValue UNIQUE_ID = new IdUniquenessPolicyValue(_UNIQUE_ID);
	public static final int _MULTIPLE_ID = 1;
	public static final IdUniquenessPolicyValue MULTIPLE_ID = new IdUniquenessPolicyValue(_MULTIPLE_ID);
	public int value()
	{
		return value;
	}
	public static IdUniquenessPolicyValue from_int(int value)
	{
		switch (value) {
			case _UNIQUE_ID: return UNIQUE_ID;
			case _MULTIPLE_ID: return MULTIPLE_ID;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _UNIQUE_ID: return "UNIQUE_ID";
			case _MULTIPLE_ID: return "MULTIPLE_ID";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected IdUniquenessPolicyValue(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}

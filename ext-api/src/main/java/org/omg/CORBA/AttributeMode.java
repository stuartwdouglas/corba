package org.omg.CORBA;
/**
 * Generated from IDL enum "AttributeMode".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class AttributeMode
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _ATTR_NORMAL = 0;
	public static final AttributeMode ATTR_NORMAL = new AttributeMode(_ATTR_NORMAL);
	public static final int _ATTR_READONLY = 1;
	public static final AttributeMode ATTR_READONLY = new AttributeMode(_ATTR_READONLY);
	public int value()
	{
		return value;
	}
	public static AttributeMode from_int(int value)
	{
		switch (value) {
			case _ATTR_NORMAL: return ATTR_NORMAL;
			case _ATTR_READONLY: return ATTR_READONLY;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _ATTR_NORMAL: return "ATTR_NORMAL";
			case _ATTR_READONLY: return "ATTR_READONLY";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected AttributeMode(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}

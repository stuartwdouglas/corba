package org.omg.CosPropertyService;
/**
 * Generated from IDL enum "PropertyModeType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public final class PropertyModeType
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _normal = 0;
	public static final PropertyModeType normal = new PropertyModeType(_normal);
	public static final int _read_only = 1;
	public static final PropertyModeType read_only = new PropertyModeType(_read_only);
	public static final int _fixed_normal = 2;
	public static final PropertyModeType fixed_normal = new PropertyModeType(_fixed_normal);
	public static final int _fixed_readonly = 3;
	public static final PropertyModeType fixed_readonly = new PropertyModeType(_fixed_readonly);
	public static final int _undefined = 4;
	public static final PropertyModeType undefined = new PropertyModeType(_undefined);
	public int value()
	{
		return value;
	}
	public static PropertyModeType from_int(int value)
	{
		switch (value) {
			case _normal: return normal;
			case _read_only: return read_only;
			case _fixed_normal: return fixed_normal;
			case _fixed_readonly: return fixed_readonly;
			case _undefined: return undefined;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _normal: return "normal";
			case _read_only: return "read_only";
			case _fixed_normal: return "fixed_normal";
			case _fixed_readonly: return "fixed_readonly";
			case _undefined: return "undefined";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected PropertyModeType(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}

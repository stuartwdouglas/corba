package org.omg.CosPropertyService;
/**
 * Generated from IDL enum "ExceptionReason".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public final class ExceptionReason
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _invalid_property_name = 0;
	public static final ExceptionReason invalid_property_name = new ExceptionReason(_invalid_property_name);
	public static final int _conflicting_property = 1;
	public static final ExceptionReason conflicting_property = new ExceptionReason(_conflicting_property);
	public static final int _property_not_found = 2;
	public static final ExceptionReason property_not_found = new ExceptionReason(_property_not_found);
	public static final int _unsupported_type_code = 3;
	public static final ExceptionReason unsupported_type_code = new ExceptionReason(_unsupported_type_code);
	public static final int _unsupported_property = 4;
	public static final ExceptionReason unsupported_property = new ExceptionReason(_unsupported_property);
	public static final int _unsupported_mode = 5;
	public static final ExceptionReason unsupported_mode = new ExceptionReason(_unsupported_mode);
	public static final int _fixed_property = 6;
	public static final ExceptionReason fixed_property = new ExceptionReason(_fixed_property);
	public static final int _read_only_property = 7;
	public static final ExceptionReason read_only_property = new ExceptionReason(_read_only_property);
	public int value()
	{
		return value;
	}
	public static ExceptionReason from_int(int value)
	{
		switch (value) {
			case _invalid_property_name: return invalid_property_name;
			case _conflicting_property: return conflicting_property;
			case _property_not_found: return property_not_found;
			case _unsupported_type_code: return unsupported_type_code;
			case _unsupported_property: return unsupported_property;
			case _unsupported_mode: return unsupported_mode;
			case _fixed_property: return fixed_property;
			case _read_only_property: return read_only_property;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _invalid_property_name: return "invalid_property_name";
			case _conflicting_property: return "conflicting_property";
			case _property_not_found: return "property_not_found";
			case _unsupported_type_code: return "unsupported_type_code";
			case _unsupported_property: return "unsupported_property";
			case _unsupported_mode: return "unsupported_mode";
			case _fixed_property: return "fixed_property";
			case _read_only_property: return "read_only_property";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ExceptionReason(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}

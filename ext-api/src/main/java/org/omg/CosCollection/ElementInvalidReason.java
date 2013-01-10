package org.omg.CosCollection;
/**
 * Generated from IDL enum "ElementInvalidReason".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class ElementInvalidReason
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _element_type_invalid = 0;
	public static final ElementInvalidReason element_type_invalid = new ElementInvalidReason(_element_type_invalid);
	public static final int _positioning_property_invalid = 1;
	public static final ElementInvalidReason positioning_property_invalid = new ElementInvalidReason(_positioning_property_invalid);
	public static final int _element_exists = 2;
	public static final ElementInvalidReason element_exists = new ElementInvalidReason(_element_exists);
	public int value()
	{
		return value;
	}
	public static ElementInvalidReason from_int(int value)
	{
		switch (value) {
			case _element_type_invalid: return element_type_invalid;
			case _positioning_property_invalid: return positioning_property_invalid;
			case _element_exists: return element_exists;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _element_type_invalid: return "element_type_invalid";
			case _positioning_property_invalid: return "positioning_property_invalid";
			case _element_exists: return "element_exists";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ElementInvalidReason(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}

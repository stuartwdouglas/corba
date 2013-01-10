package org.omg.CosCollection;
/**
 * Generated from IDL enum "IteratorInvalidReason".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class IteratorInvalidReason
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _is_invalid = 0;
	public static final IteratorInvalidReason is_invalid = new IteratorInvalidReason(_is_invalid);
	public static final int _is_not_for_collection = 1;
	public static final IteratorInvalidReason is_not_for_collection = new IteratorInvalidReason(_is_not_for_collection);
	public static final int _is_const = 2;
	public static final IteratorInvalidReason is_const = new IteratorInvalidReason(_is_const);
	public int value()
	{
		return value;
	}
	public static IteratorInvalidReason from_int(int value)
	{
		switch (value) {
			case _is_invalid: return is_invalid;
			case _is_not_for_collection: return is_not_for_collection;
			case _is_const: return is_const;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _is_invalid: return "is_invalid";
			case _is_not_for_collection: return "is_not_for_collection";
			case _is_const: return "is_const";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected IteratorInvalidReason(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}

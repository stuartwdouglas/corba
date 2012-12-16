package org.omg.CosCollection;
/**
 * Generated from IDL enum "LowerBoundStyle".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class LowerBoundStyle
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _equal_lo = 0;
	public static final LowerBoundStyle equal_lo = new LowerBoundStyle(_equal_lo);
	public static final int _greater = 1;
	public static final LowerBoundStyle greater = new LowerBoundStyle(_greater);
	public static final int _greater_or_equal = 2;
	public static final LowerBoundStyle greater_or_equal = new LowerBoundStyle(_greater_or_equal);
	public int value()
	{
		return value;
	}
	public static LowerBoundStyle from_int(int value)
	{
		switch (value) {
			case _equal_lo: return equal_lo;
			case _greater: return greater;
			case _greater_or_equal: return greater_or_equal;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _equal_lo: return "equal_lo";
			case _greater: return "greater";
			case _greater_or_equal: return "greater_or_equal";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected LowerBoundStyle(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}

package org.omg.CosTime;
/**
 * Generated from IDL enum "ComparisonType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class ComparisonType
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _IntervalC = 0;
	public static final ComparisonType IntervalC = new ComparisonType(_IntervalC);
	public static final int _MidC = 1;
	public static final ComparisonType MidC = new ComparisonType(_MidC);
	public int value()
	{
		return value;
	}
	public static ComparisonType from_int(int value)
	{
		switch (value) {
			case _IntervalC: return IntervalC;
			case _MidC: return MidC;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _IntervalC: return "IntervalC";
			case _MidC: return "MidC";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ComparisonType(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}

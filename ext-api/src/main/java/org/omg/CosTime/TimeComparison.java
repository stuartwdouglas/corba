package org.omg.CosTime;
/**
 * Generated from IDL enum "TimeComparison".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class TimeComparison
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _TCEqualTo = 0;
	public static final TimeComparison TCEqualTo = new TimeComparison(_TCEqualTo);
	public static final int _TCLessThan = 1;
	public static final TimeComparison TCLessThan = new TimeComparison(_TCLessThan);
	public static final int _TCGreaterThan = 2;
	public static final TimeComparison TCGreaterThan = new TimeComparison(_TCGreaterThan);
	public static final int _TCIndeterminate = 3;
	public static final TimeComparison TCIndeterminate = new TimeComparison(_TCIndeterminate);
	public int value()
	{
		return value;
	}
	public static TimeComparison from_int(int value)
	{
		switch (value) {
			case _TCEqualTo: return TCEqualTo;
			case _TCLessThan: return TCLessThan;
			case _TCGreaterThan: return TCGreaterThan;
			case _TCIndeterminate: return TCIndeterminate;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _TCEqualTo: return "TCEqualTo";
			case _TCLessThan: return "TCLessThan";
			case _TCGreaterThan: return "TCGreaterThan";
			case _TCIndeterminate: return "TCIndeterminate";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected TimeComparison(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}

package org.omg.CosTime;
/**
 * Generated from IDL enum "TimeComparison".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class TimeComparisonHolder
	implements org.omg.CORBA.portable.Streamable
{
	public TimeComparison value;

	public TimeComparisonHolder ()
	{
	}
	public TimeComparisonHolder (final TimeComparison initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TimeComparisonHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TimeComparisonHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TimeComparisonHelper.write (out,value);
	}
}

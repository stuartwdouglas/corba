package org.omg.Security;
/**
 * Generated from IDL enum "DayOfTheWeek".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class DayOfTheWeekHolder
	implements org.omg.CORBA.portable.Streamable
{
	public DayOfTheWeek value;

	public DayOfTheWeekHolder ()
	{
	}
	public DayOfTheWeekHolder (final DayOfTheWeek initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return DayOfTheWeekHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DayOfTheWeekHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		DayOfTheWeekHelper.write (out,value);
	}
}

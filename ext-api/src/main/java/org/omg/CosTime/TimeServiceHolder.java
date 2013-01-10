package org.omg.CosTime;

/**
 * Generated from IDL interface "TimeService".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class TimeServiceHolder	implements org.omg.CORBA.portable.Streamable{
	 public TimeService value;
	public TimeServiceHolder()
	{
	}
	public TimeServiceHolder (final TimeService initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TimeServiceHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TimeServiceHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TimeServiceHelper.write (_out,value);
	}
}

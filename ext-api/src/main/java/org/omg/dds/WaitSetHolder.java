package org.omg.dds;

/**
 * Generated from IDL interface "WaitSet".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class WaitSetHolder	implements org.omg.CORBA.portable.Streamable{
	 public WaitSet value;
	public WaitSetHolder()
	{
	}
	public WaitSetHolder (final WaitSet initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return WaitSetHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = WaitSetHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		WaitSetHelper.write (_out,value);
	}
}
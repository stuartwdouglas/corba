package org.omg.RTCORBA;
/**
 * Generated from IDL enum "PriorityModel".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class PriorityModelHolder
	implements org.omg.CORBA.portable.Streamable
{
	public PriorityModel value;

	public PriorityModelHolder ()
	{
	}
	public PriorityModelHolder (final PriorityModel initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PriorityModelHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PriorityModelHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PriorityModelHelper.write (out,value);
	}
}

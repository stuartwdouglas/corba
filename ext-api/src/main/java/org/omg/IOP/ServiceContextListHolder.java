package org.omg.IOP;

/**
 * Generated from IDL alias "ServiceContextList".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class ServiceContextListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.IOP.ServiceContext[] value;

	public ServiceContextListHolder ()
	{
	}
	public ServiceContextListHolder (final org.omg.IOP.ServiceContext[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ServiceContextListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServiceContextListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ServiceContextListHelper.write (out,value);
	}
}

package org.omg.CSIIOP;

/**
 * Generated from IDL struct "ServiceConfiguration".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class ServiceConfigurationHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CSIIOP.ServiceConfiguration value;

	public ServiceConfigurationHolder ()
	{
	}
	public ServiceConfigurationHolder(final org.omg.CSIIOP.ServiceConfiguration initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CSIIOP.ServiceConfigurationHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CSIIOP.ServiceConfigurationHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CSIIOP.ServiceConfigurationHelper.write(_out, value);
	}
}

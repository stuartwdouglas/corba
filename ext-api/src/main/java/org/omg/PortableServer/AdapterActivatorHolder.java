package org.omg.PortableServer;

/**
 * Generated from IDL interface "AdapterActivator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:11 AM
 */

public final class AdapterActivatorHolder	implements org.omg.CORBA.portable.Streamable{
	 public AdapterActivator value;
	public AdapterActivatorHolder()
	{
	}
	public AdapterActivatorHolder (final AdapterActivator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return AdapterActivatorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AdapterActivatorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		AdapterActivatorHelper.write (_out,value);
	}
}

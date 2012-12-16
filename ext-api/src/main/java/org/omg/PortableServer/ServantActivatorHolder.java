package org.omg.PortableServer;

/**
 * Generated from IDL interface "ServantActivator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class ServantActivatorHolder	implements org.omg.CORBA.portable.Streamable{
	 public ServantActivator value;
	public ServantActivatorHolder()
	{
	}
	public ServantActivatorHolder (final ServantActivator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ServantActivatorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServantActivatorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ServantActivatorHelper.write (_out,value);
	}
}

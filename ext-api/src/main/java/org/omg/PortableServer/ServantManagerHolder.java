package org.omg.PortableServer;

/**
 * Generated from IDL interface "ServantManager".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:11 AM
 */

public final class ServantManagerHolder	implements org.omg.CORBA.portable.Streamable{
	 public ServantManager value;
	public ServantManagerHolder()
	{
	}
	public ServantManagerHolder (final ServantManager initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ServantManagerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServantManagerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ServantManagerHelper.write (_out,value);
	}
}

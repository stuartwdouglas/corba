package org.omg.CosEventChannelAdmin;

/**
 * Generated from IDL interface "ProxyPushSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class ProxyPushSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public ProxyPushSupplier value;
	public ProxyPushSupplierHolder()
	{
	}
	public ProxyPushSupplierHolder (final ProxyPushSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ProxyPushSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProxyPushSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ProxyPushSupplierHelper.write (_out,value);
	}
}

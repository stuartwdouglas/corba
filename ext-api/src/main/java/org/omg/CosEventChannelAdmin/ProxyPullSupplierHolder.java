package org.omg.CosEventChannelAdmin;

/**
 * Generated from IDL interface "ProxyPullSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class ProxyPullSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public ProxyPullSupplier value;
	public ProxyPullSupplierHolder()
	{
	}
	public ProxyPullSupplierHolder (final ProxyPullSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ProxyPullSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProxyPullSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ProxyPullSupplierHelper.write (_out,value);
	}
}

package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL interface "ProxySupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class ProxySupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public ProxySupplier value;
	public ProxySupplierHolder()
	{
	}
	public ProxySupplierHolder (final ProxySupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ProxySupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProxySupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ProxySupplierHelper.write (_out,value);
	}
}

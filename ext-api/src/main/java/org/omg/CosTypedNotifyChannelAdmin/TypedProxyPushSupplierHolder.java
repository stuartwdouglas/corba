package org.omg.CosTypedNotifyChannelAdmin;

/**
 * Generated from IDL interface "TypedProxyPushSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:53 PM
 */

public final class TypedProxyPushSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public TypedProxyPushSupplier value;
	public TypedProxyPushSupplierHolder()
	{
	}
	public TypedProxyPushSupplierHolder (final TypedProxyPushSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TypedProxyPushSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TypedProxyPushSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TypedProxyPushSupplierHelper.write (_out,value);
	}
}

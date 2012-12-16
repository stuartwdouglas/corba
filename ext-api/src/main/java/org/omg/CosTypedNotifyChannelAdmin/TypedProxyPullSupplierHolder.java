package org.omg.CosTypedNotifyChannelAdmin;

/**
 * Generated from IDL interface "TypedProxyPullSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:53 PM
 */

public final class TypedProxyPullSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public TypedProxyPullSupplier value;
	public TypedProxyPullSupplierHolder()
	{
	}
	public TypedProxyPullSupplierHolder (final TypedProxyPullSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TypedProxyPullSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TypedProxyPullSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TypedProxyPullSupplierHelper.write (_out,value);
	}
}

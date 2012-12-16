package org.omg.CosTypedNotifyComm;

/**
 * Generated from IDL interface "TypedPullSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:53 PM
 */

public final class TypedPullSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public TypedPullSupplier value;
	public TypedPullSupplierHolder()
	{
	}
	public TypedPullSupplierHolder (final TypedPullSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TypedPullSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TypedPullSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TypedPullSupplierHelper.write (_out,value);
	}
}

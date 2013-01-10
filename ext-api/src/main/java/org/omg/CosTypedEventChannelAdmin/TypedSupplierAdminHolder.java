package org.omg.CosTypedEventChannelAdmin;

/**
 * Generated from IDL interface "TypedSupplierAdmin".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class TypedSupplierAdminHolder	implements org.omg.CORBA.portable.Streamable{
	 public TypedSupplierAdmin value;
	public TypedSupplierAdminHolder()
	{
	}
	public TypedSupplierAdminHolder (final TypedSupplierAdmin initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TypedSupplierAdminHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TypedSupplierAdminHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TypedSupplierAdminHelper.write (_out,value);
	}
}

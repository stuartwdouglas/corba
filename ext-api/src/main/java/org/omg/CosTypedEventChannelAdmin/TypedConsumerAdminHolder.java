package org.omg.CosTypedEventChannelAdmin;

/**
 * Generated from IDL interface "TypedConsumerAdmin".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class TypedConsumerAdminHolder	implements org.omg.CORBA.portable.Streamable{
	 public TypedConsumerAdmin value;
	public TypedConsumerAdminHolder()
	{
	}
	public TypedConsumerAdminHolder (final TypedConsumerAdmin initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TypedConsumerAdminHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TypedConsumerAdminHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TypedConsumerAdminHelper.write (_out,value);
	}
}

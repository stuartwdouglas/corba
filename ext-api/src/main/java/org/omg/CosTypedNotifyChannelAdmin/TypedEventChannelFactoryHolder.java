package org.omg.CosTypedNotifyChannelAdmin;

/**
 * Generated from IDL interface "TypedEventChannelFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class TypedEventChannelFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public TypedEventChannelFactory value;
	public TypedEventChannelFactoryHolder()
	{
	}
	public TypedEventChannelFactoryHolder (final TypedEventChannelFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TypedEventChannelFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TypedEventChannelFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TypedEventChannelFactoryHelper.write (_out,value);
	}
}

package org.omg.CosTypedNotifyChannelAdmin;

/**
 * Generated from IDL interface "TypedEventChannel".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:53 PM
 */

public final class TypedEventChannelHolder	implements org.omg.CORBA.portable.Streamable{
	 public TypedEventChannel value;
	public TypedEventChannelHolder()
	{
	}
	public TypedEventChannelHolder (final TypedEventChannel initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TypedEventChannelHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TypedEventChannelHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TypedEventChannelHelper.write (_out,value);
	}
}

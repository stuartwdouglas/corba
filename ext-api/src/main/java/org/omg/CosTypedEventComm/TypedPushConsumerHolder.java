package org.omg.CosTypedEventComm;

/**
 * Generated from IDL interface "TypedPushConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class TypedPushConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public TypedPushConsumer value;
	public TypedPushConsumerHolder()
	{
	}
	public TypedPushConsumerHolder (final TypedPushConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TypedPushConsumerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TypedPushConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TypedPushConsumerHelper.write (_out,value);
	}
}

package org.omg.CosTypedNotifyChannelAdmin;

/**
 * Generated from IDL interface "TypedProxyPullConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:53 PM
 */

public final class TypedProxyPullConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public TypedProxyPullConsumer value;
	public TypedProxyPullConsumerHolder()
	{
	}
	public TypedProxyPullConsumerHolder (final TypedProxyPullConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TypedProxyPullConsumerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TypedProxyPullConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TypedProxyPullConsumerHelper.write (_out,value);
	}
}

package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL interface "StructuredProxyPushConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class StructuredProxyPushConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public StructuredProxyPushConsumer value;
	public StructuredProxyPushConsumerHolder()
	{
	}
	public StructuredProxyPushConsumerHolder (final StructuredProxyPushConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return StructuredProxyPushConsumerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StructuredProxyPushConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		StructuredProxyPushConsumerHelper.write (_out,value);
	}
}

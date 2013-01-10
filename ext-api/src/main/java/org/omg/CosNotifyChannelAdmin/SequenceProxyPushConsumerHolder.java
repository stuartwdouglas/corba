package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL interface "SequenceProxyPushConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class SequenceProxyPushConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public SequenceProxyPushConsumer value;
	public SequenceProxyPushConsumerHolder()
	{
	}
	public SequenceProxyPushConsumerHolder (final SequenceProxyPushConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SequenceProxyPushConsumerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequenceProxyPushConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SequenceProxyPushConsumerHelper.write (_out,value);
	}
}

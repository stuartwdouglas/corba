package org.omg.CosEventChannelAdmin;

/**
 * Generated from IDL interface "ProxyPushConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class ProxyPushConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public ProxyPushConsumer value;
	public ProxyPushConsumerHolder()
	{
	}
	public ProxyPushConsumerHolder (final ProxyPushConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ProxyPushConsumerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProxyPushConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ProxyPushConsumerHelper.write (_out,value);
	}
}

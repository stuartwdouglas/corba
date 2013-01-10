package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL interface "ProxyPullConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class ProxyPullConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public ProxyPullConsumer value;
	public ProxyPullConsumerHolder()
	{
	}
	public ProxyPullConsumerHolder (final ProxyPullConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ProxyPullConsumerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProxyPullConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ProxyPullConsumerHelper.write (_out,value);
	}
}

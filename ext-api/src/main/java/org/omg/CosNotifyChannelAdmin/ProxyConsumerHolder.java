package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL interface "ProxyConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class ProxyConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public ProxyConsumer value;
	public ProxyConsumerHolder()
	{
	}
	public ProxyConsumerHolder (final ProxyConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ProxyConsumerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProxyConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ProxyConsumerHelper.write (_out,value);
	}
}

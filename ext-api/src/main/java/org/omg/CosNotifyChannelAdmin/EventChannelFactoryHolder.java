package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL interface "EventChannelFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class EventChannelFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public EventChannelFactory value;
	public EventChannelFactoryHolder()
	{
	}
	public EventChannelFactoryHolder (final EventChannelFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EventChannelFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EventChannelFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EventChannelFactoryHelper.write (_out,value);
	}
}

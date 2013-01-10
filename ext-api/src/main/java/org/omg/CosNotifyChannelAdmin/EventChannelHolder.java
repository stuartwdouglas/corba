package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL interface "EventChannel".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class EventChannelHolder	implements org.omg.CORBA.portable.Streamable{
	 public EventChannel value;
	public EventChannelHolder()
	{
	}
	public EventChannelHolder (final EventChannel initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EventChannelHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EventChannelHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EventChannelHelper.write (_out,value);
	}
}

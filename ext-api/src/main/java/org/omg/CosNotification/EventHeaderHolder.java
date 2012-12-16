package org.omg.CosNotification;

/**
 * Generated from IDL struct "EventHeader".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class EventHeaderHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotification.EventHeader value;

	public EventHeaderHolder ()
	{
	}
	public EventHeaderHolder(final org.omg.CosNotification.EventHeader initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotification.EventHeaderHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotification.EventHeaderHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotification.EventHeaderHelper.write(_out, value);
	}
}

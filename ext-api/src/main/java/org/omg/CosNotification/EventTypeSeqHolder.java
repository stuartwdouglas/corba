package org.omg.CosNotification;

/**
 * Generated from IDL alias "EventTypeSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class EventTypeSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotification.EventType[] value;

	public EventTypeSeqHolder ()
	{
	}
	public EventTypeSeqHolder (final org.omg.CosNotification.EventType[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EventTypeSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EventTypeSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EventTypeSeqHelper.write (out,value);
	}
}

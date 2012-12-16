package org.omg.CosNotification;

/**
 * Generated from IDL struct "FixedEventHeader".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class FixedEventHeader
	implements org.omg.CORBA.portable.IDLEntity
{
	public FixedEventHeader(){}
	public org.omg.CosNotification.EventType event_type;
	public java.lang.String event_name = "";
	public FixedEventHeader(org.omg.CosNotification.EventType event_type, java.lang.String event_name)
	{
		this.event_type = event_type;
		this.event_name = event_name;
	}
}

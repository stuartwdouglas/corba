package org.omg.CosNotifyComm;

/**
 * Generated from IDL exception "InvalidEventType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class InvalidEventType
	extends org.omg.CORBA.UserException
{
	public InvalidEventType()
	{
		super(org.omg.CosNotifyComm.InvalidEventTypeHelper.id());
	}

	public org.omg.CosNotification.EventType type;
	public InvalidEventType(java.lang.String _reason,org.omg.CosNotification.EventType type)
	{
		super(_reason);
		this.type = type;
	}
	public InvalidEventType(org.omg.CosNotification.EventType type)
	{
		super(org.omg.CosNotifyComm.InvalidEventTypeHelper.id());
		this.type = type;
	}
}

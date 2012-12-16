package org.omg.CosNotifyComm;


/**
 * Generated from IDL interface "NotifySubscribe".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public interface NotifySubscribeOperations
{
	/* constants */
	/* operations  */
	void subscription_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType;
}

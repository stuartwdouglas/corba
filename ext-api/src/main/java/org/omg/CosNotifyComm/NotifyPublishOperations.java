package org.omg.CosNotifyComm;


/**
 * Generated from IDL interface "NotifyPublish".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public interface NotifyPublishOperations
{
	/* constants */
	/* operations  */
	void offer_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType;
}

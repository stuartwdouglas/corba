package org.omg.CosNotifyChannelAdmin;


/**
 * Generated from IDL interface "EventChannelFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public interface EventChannelFactoryOperations
{
	/* constants */
	/* operations  */
	org.omg.CosNotifyChannelAdmin.EventChannel create_channel(org.omg.CosNotification.Property[] initial_qos, org.omg.CosNotification.Property[] initial_admin, org.omg.CORBA.IntHolder id) throws org.omg.CosNotification.UnsupportedAdmin,org.omg.CosNotification.UnsupportedQoS;
	int[] get_all_channels();
	org.omg.CosNotifyChannelAdmin.EventChannel get_event_channel(int id) throws org.omg.CosNotifyChannelAdmin.ChannelNotFound;
}

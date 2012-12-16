package org.omg.CosNotifyChannelAdmin;


/**
 * Generated from IDL interface "ConsumerAdmin".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public interface ConsumerAdminOperations
	extends org.omg.CosNotification.QoSAdminOperations , org.omg.CosNotifyComm.NotifySubscribeOperations , org.omg.CosNotifyFilter.FilterAdminOperations , org.omg.CosEventChannelAdmin.ConsumerAdminOperations
{
	/* constants */
	/* operations  */
	int MyID();
	org.omg.CosNotifyChannelAdmin.EventChannel MyChannel();
	org.omg.CosNotifyChannelAdmin.InterFilterGroupOperator MyOperator();
	org.omg.CosNotifyFilter.MappingFilter priority_filter();
	void priority_filter(org.omg.CosNotifyFilter.MappingFilter arg);
	org.omg.CosNotifyFilter.MappingFilter lifetime_filter();
	void lifetime_filter(org.omg.CosNotifyFilter.MappingFilter arg);
	int[] pull_suppliers();
	int[] push_suppliers();
	org.omg.CosNotifyChannelAdmin.ProxySupplier get_proxy_supplier(int proxy_id) throws org.omg.CosNotifyChannelAdmin.ProxyNotFound;
	org.omg.CosNotifyChannelAdmin.ProxySupplier obtain_notification_pull_supplier(org.omg.CosNotifyChannelAdmin.ClientType ctype, org.omg.CORBA.IntHolder proxy_id) throws org.omg.CosNotifyChannelAdmin.AdminLimitExceeded;
	org.omg.CosNotifyChannelAdmin.ProxySupplier obtain_notification_push_supplier(org.omg.CosNotifyChannelAdmin.ClientType ctype, org.omg.CORBA.IntHolder proxy_id) throws org.omg.CosNotifyChannelAdmin.AdminLimitExceeded;
	void destroy();
}

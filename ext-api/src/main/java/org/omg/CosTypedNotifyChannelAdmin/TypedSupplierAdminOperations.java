package org.omg.CosTypedNotifyChannelAdmin;


/**
 * Generated from IDL interface "TypedSupplierAdmin".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public interface TypedSupplierAdminOperations
	extends org.omg.CosNotifyChannelAdmin.SupplierAdminOperations , org.omg.CosTypedEventChannelAdmin.TypedSupplierAdminOperations
{
	/* constants */
	/* operations  */
	org.omg.CosTypedNotifyChannelAdmin.TypedProxyPushConsumer obtain_typed_notification_push_consumer(java.lang.String supported_interface, org.omg.CORBA.IntHolder proxy_id) throws org.omg.CosTypedEventChannelAdmin.InterfaceNotSupported,org.omg.CosNotifyChannelAdmin.AdminLimitExceeded;
	org.omg.CosTypedNotifyChannelAdmin.TypedProxyPullConsumer obtain_typed_notification_pull_consumer(java.lang.String uses_interface, org.omg.CORBA.IntHolder proxy_id) throws org.omg.CosTypedEventChannelAdmin.NoSuchImplementation,org.omg.CosNotifyChannelAdmin.AdminLimitExceeded;
}

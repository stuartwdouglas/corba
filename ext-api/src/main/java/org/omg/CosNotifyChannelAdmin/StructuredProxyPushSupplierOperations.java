package org.omg.CosNotifyChannelAdmin;


/**
 * Generated from IDL interface "StructuredProxyPushSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public interface StructuredProxyPushSupplierOperations
	extends org.omg.CosNotifyChannelAdmin.ProxySupplierOperations , org.omg.CosNotifyComm.StructuredPushSupplierOperations
{
	/* constants */
	/* operations  */
	void connect_structured_push_consumer(org.omg.CosNotifyComm.StructuredPushConsumer push_consumer) throws org.omg.CosEventChannelAdmin.AlreadyConnected,org.omg.CosEventChannelAdmin.TypeError;
	void suspend_connection() throws org.omg.CosNotifyChannelAdmin.NotConnected,org.omg.CosNotifyChannelAdmin.ConnectionAlreadyInactive;
	void resume_connection() throws org.omg.CosNotifyChannelAdmin.ConnectionAlreadyActive,org.omg.CosNotifyChannelAdmin.NotConnected;
}

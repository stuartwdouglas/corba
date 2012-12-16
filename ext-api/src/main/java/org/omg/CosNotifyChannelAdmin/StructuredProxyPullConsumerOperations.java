package org.omg.CosNotifyChannelAdmin;


/**
 * Generated from IDL interface "StructuredProxyPullConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public interface StructuredProxyPullConsumerOperations
	extends org.omg.CosNotifyChannelAdmin.ProxyConsumerOperations , org.omg.CosNotifyComm.StructuredPullConsumerOperations
{
	/* constants */
	/* operations  */
	void connect_structured_pull_supplier(org.omg.CosNotifyComm.StructuredPullSupplier pull_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected,org.omg.CosEventChannelAdmin.TypeError;
	void suspend_connection() throws org.omg.CosNotifyChannelAdmin.NotConnected,org.omg.CosNotifyChannelAdmin.ConnectionAlreadyInactive;
	void resume_connection() throws org.omg.CosNotifyChannelAdmin.ConnectionAlreadyActive,org.omg.CosNotifyChannelAdmin.NotConnected;
}

package org.omg.CosTypedNotifyChannelAdmin;


/**
 * Generated from IDL interface "TypedProxyPullConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:53 PM
 */

public interface TypedProxyPullConsumerOperations
	extends org.omg.CosNotifyChannelAdmin.ProxyConsumerOperations , org.omg.CosNotifyComm.PullConsumerOperations
{
	/* constants */
	/* operations  */
	void connect_typed_pull_supplier(org.omg.CosTypedEventComm.TypedPullSupplier pull_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected,org.omg.CosEventChannelAdmin.TypeError;
	void suspend_connection() throws org.omg.CosNotifyChannelAdmin.NotConnected,org.omg.CosNotifyChannelAdmin.ConnectionAlreadyInactive;
	void resume_connection() throws org.omg.CosNotifyChannelAdmin.ConnectionAlreadyActive,org.omg.CosNotifyChannelAdmin.NotConnected;
}

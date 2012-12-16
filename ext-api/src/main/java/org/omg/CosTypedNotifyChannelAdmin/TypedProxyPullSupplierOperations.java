package org.omg.CosTypedNotifyChannelAdmin;


/**
 * Generated from IDL interface "TypedProxyPullSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:53 PM
 */

public interface TypedProxyPullSupplierOperations
	extends org.omg.CosNotifyChannelAdmin.ProxySupplierOperations , org.omg.CosTypedNotifyComm.TypedPullSupplierOperations
{
	/* constants */
	/* operations  */
	void connect_typed_pull_consumer(org.omg.CosEventComm.PullConsumer pull_consumer) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}

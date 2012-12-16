package org.omg.CosNotifyChannelAdmin;


/**
 * Generated from IDL interface "ProxyPullSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public interface ProxyPullSupplierOperations
	extends org.omg.CosNotifyChannelAdmin.ProxySupplierOperations , org.omg.CosNotifyComm.PullSupplierOperations
{
	/* constants */
	/* operations  */
	void connect_any_pull_consumer(org.omg.CosEventComm.PullConsumer pull_consumer) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}

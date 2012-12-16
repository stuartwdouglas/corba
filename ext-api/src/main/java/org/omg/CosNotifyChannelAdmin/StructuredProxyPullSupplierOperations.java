package org.omg.CosNotifyChannelAdmin;


/**
 * Generated from IDL interface "StructuredProxyPullSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public interface StructuredProxyPullSupplierOperations
	extends org.omg.CosNotifyChannelAdmin.ProxySupplierOperations , org.omg.CosNotifyComm.StructuredPullSupplierOperations
{
	/* constants */
	/* operations  */
	void connect_structured_pull_consumer(org.omg.CosNotifyComm.StructuredPullConsumer pull_consumer) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}

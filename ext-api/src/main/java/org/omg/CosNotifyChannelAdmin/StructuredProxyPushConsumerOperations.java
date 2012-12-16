package org.omg.CosNotifyChannelAdmin;


/**
 * Generated from IDL interface "StructuredProxyPushConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public interface StructuredProxyPushConsumerOperations
	extends org.omg.CosNotifyChannelAdmin.ProxyConsumerOperations , org.omg.CosNotifyComm.StructuredPushConsumerOperations
{
	/* constants */
	/* operations  */
	void connect_structured_push_supplier(org.omg.CosNotifyComm.StructuredPushSupplier push_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}

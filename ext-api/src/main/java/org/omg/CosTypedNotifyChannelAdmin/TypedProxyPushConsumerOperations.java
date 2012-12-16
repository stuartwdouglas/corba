package org.omg.CosTypedNotifyChannelAdmin;


/**
 * Generated from IDL interface "TypedProxyPushConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:53 PM
 */

public interface TypedProxyPushConsumerOperations
	extends org.omg.CosNotifyChannelAdmin.ProxyConsumerOperations , org.omg.CosTypedNotifyComm.TypedPushConsumerOperations
{
	/* constants */
	/* operations  */
	void connect_typed_push_supplier(org.omg.CosEventComm.PushSupplier push_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}

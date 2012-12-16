package org.omg.CosEventChannelAdmin;


/**
 * Generated from IDL interface "ProxyPushConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:42 PM
 */

public interface ProxyPushConsumerOperations
	extends org.omg.CosEventComm.PushConsumerOperations
{
	/* constants */
	/* operations  */
	void connect_push_supplier(org.omg.CosEventComm.PushSupplier push_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}

package org.omg.CosNotifyChannelAdmin;


/**
 * Generated from IDL interface "SequenceProxyPushConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public interface SequenceProxyPushConsumerOperations
	extends org.omg.CosNotifyChannelAdmin.ProxyConsumerOperations , org.omg.CosNotifyComm.SequencePushConsumerOperations
{
	/* constants */
	/* operations  */
	void connect_sequence_push_supplier(org.omg.CosNotifyComm.SequencePushSupplier push_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}

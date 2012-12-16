package org.omg.CosNotifyChannelAdmin;


/**
 * Generated from IDL interface "SequenceProxyPullSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public interface SequenceProxyPullSupplierOperations
	extends org.omg.CosNotifyChannelAdmin.ProxySupplierOperations , org.omg.CosNotifyComm.SequencePullSupplierOperations
{
	/* constants */
	/* operations  */
	void connect_sequence_pull_consumer(org.omg.CosNotifyComm.SequencePullConsumer pull_consumer) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}

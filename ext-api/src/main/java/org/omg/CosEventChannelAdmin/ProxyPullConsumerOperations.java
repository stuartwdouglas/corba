package org.omg.CosEventChannelAdmin;


/**
 * Generated from IDL interface "ProxyPullConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:42 PM
 */

public interface ProxyPullConsumerOperations
	extends org.omg.CosEventComm.PullConsumerOperations
{
	/* constants */
	/* operations  */
	void connect_pull_supplier(org.omg.CosEventComm.PullSupplier pull_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected,org.omg.CosEventChannelAdmin.TypeError;
}

package org.omg.CosEventChannelAdmin;


/**
 * Generated from IDL interface "ProxyPullSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:42 PM
 */

public interface ProxyPullSupplierOperations
	extends org.omg.CosEventComm.PullSupplierOperations
{
	/* constants */
	/* operations  */
	void connect_pull_consumer(org.omg.CosEventComm.PullConsumer pull_consumer) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}

package org.omg.CosEventChannelAdmin;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ProxyPullConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:42 PM
 */

public class ProxyPullConsumerPOATie
	extends ProxyPullConsumerPOA
{
	private ProxyPullConsumerOperations _delegate;

	private POA _poa;
	public ProxyPullConsumerPOATie(ProxyPullConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public ProxyPullConsumerPOATie(ProxyPullConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosEventChannelAdmin.ProxyPullConsumer _this()
	{
		return org.omg.CosEventChannelAdmin.ProxyPullConsumerHelper.narrow(_this_object());
	}
	public org.omg.CosEventChannelAdmin.ProxyPullConsumer _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosEventChannelAdmin.ProxyPullConsumerHelper.narrow(_this_object(orb));
	}
	public ProxyPullConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProxyPullConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public void disconnect_pull_consumer()
	{
_delegate.disconnect_pull_consumer();
	}

	public void connect_pull_supplier(org.omg.CosEventComm.PullSupplier pull_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected,org.omg.CosEventChannelAdmin.TypeError
	{
_delegate.connect_pull_supplier(pull_supplier);
	}

}

package org.omg.CosEventChannelAdmin;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ProxyPushConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public class ProxyPushConsumerPOATie
	extends ProxyPushConsumerPOA
{
	private ProxyPushConsumerOperations _delegate;

	private POA _poa;
	public ProxyPushConsumerPOATie(ProxyPushConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public ProxyPushConsumerPOATie(ProxyPushConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosEventChannelAdmin.ProxyPushConsumer _this()
	{
		return org.omg.CosEventChannelAdmin.ProxyPushConsumerHelper.narrow(_this_object());
	}
	public org.omg.CosEventChannelAdmin.ProxyPushConsumer _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosEventChannelAdmin.ProxyPushConsumerHelper.narrow(_this_object(orb));
	}
	public ProxyPushConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProxyPushConsumerOperations delegate)
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
	public void connect_push_supplier(org.omg.CosEventComm.PushSupplier push_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected
	{
_delegate.connect_push_supplier(push_supplier);
	}

	public void disconnect_push_consumer()
	{
_delegate.disconnect_push_consumer();
	}

	public void push(org.omg.CORBA.Any data) throws org.omg.CosEventComm.Disconnected
	{
_delegate.push(data);
	}

}

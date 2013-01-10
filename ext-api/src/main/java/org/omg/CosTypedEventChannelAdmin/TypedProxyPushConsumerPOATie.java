package org.omg.CosTypedEventChannelAdmin;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TypedProxyPushConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public class TypedProxyPushConsumerPOATie
	extends TypedProxyPushConsumerPOA
{
	private TypedProxyPushConsumerOperations _delegate;

	private POA _poa;
	public TypedProxyPushConsumerPOATie(TypedProxyPushConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public TypedProxyPushConsumerPOATie(TypedProxyPushConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTypedEventChannelAdmin.TypedProxyPushConsumer _this()
	{
		return org.omg.CosTypedEventChannelAdmin.TypedProxyPushConsumerHelper.narrow(_this_object());
	}
	public org.omg.CosTypedEventChannelAdmin.TypedProxyPushConsumer _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTypedEventChannelAdmin.TypedProxyPushConsumerHelper.narrow(_this_object(orb));
	}
	public TypedProxyPushConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TypedProxyPushConsumerOperations delegate)
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
	public org.omg.CORBA.Object get_typed_consumer()
	{
		return _delegate.get_typed_consumer();
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

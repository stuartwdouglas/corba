package org.omg.CosTypedEventComm;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TypedPushConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:53 PM
 */

public class TypedPushConsumerPOATie
	extends TypedPushConsumerPOA
{
	private TypedPushConsumerOperations _delegate;

	private POA _poa;
	public TypedPushConsumerPOATie(TypedPushConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public TypedPushConsumerPOATie(TypedPushConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTypedEventComm.TypedPushConsumer _this()
	{
		return org.omg.CosTypedEventComm.TypedPushConsumerHelper.narrow(_this_object());
	}
	public org.omg.CosTypedEventComm.TypedPushConsumer _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTypedEventComm.TypedPushConsumerHelper.narrow(_this_object(orb));
	}
	public TypedPushConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TypedPushConsumerOperations delegate)
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

	public void disconnect_push_consumer()
	{
_delegate.disconnect_push_consumer();
	}

	public void push(org.omg.CORBA.Any data) throws org.omg.CosEventComm.Disconnected
	{
_delegate.push(data);
	}

}

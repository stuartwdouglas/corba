package org.omg.CosTypedNotifyComm;

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
	public org.omg.CosTypedNotifyComm.TypedPushConsumer _this()
	{
		return org.omg.CosTypedNotifyComm.TypedPushConsumerHelper.narrow(_this_object());
	}
	public org.omg.CosTypedNotifyComm.TypedPushConsumer _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTypedNotifyComm.TypedPushConsumerHelper.narrow(_this_object(orb));
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

	public void offer_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.offer_change(added,removed);
	}

	public void push(org.omg.CORBA.Any data) throws org.omg.CosEventComm.Disconnected
	{
_delegate.push(data);
	}

}

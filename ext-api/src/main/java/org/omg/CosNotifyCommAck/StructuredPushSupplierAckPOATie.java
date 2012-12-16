package org.omg.CosNotifyCommAck;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "StructuredPushSupplierAck".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public class StructuredPushSupplierAckPOATie
	extends StructuredPushSupplierAckPOA
{
	private StructuredPushSupplierAckOperations _delegate;

	private POA _poa;
	public StructuredPushSupplierAckPOATie(StructuredPushSupplierAckOperations delegate)
	{
		_delegate = delegate;
	}
	public StructuredPushSupplierAckPOATie(StructuredPushSupplierAckOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyCommAck.StructuredPushSupplierAck _this()
	{
		return org.omg.CosNotifyCommAck.StructuredPushSupplierAckHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyCommAck.StructuredPushSupplierAck _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyCommAck.StructuredPushSupplierAckHelper.narrow(_this_object(orb));
	}
	public StructuredPushSupplierAckOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(StructuredPushSupplierAckOperations delegate)
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
	public void disconnect_structured_push_supplier()
	{
_delegate.disconnect_structured_push_supplier();
	}

	public void subscription_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.subscription_change(added,removed);
	}

	public void acknowledge(int[] sequence_numbers)
	{
_delegate.acknowledge(sequence_numbers);
	}

}

package org.omg.CosNotifyCommAck;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "SequencePushSupplierAck".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public class SequencePushSupplierAckPOATie
	extends SequencePushSupplierAckPOA
{
	private SequencePushSupplierAckOperations _delegate;

	private POA _poa;
	public SequencePushSupplierAckPOATie(SequencePushSupplierAckOperations delegate)
	{
		_delegate = delegate;
	}
	public SequencePushSupplierAckPOATie(SequencePushSupplierAckOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyCommAck.SequencePushSupplierAck _this()
	{
		return org.omg.CosNotifyCommAck.SequencePushSupplierAckHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyCommAck.SequencePushSupplierAck _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyCommAck.SequencePushSupplierAckHelper.narrow(_this_object(orb));
	}
	public SequencePushSupplierAckOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SequencePushSupplierAckOperations delegate)
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
	public void subscription_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.subscription_change(added,removed);
	}

	public void acknowledge(int[] sequence_numbers)
	{
_delegate.acknowledge(sequence_numbers);
	}

	public void disconnect_sequence_push_supplier()
	{
_delegate.disconnect_sequence_push_supplier();
	}

}

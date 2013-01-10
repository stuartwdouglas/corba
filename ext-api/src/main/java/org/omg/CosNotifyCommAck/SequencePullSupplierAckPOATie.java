package org.omg.CosNotifyCommAck;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "SequencePullSupplierAck".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public class SequencePullSupplierAckPOATie
	extends SequencePullSupplierAckPOA
{
	private SequencePullSupplierAckOperations _delegate;

	private POA _poa;
	public SequencePullSupplierAckPOATie(SequencePullSupplierAckOperations delegate)
	{
		_delegate = delegate;
	}
	public SequencePullSupplierAckPOATie(SequencePullSupplierAckOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyCommAck.SequencePullSupplierAck _this()
	{
		return org.omg.CosNotifyCommAck.SequencePullSupplierAckHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyCommAck.SequencePullSupplierAck _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyCommAck.SequencePullSupplierAckHelper.narrow(_this_object(orb));
	}
	public SequencePullSupplierAckOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SequencePullSupplierAckOperations delegate)
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
	public org.omg.CosNotification.StructuredEvent[] pull_structured_events(int max_number) throws org.omg.CosEventComm.Disconnected
	{
		return _delegate.pull_structured_events(max_number);
	}

	public void subscription_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.subscription_change(added,removed);
	}

	public void disconnect_sequence_pull_supplier()
	{
_delegate.disconnect_sequence_pull_supplier();
	}

	public void acknowledge(int[] sequence_numbers)
	{
_delegate.acknowledge(sequence_numbers);
	}

	public org.omg.CosNotification.StructuredEvent[] try_pull_structured_events(int max_number, org.omg.CORBA.BooleanHolder has_event) throws org.omg.CosEventComm.Disconnected
	{
		return _delegate.try_pull_structured_events(max_number,has_event);
	}

}

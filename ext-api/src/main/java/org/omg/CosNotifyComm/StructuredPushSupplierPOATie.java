package org.omg.CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "StructuredPushSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public class StructuredPushSupplierPOATie
	extends StructuredPushSupplierPOA
{
	private StructuredPushSupplierOperations _delegate;

	private POA _poa;
	public StructuredPushSupplierPOATie(StructuredPushSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public StructuredPushSupplierPOATie(StructuredPushSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyComm.StructuredPushSupplier _this()
	{
		return org.omg.CosNotifyComm.StructuredPushSupplierHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyComm.StructuredPushSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyComm.StructuredPushSupplierHelper.narrow(_this_object(orb));
	}
	public StructuredPushSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(StructuredPushSupplierOperations delegate)
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

}

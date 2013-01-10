package org.omg.CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "PushSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public class PushSupplierPOATie
	extends PushSupplierPOA
{
	private PushSupplierOperations _delegate;

	private POA _poa;
	public PushSupplierPOATie(PushSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public PushSupplierPOATie(PushSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyComm.PushSupplier _this()
	{
		return org.omg.CosNotifyComm.PushSupplierHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyComm.PushSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyComm.PushSupplierHelper.narrow(_this_object(orb));
	}
	public PushSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PushSupplierOperations delegate)
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

	public void disconnect_push_supplier()
	{
_delegate.disconnect_push_supplier();
	}

}

package org.omg.CosTypedEventComm;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TypedPullSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:53 PM
 */

public class TypedPullSupplierPOATie
	extends TypedPullSupplierPOA
{
	private TypedPullSupplierOperations _delegate;

	private POA _poa;
	public TypedPullSupplierPOATie(TypedPullSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public TypedPullSupplierPOATie(TypedPullSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTypedEventComm.TypedPullSupplier _this()
	{
		return org.omg.CosTypedEventComm.TypedPullSupplierHelper.narrow(_this_object());
	}
	public org.omg.CosTypedEventComm.TypedPullSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTypedEventComm.TypedPullSupplierHelper.narrow(_this_object(orb));
	}
	public TypedPullSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TypedPullSupplierOperations delegate)
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
	public void disconnect_pull_supplier()
	{
_delegate.disconnect_pull_supplier();
	}

	public org.omg.CORBA.Any pull() throws org.omg.CosEventComm.Disconnected
	{
		return _delegate.pull();
	}

	public org.omg.CORBA.Object get_typed_supplier()
	{
		return _delegate.get_typed_supplier();
	}

	public org.omg.CORBA.Any try_pull(org.omg.CORBA.BooleanHolder has_event) throws org.omg.CosEventComm.Disconnected
	{
		return _delegate.try_pull(has_event);
	}

}

package org.omg.CosTypedEventChannelAdmin;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TypedProxyPullSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public class TypedProxyPullSupplierPOATie
	extends TypedProxyPullSupplierPOA
{
	private TypedProxyPullSupplierOperations _delegate;

	private POA _poa;
	public TypedProxyPullSupplierPOATie(TypedProxyPullSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public TypedProxyPullSupplierPOATie(TypedProxyPullSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTypedEventChannelAdmin.TypedProxyPullSupplier _this()
	{
		return org.omg.CosTypedEventChannelAdmin.TypedProxyPullSupplierHelper.narrow(_this_object());
	}
	public org.omg.CosTypedEventChannelAdmin.TypedProxyPullSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTypedEventChannelAdmin.TypedProxyPullSupplierHelper.narrow(_this_object(orb));
	}
	public TypedProxyPullSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TypedProxyPullSupplierOperations delegate)
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

	public void connect_pull_consumer(org.omg.CosEventComm.PullConsumer pull_consumer) throws org.omg.CosEventChannelAdmin.AlreadyConnected
	{
_delegate.connect_pull_consumer(pull_consumer);
	}

	public org.omg.CORBA.Any try_pull(org.omg.CORBA.BooleanHolder has_event) throws org.omg.CosEventComm.Disconnected
	{
		return _delegate.try_pull(has_event);
	}

}

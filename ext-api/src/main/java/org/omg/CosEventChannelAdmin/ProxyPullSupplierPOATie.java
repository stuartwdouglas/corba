package org.omg.CosEventChannelAdmin;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ProxyPullSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:42 PM
 */

public class ProxyPullSupplierPOATie
	extends ProxyPullSupplierPOA
{
	private ProxyPullSupplierOperations _delegate;

	private POA _poa;
	public ProxyPullSupplierPOATie(ProxyPullSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public ProxyPullSupplierPOATie(ProxyPullSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosEventChannelAdmin.ProxyPullSupplier _this()
	{
		return org.omg.CosEventChannelAdmin.ProxyPullSupplierHelper.narrow(_this_object());
	}
	public org.omg.CosEventChannelAdmin.ProxyPullSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosEventChannelAdmin.ProxyPullSupplierHelper.narrow(_this_object(orb));
	}
	public ProxyPullSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProxyPullSupplierOperations delegate)
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

	public void connect_pull_consumer(org.omg.CosEventComm.PullConsumer pull_consumer) throws org.omg.CosEventChannelAdmin.AlreadyConnected
	{
_delegate.connect_pull_consumer(pull_consumer);
	}

	public org.omg.CORBA.Any try_pull(org.omg.CORBA.BooleanHolder has_event) throws org.omg.CosEventComm.Disconnected
	{
		return _delegate.try_pull(has_event);
	}

}

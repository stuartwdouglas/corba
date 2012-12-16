package org.omg.CosEventChannelAdmin;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ProxyPushSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:42 PM
 */

public class ProxyPushSupplierPOATie
	extends ProxyPushSupplierPOA
{
	private ProxyPushSupplierOperations _delegate;

	private POA _poa;
	public ProxyPushSupplierPOATie(ProxyPushSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public ProxyPushSupplierPOATie(ProxyPushSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosEventChannelAdmin.ProxyPushSupplier _this()
	{
		return org.omg.CosEventChannelAdmin.ProxyPushSupplierHelper.narrow(_this_object());
	}
	public org.omg.CosEventChannelAdmin.ProxyPushSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosEventChannelAdmin.ProxyPushSupplierHelper.narrow(_this_object(orb));
	}
	public ProxyPushSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProxyPushSupplierOperations delegate)
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
	public void connect_push_consumer(org.omg.CosEventComm.PushConsumer push_consumer) throws org.omg.CosEventChannelAdmin.AlreadyConnected,org.omg.CosEventChannelAdmin.TypeError
	{
_delegate.connect_push_consumer(push_consumer);
	}

	public void disconnect_push_supplier()
	{
_delegate.disconnect_push_supplier();
	}

}

package org.omg.CosEventChannelAdmin;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ConsumerAdmin".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:42 PM
 */

public class ConsumerAdminPOATie
	extends ConsumerAdminPOA
{
	private ConsumerAdminOperations _delegate;

	private POA _poa;
	public ConsumerAdminPOATie(ConsumerAdminOperations delegate)
	{
		_delegate = delegate;
	}
	public ConsumerAdminPOATie(ConsumerAdminOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosEventChannelAdmin.ConsumerAdmin _this()
	{
		return org.omg.CosEventChannelAdmin.ConsumerAdminHelper.narrow(_this_object());
	}
	public org.omg.CosEventChannelAdmin.ConsumerAdmin _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosEventChannelAdmin.ConsumerAdminHelper.narrow(_this_object(orb));
	}
	public ConsumerAdminOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ConsumerAdminOperations delegate)
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
	public org.omg.CosEventChannelAdmin.ProxyPullSupplier obtain_pull_supplier()
	{
		return _delegate.obtain_pull_supplier();
	}

	public org.omg.CosEventChannelAdmin.ProxyPushSupplier obtain_push_supplier()
	{
		return _delegate.obtain_push_supplier();
	}

}

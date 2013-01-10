package org.omg.CosTypedEventChannelAdmin;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TypedSupplierAdmin".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public class TypedSupplierAdminPOATie
	extends TypedSupplierAdminPOA
{
	private TypedSupplierAdminOperations _delegate;

	private POA _poa;
	public TypedSupplierAdminPOATie(TypedSupplierAdminOperations delegate)
	{
		_delegate = delegate;
	}
	public TypedSupplierAdminPOATie(TypedSupplierAdminOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTypedEventChannelAdmin.TypedSupplierAdmin _this()
	{
		return org.omg.CosTypedEventChannelAdmin.TypedSupplierAdminHelper.narrow(_this_object());
	}
	public org.omg.CosTypedEventChannelAdmin.TypedSupplierAdmin _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTypedEventChannelAdmin.TypedSupplierAdminHelper.narrow(_this_object(orb));
	}
	public TypedSupplierAdminOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TypedSupplierAdminOperations delegate)
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
	public org.omg.CosTypedEventChannelAdmin.TypedProxyPushConsumer obtain_typed_push_consumer(java.lang.String supported_interface) throws org.omg.CosTypedEventChannelAdmin.InterfaceNotSupported
	{
		return _delegate.obtain_typed_push_consumer(supported_interface);
	}

	public org.omg.CosEventChannelAdmin.ProxyPushConsumer obtain_push_consumer()
	{
		return _delegate.obtain_push_consumer();
	}

	public org.omg.CosEventChannelAdmin.ProxyPullConsumer obtain_pull_consumer()
	{
		return _delegate.obtain_pull_consumer();
	}

	public org.omg.CosEventChannelAdmin.ProxyPullConsumer obtain_typed_pull_consumer(java.lang.String uses_interface) throws org.omg.CosTypedEventChannelAdmin.NoSuchImplementation
	{
		return _delegate.obtain_typed_pull_consumer(uses_interface);
	}

}

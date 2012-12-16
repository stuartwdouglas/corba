package org.omg.CosTypedNotifyChannelAdmin;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TypedEventChannel".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:53 PM
 */

public class TypedEventChannelPOATie
	extends TypedEventChannelPOA
{
	private TypedEventChannelOperations _delegate;

	private POA _poa;
	public TypedEventChannelPOATie(TypedEventChannelOperations delegate)
	{
		_delegate = delegate;
	}
	public TypedEventChannelPOATie(TypedEventChannelOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTypedNotifyChannelAdmin.TypedEventChannel _this()
	{
		return org.omg.CosTypedNotifyChannelAdmin.TypedEventChannelHelper.narrow(_this_object());
	}
	public org.omg.CosTypedNotifyChannelAdmin.TypedEventChannel _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTypedNotifyChannelAdmin.TypedEventChannelHelper.narrow(_this_object(orb));
	}
	public TypedEventChannelOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TypedEventChannelOperations delegate)
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
	public org.omg.CosTypedEventChannelAdmin.TypedConsumerAdmin for_consumers()
	{
		return _delegate.for_consumers();
	}

	public int[] get_all_consumeradmins()
	{
		return _delegate.get_all_consumeradmins();
	}

	public int[] get_all_supplieradmins()
	{
		return _delegate.get_all_supplieradmins();
	}

	public org.omg.CosNotification.Property[] get_qos()
	{
		return _delegate.get_qos();
	}

	public org.omg.CosTypedNotifyChannelAdmin.TypedEventChannelFactory MyFactory()
	{
		return _delegate.MyFactory();
	}

	public org.omg.CosTypedNotifyChannelAdmin.TypedConsumerAdmin default_consumer_admin()
	{
		return _delegate.default_consumer_admin();
	}

	public org.omg.CosTypedNotifyChannelAdmin.TypedSupplierAdmin new_for_typed_notification_suppliers(org.omg.CosNotifyChannelAdmin.InterFilterGroupOperator op, org.omg.CORBA.IntHolder id)
	{
		return _delegate.new_for_typed_notification_suppliers(op,id);
	}

	public void set_admin(org.omg.CosNotification.Property[] admin) throws org.omg.CosNotification.UnsupportedAdmin
	{
_delegate.set_admin(admin);
	}

	public org.omg.CosTypedNotifyChannelAdmin.TypedSupplierAdmin default_supplier_admin()
	{
		return _delegate.default_supplier_admin();
	}

	public org.omg.CosTypedNotifyChannelAdmin.TypedSupplierAdmin get_supplieradmin(int id) throws org.omg.CosNotifyChannelAdmin.AdminNotFound
	{
		return _delegate.get_supplieradmin(id);
	}

	public org.omg.CosTypedEventChannelAdmin.TypedSupplierAdmin for_suppliers()
	{
		return _delegate.for_suppliers();
	}

	public void set_qos(org.omg.CosNotification.Property[] qos) throws org.omg.CosNotification.UnsupportedQoS
	{
_delegate.set_qos(qos);
	}

	public org.omg.CosNotifyFilter.FilterFactory default_filter_factory()
	{
		return _delegate.default_filter_factory();
	}

	public org.omg.CosTypedNotifyChannelAdmin.TypedConsumerAdmin new_for_typed_notification_consumers(org.omg.CosNotifyChannelAdmin.InterFilterGroupOperator op, org.omg.CORBA.IntHolder id)
	{
		return _delegate.new_for_typed_notification_consumers(op,id);
	}

	public org.omg.CosNotification.Property[] get_admin()
	{
		return _delegate.get_admin();
	}

	public void validate_qos(org.omg.CosNotification.Property[] required_qos, org.omg.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.CosNotification.UnsupportedQoS
	{
_delegate.validate_qos(required_qos,available_qos);
	}

	public org.omg.CosTypedNotifyChannelAdmin.TypedConsumerAdmin get_consumeradmin(int id) throws org.omg.CosNotifyChannelAdmin.AdminNotFound
	{
		return _delegate.get_consumeradmin(id);
	}

	public void destroy()
	{
_delegate.destroy();
	}

}

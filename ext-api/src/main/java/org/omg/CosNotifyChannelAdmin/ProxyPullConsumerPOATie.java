package org.omg.CosNotifyChannelAdmin;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ProxyPullConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public class ProxyPullConsumerPOATie
	extends ProxyPullConsumerPOA
{
	private ProxyPullConsumerOperations _delegate;

	private POA _poa;
	public ProxyPullConsumerPOATie(ProxyPullConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public ProxyPullConsumerPOATie(ProxyPullConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyChannelAdmin.ProxyPullConsumer _this()
	{
		return org.omg.CosNotifyChannelAdmin.ProxyPullConsumerHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyChannelAdmin.ProxyPullConsumer _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyChannelAdmin.ProxyPullConsumerHelper.narrow(_this_object(orb));
	}
	public ProxyPullConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProxyPullConsumerOperations delegate)
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
	public org.omg.CosNotifyChannelAdmin.ProxyType MyType()
	{
		return _delegate.MyType();
	}

	public void set_qos(org.omg.CosNotification.Property[] qos) throws org.omg.CosNotification.UnsupportedQoS
	{
_delegate.set_qos(qos);
	}

	public void connect_any_pull_supplier(org.omg.CosEventComm.PullSupplier pull_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected,org.omg.CosEventChannelAdmin.TypeError
	{
_delegate.connect_any_pull_supplier(pull_supplier);
	}

	public void validate_event_qos(org.omg.CosNotification.Property[] required_qos, org.omg.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.CosNotification.UnsupportedQoS
	{
_delegate.validate_event_qos(required_qos,available_qos);
	}

	public void offer_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.offer_change(added,removed);
	}

	public void suspend_connection() throws org.omg.CosNotifyChannelAdmin.NotConnected,org.omg.CosNotifyChannelAdmin.ConnectionAlreadyInactive
	{
_delegate.suspend_connection();
	}

	public org.omg.CosNotification.EventType[] obtain_subscription_types(org.omg.CosNotifyChannelAdmin.ObtainInfoMode mode)
	{
		return _delegate.obtain_subscription_types(mode);
	}

	public int add_filter(org.omg.CosNotifyFilter.Filter new_filter)
	{
		return _delegate.add_filter(new_filter);
	}

	public void disconnect_pull_consumer()
	{
_delegate.disconnect_pull_consumer();
	}

	public void remove_filter(int filter) throws org.omg.CosNotifyFilter.FilterNotFound
	{
_delegate.remove_filter(filter);
	}

	public void remove_all_filters()
	{
_delegate.remove_all_filters();
	}

	public int[] get_all_filters()
	{
		return _delegate.get_all_filters();
	}

	public org.omg.CosNotifyChannelAdmin.SupplierAdmin MyAdmin()
	{
		return _delegate.MyAdmin();
	}

	public org.omg.CosNotifyFilter.Filter get_filter(int filter) throws org.omg.CosNotifyFilter.FilterNotFound
	{
		return _delegate.get_filter(filter);
	}

	public void resume_connection() throws org.omg.CosNotifyChannelAdmin.ConnectionAlreadyActive,org.omg.CosNotifyChannelAdmin.NotConnected
	{
_delegate.resume_connection();
	}

	public void validate_qos(org.omg.CosNotification.Property[] required_qos, org.omg.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.CosNotification.UnsupportedQoS
	{
_delegate.validate_qos(required_qos,available_qos);
	}

	public org.omg.CosNotification.Property[] get_qos()
	{
		return _delegate.get_qos();
	}

}

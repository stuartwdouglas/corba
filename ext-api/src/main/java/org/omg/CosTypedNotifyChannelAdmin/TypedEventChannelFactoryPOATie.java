package org.omg.CosTypedNotifyChannelAdmin;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TypedEventChannelFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:53 PM
 */

public class TypedEventChannelFactoryPOATie
	extends TypedEventChannelFactoryPOA
{
	private TypedEventChannelFactoryOperations _delegate;

	private POA _poa;
	public TypedEventChannelFactoryPOATie(TypedEventChannelFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public TypedEventChannelFactoryPOATie(TypedEventChannelFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTypedNotifyChannelAdmin.TypedEventChannelFactory _this()
	{
		return org.omg.CosTypedNotifyChannelAdmin.TypedEventChannelFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosTypedNotifyChannelAdmin.TypedEventChannelFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTypedNotifyChannelAdmin.TypedEventChannelFactoryHelper.narrow(_this_object(orb));
	}
	public TypedEventChannelFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TypedEventChannelFactoryOperations delegate)
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
	public org.omg.CosTypedNotifyChannelAdmin.TypedEventChannel get_typed_event_channel(int id) throws org.omg.CosNotifyChannelAdmin.ChannelNotFound
	{
		return _delegate.get_typed_event_channel(id);
	}

	public int[] get_all_typed_channels()
	{
		return _delegate.get_all_typed_channels();
	}

	public org.omg.CosTypedNotifyChannelAdmin.TypedEventChannel create_typed_channel(org.omg.CosNotification.Property[] initial_QoS, org.omg.CosNotification.Property[] initial_admin, org.omg.CORBA.IntHolder id) throws org.omg.CosNotification.UnsupportedAdmin,org.omg.CosNotification.UnsupportedQoS
	{
		return _delegate.create_typed_channel(initial_QoS,initial_admin,id);
	}

}

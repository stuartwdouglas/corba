package org.omg.CosTypedNotifyChannelAdmin;


/**
 * Generated from IDL interface "TypedProxyPullSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public abstract class TypedProxyPullSupplierPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosTypedNotifyChannelAdmin.TypedProxyPullSupplierOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "disconnect_pull_supplier", new java.lang.Integer(0));
		m_opsHash.put ( "get_all_filters", new java.lang.Integer(1));
		m_opsHash.put ( "try_pull", new java.lang.Integer(2));
		m_opsHash.put ( "get_qos", new java.lang.Integer(3));
		m_opsHash.put ( "_get_lifetime_filter", new java.lang.Integer(4));
		m_opsHash.put ( "get_typed_supplier", new java.lang.Integer(5));
		m_opsHash.put ( "_get_MyType", new java.lang.Integer(6));
		m_opsHash.put ( "_get_priority_filter", new java.lang.Integer(7));
		m_opsHash.put ( "get_filter", new java.lang.Integer(8));
		m_opsHash.put ( "set_qos", new java.lang.Integer(9));
		m_opsHash.put ( "pull", new java.lang.Integer(10));
		m_opsHash.put ( "obtain_offered_types", new java.lang.Integer(11));
		m_opsHash.put ( "add_filter", new java.lang.Integer(12));
		m_opsHash.put ( "subscription_change", new java.lang.Integer(13));
		m_opsHash.put ( "_set_priority_filter", new java.lang.Integer(14));
		m_opsHash.put ( "validate_event_qos", new java.lang.Integer(15));
		m_opsHash.put ( "remove_filter", new java.lang.Integer(16));
		m_opsHash.put ( "remove_all_filters", new java.lang.Integer(17));
		m_opsHash.put ( "validate_qos", new java.lang.Integer(18));
		m_opsHash.put ( "_set_lifetime_filter", new java.lang.Integer(19));
		m_opsHash.put ( "_get_MyAdmin", new java.lang.Integer(20));
		m_opsHash.put ( "connect_typed_pull_consumer", new java.lang.Integer(21));
	}
	private String[] ids = {"IDL:omg.org/CosTypedNotifyChannelAdmin/TypedProxyPullSupplier:1.0","IDL:omg.org/CosNotifyChannelAdmin/ProxySupplier:1.0","IDL:omg.org/CosTypedNotifyComm/TypedPullSupplier:1.0","IDL:omg.org/CosTypedEventComm/TypedPullSupplier:1.0","IDL:omg.org/CosNotifyComm/NotifySubscribe:1.0","IDL:omg.org/CosNotifyFilter/FilterAdmin:1.0","IDL:omg.org/CosEventComm/PullSupplier:1.0","IDL:omg.org/CosNotification/QoSAdmin:1.0"};
	public org.omg.CosTypedNotifyChannelAdmin.TypedProxyPullSupplier _this()
	{
		return org.omg.CosTypedNotifyChannelAdmin.TypedProxyPullSupplierHelper.narrow(_this_object());
	}
	public org.omg.CosTypedNotifyChannelAdmin.TypedProxyPullSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTypedNotifyChannelAdmin.TypedProxyPullSupplierHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // disconnect_pull_supplier
			{
				_out = handler.createReply();
				disconnect_pull_supplier();
				break;
			}
			case 1: // get_all_filters
			{
				_out = handler.createReply();
				org.omg.CosNotifyFilter.FilterIDSeqHelper.write(_out,get_all_filters());
				break;
			}
			case 2: // try_pull
			{
			try
			{
				org.omg.CORBA.BooleanHolder _arg0= new org.omg.CORBA.BooleanHolder();
				_out = handler.createReply();
				_out.write_any(try_pull(_arg0));
				_out.write_boolean(_arg0.value);
			}
			catch(org.omg.CosEventComm.Disconnected _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosEventComm.DisconnectedHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // get_qos
			{
				_out = handler.createReply();
				org.omg.CosNotification.PropertySeqHelper.write(_out,get_qos());
				break;
			}
			case 4: // _get_lifetime_filter
			{
			_out = handler.createReply();
			org.omg.CosNotifyFilter.MappingFilterHelper.write(_out,lifetime_filter());
				break;
			}
			case 5: // get_typed_supplier
			{
				_out = handler.createReply();
				_out.write_Object(get_typed_supplier());
				break;
			}
			case 6: // _get_MyType
			{
			_out = handler.createReply();
			org.omg.CosNotifyChannelAdmin.ProxyTypeHelper.write(_out,MyType());
				break;
			}
			case 7: // _get_priority_filter
			{
			_out = handler.createReply();
			org.omg.CosNotifyFilter.MappingFilterHelper.write(_out,priority_filter());
				break;
			}
			case 8: // get_filter
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				org.omg.CosNotifyFilter.FilterHelper.write(_out,get_filter(_arg0));
			}
			catch(org.omg.CosNotifyFilter.FilterNotFound _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyFilter.FilterNotFoundHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // set_qos
			{
			try
			{
				org.omg.CosNotification.Property[] _arg0=org.omg.CosNotification.PropertySeqHelper.read(_input);
				_out = handler.createReply();
				set_qos(_arg0);
			}
			catch(org.omg.CosNotification.UnsupportedQoS _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotification.UnsupportedQoSHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // pull
			{
			try
			{
				_out = handler.createReply();
				_out.write_any(pull());
			}
			catch(org.omg.CosEventComm.Disconnected _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosEventComm.DisconnectedHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // obtain_offered_types
			{
				org.omg.CosNotifyChannelAdmin.ObtainInfoMode _arg0=org.omg.CosNotifyChannelAdmin.ObtainInfoModeHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosNotification.EventTypeSeqHelper.write(_out,obtain_offered_types(_arg0));
				break;
			}
			case 12: // add_filter
			{
				org.omg.CosNotifyFilter.Filter _arg0=org.omg.CosNotifyFilter.FilterHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(add_filter(_arg0));
				break;
			}
			case 13: // subscription_change
			{
			try
			{
				org.omg.CosNotification.EventType[] _arg0=org.omg.CosNotification.EventTypeSeqHelper.read(_input);
				org.omg.CosNotification.EventType[] _arg1=org.omg.CosNotification.EventTypeSeqHelper.read(_input);
				_out = handler.createReply();
				subscription_change(_arg0,_arg1);
			}
			catch(org.omg.CosNotifyComm.InvalidEventType _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyComm.InvalidEventTypeHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // _set_priority_filter
			{
			_out = handler.createReply();
			priority_filter(org.omg.CosNotifyFilter.MappingFilterHelper.read(_input));
				break;
			}
			case 15: // validate_event_qos
			{
			try
			{
				org.omg.CosNotification.Property[] _arg0=org.omg.CosNotification.PropertySeqHelper.read(_input);
				org.omg.CosNotification.NamedPropertyRangeSeqHolder _arg1= new org.omg.CosNotification.NamedPropertyRangeSeqHolder();
				_out = handler.createReply();
				validate_event_qos(_arg0,_arg1);
				org.omg.CosNotification.NamedPropertyRangeSeqHelper.write(_out,_arg1.value);
			}
			catch(org.omg.CosNotification.UnsupportedQoS _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotification.UnsupportedQoSHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // remove_filter
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				remove_filter(_arg0);
			}
			catch(org.omg.CosNotifyFilter.FilterNotFound _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyFilter.FilterNotFoundHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // remove_all_filters
			{
				_out = handler.createReply();
				remove_all_filters();
				break;
			}
			case 18: // validate_qos
			{
			try
			{
				org.omg.CosNotification.Property[] _arg0=org.omg.CosNotification.PropertySeqHelper.read(_input);
				org.omg.CosNotification.NamedPropertyRangeSeqHolder _arg1= new org.omg.CosNotification.NamedPropertyRangeSeqHolder();
				_out = handler.createReply();
				validate_qos(_arg0,_arg1);
				org.omg.CosNotification.NamedPropertyRangeSeqHelper.write(_out,_arg1.value);
			}
			catch(org.omg.CosNotification.UnsupportedQoS _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotification.UnsupportedQoSHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // _set_lifetime_filter
			{
			_out = handler.createReply();
			lifetime_filter(org.omg.CosNotifyFilter.MappingFilterHelper.read(_input));
				break;
			}
			case 20: // _get_MyAdmin
			{
			_out = handler.createReply();
			org.omg.CosNotifyChannelAdmin.ConsumerAdminHelper.write(_out,MyAdmin());
				break;
			}
			case 21: // connect_typed_pull_consumer
			{
			try
			{
				org.omg.CosEventComm.PullConsumer _arg0=org.omg.CosEventComm.PullConsumerHelper.read(_input);
				_out = handler.createReply();
				connect_typed_pull_consumer(_arg0);
			}
			catch(org.omg.CosEventChannelAdmin.AlreadyConnected _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosEventChannelAdmin.AlreadyConnectedHelper.write(_out, _ex0);
			}
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}

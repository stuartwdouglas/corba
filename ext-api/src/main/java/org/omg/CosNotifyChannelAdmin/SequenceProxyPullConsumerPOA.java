package org.omg.CosNotifyChannelAdmin;


/**
 * Generated from IDL interface "SequenceProxyPullConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public abstract class SequenceProxyPullConsumerPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosNotifyChannelAdmin.SequenceProxyPullConsumerOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "connect_sequence_pull_supplier", new java.lang.Integer(0));
		m_opsHash.put ( "_get_MyType", new java.lang.Integer(1));
		m_opsHash.put ( "set_qos", new java.lang.Integer(2));
		m_opsHash.put ( "validate_event_qos", new java.lang.Integer(3));
		m_opsHash.put ( "offer_change", new java.lang.Integer(4));
		m_opsHash.put ( "suspend_connection", new java.lang.Integer(5));
		m_opsHash.put ( "obtain_subscription_types", new java.lang.Integer(6));
		m_opsHash.put ( "add_filter", new java.lang.Integer(7));
		m_opsHash.put ( "disconnect_sequence_pull_consumer", new java.lang.Integer(8));
		m_opsHash.put ( "remove_filter", new java.lang.Integer(9));
		m_opsHash.put ( "remove_all_filters", new java.lang.Integer(10));
		m_opsHash.put ( "get_all_filters", new java.lang.Integer(11));
		m_opsHash.put ( "_get_MyAdmin", new java.lang.Integer(12));
		m_opsHash.put ( "get_filter", new java.lang.Integer(13));
		m_opsHash.put ( "resume_connection", new java.lang.Integer(14));
		m_opsHash.put ( "validate_qos", new java.lang.Integer(15));
		m_opsHash.put ( "get_qos", new java.lang.Integer(16));
	}
	private String[] ids = {"IDL:omg.org/CosNotifyChannelAdmin/SequenceProxyPullConsumer:1.0","IDL:omg.org/CosNotifyComm/SequencePullConsumer:1.0","IDL:omg.org/CosNotifyComm/NotifyPublish:1.0","IDL:omg.org/CosNotifyFilter/FilterAdmin:1.0","IDL:omg.org/CosNotification/QoSAdmin:1.0","IDL:omg.org/CosNotifyChannelAdmin/ProxyConsumer:1.0"};
	public org.omg.CosNotifyChannelAdmin.SequenceProxyPullConsumer _this()
	{
		return org.omg.CosNotifyChannelAdmin.SequenceProxyPullConsumerHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyChannelAdmin.SequenceProxyPullConsumer _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyChannelAdmin.SequenceProxyPullConsumerHelper.narrow(_this_object(orb));
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
			case 0: // connect_sequence_pull_supplier
			{
			try
			{
				org.omg.CosNotifyComm.SequencePullSupplier _arg0=org.omg.CosNotifyComm.SequencePullSupplierHelper.read(_input);
				_out = handler.createReply();
				connect_sequence_pull_supplier(_arg0);
			}
			catch(org.omg.CosEventChannelAdmin.AlreadyConnected _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosEventChannelAdmin.AlreadyConnectedHelper.write(_out, _ex0);
			}
			catch(org.omg.CosEventChannelAdmin.TypeError _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosEventChannelAdmin.TypeErrorHelper.write(_out, _ex1);
			}
				break;
			}
			case 1: // _get_MyType
			{
			_out = handler.createReply();
			org.omg.CosNotifyChannelAdmin.ProxyTypeHelper.write(_out,MyType());
				break;
			}
			case 2: // set_qos
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
			case 3: // validate_event_qos
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
			case 4: // offer_change
			{
			try
			{
				org.omg.CosNotification.EventType[] _arg0=org.omg.CosNotification.EventTypeSeqHelper.read(_input);
				org.omg.CosNotification.EventType[] _arg1=org.omg.CosNotification.EventTypeSeqHelper.read(_input);
				_out = handler.createReply();
				offer_change(_arg0,_arg1);
			}
			catch(org.omg.CosNotifyComm.InvalidEventType _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyComm.InvalidEventTypeHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // suspend_connection
			{
			try
			{
				_out = handler.createReply();
				suspend_connection();
			}
			catch(org.omg.CosNotifyChannelAdmin.NotConnected _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyChannelAdmin.NotConnectedHelper.write(_out, _ex0);
			}
			catch(org.omg.CosNotifyChannelAdmin.ConnectionAlreadyInactive _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyChannelAdmin.ConnectionAlreadyInactiveHelper.write(_out, _ex1);
			}
				break;
			}
			case 6: // obtain_subscription_types
			{
				org.omg.CosNotifyChannelAdmin.ObtainInfoMode _arg0=org.omg.CosNotifyChannelAdmin.ObtainInfoModeHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosNotification.EventTypeSeqHelper.write(_out,obtain_subscription_types(_arg0));
				break;
			}
			case 7: // add_filter
			{
				org.omg.CosNotifyFilter.Filter _arg0=org.omg.CosNotifyFilter.FilterHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(add_filter(_arg0));
				break;
			}
			case 8: // disconnect_sequence_pull_consumer
			{
				_out = handler.createReply();
				disconnect_sequence_pull_consumer();
				break;
			}
			case 9: // remove_filter
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
			case 10: // remove_all_filters
			{
				_out = handler.createReply();
				remove_all_filters();
				break;
			}
			case 11: // get_all_filters
			{
				_out = handler.createReply();
				org.omg.CosNotifyFilter.FilterIDSeqHelper.write(_out,get_all_filters());
				break;
			}
			case 12: // _get_MyAdmin
			{
			_out = handler.createReply();
			org.omg.CosNotifyChannelAdmin.SupplierAdminHelper.write(_out,MyAdmin());
				break;
			}
			case 13: // get_filter
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
			case 14: // resume_connection
			{
			try
			{
				_out = handler.createReply();
				resume_connection();
			}
			catch(org.omg.CosNotifyChannelAdmin.ConnectionAlreadyActive _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyChannelAdmin.ConnectionAlreadyActiveHelper.write(_out, _ex0);
			}
			catch(org.omg.CosNotifyChannelAdmin.NotConnected _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyChannelAdmin.NotConnectedHelper.write(_out, _ex1);
			}
				break;
			}
			case 15: // validate_qos
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
			case 16: // get_qos
			{
				_out = handler.createReply();
				org.omg.CosNotification.PropertySeqHelper.write(_out,get_qos());
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

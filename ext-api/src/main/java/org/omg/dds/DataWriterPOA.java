package org.omg.dds;


/**
 * Generated from IDL interface "DataWriter".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public abstract class DataWriterPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.dds.DataWriterOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "assert_liveliness", new java.lang.Integer(0));
		m_opsHash.put ( "set_qos", new java.lang.Integer(1));
		m_opsHash.put ( "get_statuscondition", new java.lang.Integer(2));
		m_opsHash.put ( "get_matched_subscription_data", new java.lang.Integer(3));
		m_opsHash.put ( "get_offered_incompatible_qos_status", new java.lang.Integer(4));
		m_opsHash.put ( "get_topic", new java.lang.Integer(5));
		m_opsHash.put ( "get_status_changes", new java.lang.Integer(6));
		m_opsHash.put ( "get_qos", new java.lang.Integer(7));
		m_opsHash.put ( "get_matched_subscriptions", new java.lang.Integer(8));
		m_opsHash.put ( "get_liveliness_lost_status", new java.lang.Integer(9));
		m_opsHash.put ( "get_publication_match_status", new java.lang.Integer(10));
		m_opsHash.put ( "enable", new java.lang.Integer(11));
		m_opsHash.put ( "set_listener", new java.lang.Integer(12));
		m_opsHash.put ( "get_offered_deadline_missed_status", new java.lang.Integer(13));
		m_opsHash.put ( "get_publisher", new java.lang.Integer(14));
		m_opsHash.put ( "get_listener", new java.lang.Integer(15));
	}
	private String[] ids = {"IDL:omg.org/dds/DataWriter:1.0","IDL:omg.org/dds/Entity:1.0"};
	public org.omg.dds.DataWriter _this()
	{
		return org.omg.dds.DataWriterHelper.narrow(_this_object());
	}
	public org.omg.dds.DataWriter _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.DataWriterHelper.narrow(_this_object(orb));
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
			case 0: // assert_liveliness
			{
				_out = handler.createReply();
				assert_liveliness();
				break;
			}
			case 1: // set_qos
			{
				org.omg.dds.DataWriterQos _arg0=org.omg.dds.DataWriterQosHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(set_qos(_arg0));
				break;
			}
			case 2: // get_statuscondition
			{
				_out = handler.createReply();
				org.omg.dds.StatusConditionHelper.write(_out,get_statuscondition());
				break;
			}
			case 3: // get_matched_subscription_data
			{
				org.omg.dds.SubscriptionBuiltinTopicDataHolder _arg0= new org.omg.dds.SubscriptionBuiltinTopicDataHolder();
				_arg0._read (_input);
				int _arg1=_input.read_long();
				_out = handler.createReply();
				_out.write_long(get_matched_subscription_data(_arg0,_arg1));
				org.omg.dds.SubscriptionBuiltinTopicDataHelper.write(_out,_arg0.value);
				break;
			}
			case 4: // get_offered_incompatible_qos_status
			{
				_out = handler.createReply();
				org.omg.dds.OfferedIncompatibleQosStatusHelper.write(_out,get_offered_incompatible_qos_status());
				break;
			}
			case 5: // get_topic
			{
				_out = handler.createReply();
				org.omg.dds.TopicHelper.write(_out,get_topic());
				break;
			}
			case 6: // get_status_changes
			{
				_out = handler.createReply();
				_out.write_ulong(get_status_changes());
				break;
			}
			case 7: // get_qos
			{
				org.omg.dds.DataWriterQosHolder _arg0= new org.omg.dds.DataWriterQosHolder();
				_arg0._read (_input);
				_out = handler.createReply();
				get_qos(_arg0);
				org.omg.dds.DataWriterQosHelper.write(_out,_arg0.value);
				break;
			}
			case 8: // get_matched_subscriptions
			{
				org.omg.dds.InstanceHandleSeqHolder _arg0= new org.omg.dds.InstanceHandleSeqHolder();
				_arg0._read (_input);
				_out = handler.createReply();
				_out.write_long(get_matched_subscriptions(_arg0));
				org.omg.dds.InstanceHandleSeqHelper.write(_out,_arg0.value);
				break;
			}
			case 9: // get_liveliness_lost_status
			{
				_out = handler.createReply();
				org.omg.dds.LivelinessLostStatusHelper.write(_out,get_liveliness_lost_status());
				break;
			}
			case 10: // get_publication_match_status
			{
				_out = handler.createReply();
				org.omg.dds.PublicationMatchStatusHelper.write(_out,get_publication_match_status());
				break;
			}
			case 11: // enable
			{
				_out = handler.createReply();
				_out.write_long(enable());
				break;
			}
			case 12: // set_listener
			{
				org.omg.dds.DataWriterListener _arg0=org.omg.dds.DataWriterListenerHelper.read(_input);
				int _arg1=_input.read_ulong();
				_out = handler.createReply();
				_out.write_long(set_listener(_arg0,_arg1));
				break;
			}
			case 13: // get_offered_deadline_missed_status
			{
				_out = handler.createReply();
				org.omg.dds.OfferedDeadlineMissedStatusHelper.write(_out,get_offered_deadline_missed_status());
				break;
			}
			case 14: // get_publisher
			{
				_out = handler.createReply();
				org.omg.dds.PublisherHelper.write(_out,get_publisher());
				break;
			}
			case 15: // get_listener
			{
				_out = handler.createReply();
				org.omg.dds.DataWriterListenerHelper.write(_out,get_listener());
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

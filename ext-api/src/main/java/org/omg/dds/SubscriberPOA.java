package org.omg.dds;


/**
 * Generated from IDL interface "Subscriber".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public abstract class SubscriberPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.dds.SubscriberOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "set_default_datareader_qos", new java.lang.Integer(0));
		m_opsHash.put ( "begin_access", new java.lang.Integer(1));
		m_opsHash.put ( "get_statuscondition", new java.lang.Integer(2));
		m_opsHash.put ( "get_default_datareader_qos", new java.lang.Integer(3));
		m_opsHash.put ( "get_datareaders", new java.lang.Integer(4));
		m_opsHash.put ( "enable", new java.lang.Integer(5));
		m_opsHash.put ( "notify_datareaders", new java.lang.Integer(6));
		m_opsHash.put ( "create_datareader", new java.lang.Integer(7));
		m_opsHash.put ( "end_access", new java.lang.Integer(8));
		m_opsHash.put ( "get_status_changes", new java.lang.Integer(9));
		m_opsHash.put ( "get_listener", new java.lang.Integer(10));
		m_opsHash.put ( "copy_from_topic_qos", new java.lang.Integer(11));
		m_opsHash.put ( "get_participant", new java.lang.Integer(12));
		m_opsHash.put ( "get_qos", new java.lang.Integer(13));
		m_opsHash.put ( "delete_contained_entities", new java.lang.Integer(14));
		m_opsHash.put ( "delete_datareader", new java.lang.Integer(15));
		m_opsHash.put ( "lookup_datareader", new java.lang.Integer(16));
		m_opsHash.put ( "set_listener", new java.lang.Integer(17));
		m_opsHash.put ( "set_qos", new java.lang.Integer(18));
	}
	private String[] ids = {"IDL:omg.org/dds/Subscriber:1.0","IDL:omg.org/dds/Entity:1.0"};
	public org.omg.dds.Subscriber _this()
	{
		return org.omg.dds.SubscriberHelper.narrow(_this_object());
	}
	public org.omg.dds.Subscriber _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.SubscriberHelper.narrow(_this_object(orb));
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
			case 0: // set_default_datareader_qos
			{
				org.omg.dds.DataReaderQos _arg0=org.omg.dds.DataReaderQosHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(set_default_datareader_qos(_arg0));
				break;
			}
			case 1: // begin_access
			{
				_out = handler.createReply();
				_out.write_long(begin_access());
				break;
			}
			case 2: // get_statuscondition
			{
				_out = handler.createReply();
				org.omg.dds.StatusConditionHelper.write(_out,get_statuscondition());
				break;
			}
			case 3: // get_default_datareader_qos
			{
				org.omg.dds.DataReaderQosHolder _arg0= new org.omg.dds.DataReaderQosHolder();
				_out = handler.createReply();
				get_default_datareader_qos(_arg0);
				org.omg.dds.DataReaderQosHelper.write(_out,_arg0.value);
				break;
			}
			case 4: // get_datareaders
			{
				org.omg.dds.DataReaderSeqHolder _arg0= new org.omg.dds.DataReaderSeqHolder();
				int _arg1=_input.read_ulong();
				int _arg2=_input.read_ulong();
				int _arg3=_input.read_ulong();
				_out = handler.createReply();
				_out.write_long(get_datareaders(_arg0,_arg1,_arg2,_arg3));
				org.omg.dds.DataReaderSeqHelper.write(_out,_arg0.value);
				break;
			}
			case 5: // enable
			{
				_out = handler.createReply();
				_out.write_long(enable());
				break;
			}
			case 6: // notify_datareaders
			{
				_out = handler.createReply();
				notify_datareaders();
				break;
			}
			case 7: // create_datareader
			{
				org.omg.dds.TopicDescription _arg0=org.omg.dds.TopicDescriptionHelper.read(_input);
				org.omg.dds.DataReaderQos _arg1=org.omg.dds.DataReaderQosHelper.read(_input);
				org.omg.dds.DataReaderListener _arg2=org.omg.dds.DataReaderListenerHelper.read(_input);
				_out = handler.createReply();
				org.omg.dds.DataReaderHelper.write(_out,create_datareader(_arg0,_arg1,_arg2));
				break;
			}
			case 8: // end_access
			{
				_out = handler.createReply();
				_out.write_long(end_access());
				break;
			}
			case 9: // get_status_changes
			{
				_out = handler.createReply();
				_out.write_ulong(get_status_changes());
				break;
			}
			case 10: // get_listener
			{
				_out = handler.createReply();
				org.omg.dds.SubscriberListenerHelper.write(_out,get_listener());
				break;
			}
			case 11: // copy_from_topic_qos
			{
				org.omg.dds.DataReaderQosHolder _arg0= new org.omg.dds.DataReaderQosHolder();
				_arg0._read (_input);
				org.omg.dds.TopicQos _arg1=org.omg.dds.TopicQosHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(copy_from_topic_qos(_arg0,_arg1));
				org.omg.dds.DataReaderQosHelper.write(_out,_arg0.value);
				break;
			}
			case 12: // get_participant
			{
				_out = handler.createReply();
				org.omg.dds.DomainParticipantHelper.write(_out,get_participant());
				break;
			}
			case 13: // get_qos
			{
				org.omg.dds.SubscriberQosHolder _arg0= new org.omg.dds.SubscriberQosHolder();
				_arg0._read (_input);
				_out = handler.createReply();
				get_qos(_arg0);
				org.omg.dds.SubscriberQosHelper.write(_out,_arg0.value);
				break;
			}
			case 14: // delete_contained_entities
			{
				_out = handler.createReply();
				_out.write_long(delete_contained_entities());
				break;
			}
			case 15: // delete_datareader
			{
				org.omg.dds.DataReader _arg0=org.omg.dds.DataReaderHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(delete_datareader(_arg0));
				break;
			}
			case 16: // lookup_datareader
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				org.omg.dds.DataReaderHelper.write(_out,lookup_datareader(_arg0));
				break;
			}
			case 17: // set_listener
			{
				org.omg.dds.SubscriberListener _arg0=org.omg.dds.SubscriberListenerHelper.read(_input);
				int _arg1=_input.read_ulong();
				_out = handler.createReply();
				_out.write_long(set_listener(_arg0,_arg1));
				break;
			}
			case 18: // set_qos
			{
				org.omg.dds.SubscriberQos _arg0=org.omg.dds.SubscriberQosHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(set_qos(_arg0));
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

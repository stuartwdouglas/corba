package org.omg.dds;


/**
 * Generated from IDL interface "Publisher".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public abstract class PublisherPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.dds.PublisherOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "set_listener", new java.lang.Integer(0));
		m_opsHash.put ( "copy_from_topic_qos", new java.lang.Integer(1));
		m_opsHash.put ( "get_qos", new java.lang.Integer(2));
		m_opsHash.put ( "create_datawriter", new java.lang.Integer(3));
		m_opsHash.put ( "get_statuscondition", new java.lang.Integer(4));
		m_opsHash.put ( "lookup_datawriter", new java.lang.Integer(5));
		m_opsHash.put ( "set_qos", new java.lang.Integer(6));
		m_opsHash.put ( "delete_datawriter", new java.lang.Integer(7));
		m_opsHash.put ( "enable", new java.lang.Integer(8));
		m_opsHash.put ( "get_default_datawriter_qos", new java.lang.Integer(9));
		m_opsHash.put ( "end_coherent_changes", new java.lang.Integer(10));
		m_opsHash.put ( "get_status_changes", new java.lang.Integer(11));
		m_opsHash.put ( "get_listener", new java.lang.Integer(12));
		m_opsHash.put ( "get_participant", new java.lang.Integer(13));
		m_opsHash.put ( "suspend_publications", new java.lang.Integer(14));
		m_opsHash.put ( "set_default_datawriter_qos", new java.lang.Integer(15));
		m_opsHash.put ( "delete_contained_entities", new java.lang.Integer(16));
		m_opsHash.put ( "begin_coherent_changes", new java.lang.Integer(17));
		m_opsHash.put ( "resume_publications", new java.lang.Integer(18));
	}
	private String[] ids = {"IDL:omg.org/dds/Publisher:1.0","IDL:omg.org/dds/Entity:1.0"};
	public org.omg.dds.Publisher _this()
	{
		return org.omg.dds.PublisherHelper.narrow(_this_object());
	}
	public org.omg.dds.Publisher _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.PublisherHelper.narrow(_this_object(orb));
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
			case 0: // set_listener
			{
				org.omg.dds.PublisherListener _arg0=org.omg.dds.PublisherListenerHelper.read(_input);
				int _arg1=_input.read_ulong();
				_out = handler.createReply();
				_out.write_long(set_listener(_arg0,_arg1));
				break;
			}
			case 1: // copy_from_topic_qos
			{
				org.omg.dds.DataWriterQosHolder _arg0= new org.omg.dds.DataWriterQosHolder();
				_arg0._read (_input);
				org.omg.dds.TopicQos _arg1=org.omg.dds.TopicQosHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(copy_from_topic_qos(_arg0,_arg1));
				org.omg.dds.DataWriterQosHelper.write(_out,_arg0.value);
				break;
			}
			case 2: // get_qos
			{
				org.omg.dds.PublisherQosHolder _arg0= new org.omg.dds.PublisherQosHolder();
				_arg0._read (_input);
				_out = handler.createReply();
				get_qos(_arg0);
				org.omg.dds.PublisherQosHelper.write(_out,_arg0.value);
				break;
			}
			case 3: // create_datawriter
			{
				org.omg.dds.Topic _arg0=org.omg.dds.TopicHelper.read(_input);
				org.omg.dds.DataWriterQos _arg1=org.omg.dds.DataWriterQosHelper.read(_input);
				org.omg.dds.DataWriterListener _arg2=org.omg.dds.DataWriterListenerHelper.read(_input);
				_out = handler.createReply();
				org.omg.dds.DataWriterHelper.write(_out,create_datawriter(_arg0,_arg1,_arg2));
				break;
			}
			case 4: // get_statuscondition
			{
				_out = handler.createReply();
				org.omg.dds.StatusConditionHelper.write(_out,get_statuscondition());
				break;
			}
			case 5: // lookup_datawriter
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				org.omg.dds.DataWriterHelper.write(_out,lookup_datawriter(_arg0));
				break;
			}
			case 6: // set_qos
			{
				org.omg.dds.PublisherQos _arg0=org.omg.dds.PublisherQosHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(set_qos(_arg0));
				break;
			}
			case 7: // delete_datawriter
			{
				org.omg.dds.DataWriter _arg0=org.omg.dds.DataWriterHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(delete_datawriter(_arg0));
				break;
			}
			case 8: // enable
			{
				_out = handler.createReply();
				_out.write_long(enable());
				break;
			}
			case 9: // get_default_datawriter_qos
			{
				org.omg.dds.DataWriterQosHolder _arg0= new org.omg.dds.DataWriterQosHolder();
				_out = handler.createReply();
				get_default_datawriter_qos(_arg0);
				org.omg.dds.DataWriterQosHelper.write(_out,_arg0.value);
				break;
			}
			case 10: // end_coherent_changes
			{
				_out = handler.createReply();
				_out.write_long(end_coherent_changes());
				break;
			}
			case 11: // get_status_changes
			{
				_out = handler.createReply();
				_out.write_ulong(get_status_changes());
				break;
			}
			case 12: // get_listener
			{
				_out = handler.createReply();
				org.omg.dds.PublisherListenerHelper.write(_out,get_listener());
				break;
			}
			case 13: // get_participant
			{
				_out = handler.createReply();
				org.omg.dds.DomainParticipantHelper.write(_out,get_participant());
				break;
			}
			case 14: // suspend_publications
			{
				_out = handler.createReply();
				_out.write_long(suspend_publications());
				break;
			}
			case 15: // set_default_datawriter_qos
			{
				org.omg.dds.DataWriterQos _arg0=org.omg.dds.DataWriterQosHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(set_default_datawriter_qos(_arg0));
				break;
			}
			case 16: // delete_contained_entities
			{
				_out = handler.createReply();
				_out.write_long(delete_contained_entities());
				break;
			}
			case 17: // begin_coherent_changes
			{
				_out = handler.createReply();
				_out.write_long(begin_coherent_changes());
				break;
			}
			case 18: // resume_publications
			{
				_out = handler.createReply();
				_out.write_long(resume_publications());
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

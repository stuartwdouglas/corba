package org.omg.dds;


/**
 * Generated from IDL interface "ContentFilteredTopic".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public abstract class ContentFilteredTopicPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.dds.ContentFilteredTopicOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "get_participant", new java.lang.Integer(0));
		m_opsHash.put ( "get_expression_parameters", new java.lang.Integer(1));
		m_opsHash.put ( "get_filter_expression", new java.lang.Integer(2));
		m_opsHash.put ( "get_related_topic", new java.lang.Integer(3));
		m_opsHash.put ( "set_expression_parameters", new java.lang.Integer(4));
		m_opsHash.put ( "get_type_name", new java.lang.Integer(5));
		m_opsHash.put ( "get_name", new java.lang.Integer(6));
	}
	private String[] ids = {"IDL:omg.org/dds/ContentFilteredTopic:1.0","IDL:omg.org/dds/TopicDescription:1.0"};
	public org.omg.dds.ContentFilteredTopic _this()
	{
		return org.omg.dds.ContentFilteredTopicHelper.narrow(_this_object());
	}
	public org.omg.dds.ContentFilteredTopic _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.ContentFilteredTopicHelper.narrow(_this_object(orb));
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
			case 0: // get_participant
			{
				_out = handler.createReply();
				org.omg.dds.DomainParticipantHelper.write(_out,get_participant());
				break;
			}
			case 1: // get_expression_parameters
			{
				_out = handler.createReply();
				org.omg.dds.StringSeqHelper.write(_out,get_expression_parameters());
				break;
			}
			case 2: // get_filter_expression
			{
				_out = handler.createReply();
				_out.write_string(get_filter_expression());
				break;
			}
			case 3: // get_related_topic
			{
				_out = handler.createReply();
				org.omg.dds.TopicHelper.write(_out,get_related_topic());
				break;
			}
			case 4: // set_expression_parameters
			{
				java.lang.String[] _arg0=org.omg.dds.StringSeqHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(set_expression_parameters(_arg0));
				break;
			}
			case 5: // get_type_name
			{
				_out = handler.createReply();
				_out.write_string(get_type_name());
				break;
			}
			case 6: // get_name
			{
				_out = handler.createReply();
				_out.write_string(get_name());
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

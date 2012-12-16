package org.omg.dds;


/**
 * Generated from IDL interface "QueryCondition".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public abstract class QueryConditionPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.dds.QueryConditionOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "get_datareader", new java.lang.Integer(0));
		m_opsHash.put ( "get_query_arguments", new java.lang.Integer(1));
		m_opsHash.put ( "get_query_expression", new java.lang.Integer(2));
		m_opsHash.put ( "get_sample_state_mask", new java.lang.Integer(3));
		m_opsHash.put ( "get_view_state_mask", new java.lang.Integer(4));
		m_opsHash.put ( "get_instance_state_mask", new java.lang.Integer(5));
		m_opsHash.put ( "get_trigger_value", new java.lang.Integer(6));
		m_opsHash.put ( "set_query_arguments", new java.lang.Integer(7));
	}
	private String[] ids = {"IDL:omg.org/dds/QueryCondition:1.0","IDL:omg.org/dds/ReadCondition:1.0","IDL:omg.org/dds/Condition:1.0"};
	public org.omg.dds.QueryCondition _this()
	{
		return org.omg.dds.QueryConditionHelper.narrow(_this_object());
	}
	public org.omg.dds.QueryCondition _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.QueryConditionHelper.narrow(_this_object(orb));
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
			case 0: // get_datareader
			{
				_out = handler.createReply();
				org.omg.dds.DataReaderHelper.write(_out,get_datareader());
				break;
			}
			case 1: // get_query_arguments
			{
				_out = handler.createReply();
				org.omg.dds.StringSeqHelper.write(_out,get_query_arguments());
				break;
			}
			case 2: // get_query_expression
			{
				_out = handler.createReply();
				_out.write_string(get_query_expression());
				break;
			}
			case 3: // get_sample_state_mask
			{
				_out = handler.createReply();
				_out.write_ulong(get_sample_state_mask());
				break;
			}
			case 4: // get_view_state_mask
			{
				_out = handler.createReply();
				_out.write_ulong(get_view_state_mask());
				break;
			}
			case 5: // get_instance_state_mask
			{
				_out = handler.createReply();
				_out.write_ulong(get_instance_state_mask());
				break;
			}
			case 6: // get_trigger_value
			{
				_out = handler.createReply();
				_out.write_boolean(get_trigger_value());
				break;
			}
			case 7: // set_query_arguments
			{
				java.lang.String[] _arg0=org.omg.dds.StringSeqHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(set_query_arguments(_arg0));
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

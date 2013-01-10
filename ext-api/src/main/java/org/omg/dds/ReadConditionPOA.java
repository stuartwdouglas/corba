package org.omg.dds;


/**
 * Generated from IDL interface "ReadCondition".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public abstract class ReadConditionPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.dds.ReadConditionOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "get_datareader", new java.lang.Integer(0));
		m_opsHash.put ( "get_instance_state_mask", new java.lang.Integer(1));
		m_opsHash.put ( "get_view_state_mask", new java.lang.Integer(2));
		m_opsHash.put ( "get_sample_state_mask", new java.lang.Integer(3));
		m_opsHash.put ( "get_trigger_value", new java.lang.Integer(4));
	}
	private String[] ids = {"IDL:omg.org/dds/ReadCondition:1.0","IDL:omg.org/dds/Condition:1.0"};
	public org.omg.dds.ReadCondition _this()
	{
		return org.omg.dds.ReadConditionHelper.narrow(_this_object());
	}
	public org.omg.dds.ReadCondition _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.ReadConditionHelper.narrow(_this_object(orb));
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
			case 1: // get_instance_state_mask
			{
				_out = handler.createReply();
				_out.write_ulong(get_instance_state_mask());
				break;
			}
			case 2: // get_view_state_mask
			{
				_out = handler.createReply();
				_out.write_ulong(get_view_state_mask());
				break;
			}
			case 3: // get_sample_state_mask
			{
				_out = handler.createReply();
				_out.write_ulong(get_sample_state_mask());
				break;
			}
			case 4: // get_trigger_value
			{
				_out = handler.createReply();
				_out.write_boolean(get_trigger_value());
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

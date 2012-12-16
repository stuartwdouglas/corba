package org.omg.dds;


/**
 * Generated from IDL interface "StatusCondition".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public abstract class StatusConditionPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.dds.StatusConditionOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "set_enabled_statuses", new java.lang.Integer(0));
		m_opsHash.put ( "get_trigger_value", new java.lang.Integer(1));
		m_opsHash.put ( "get_entity", new java.lang.Integer(2));
		m_opsHash.put ( "get_enabled_statuses", new java.lang.Integer(3));
	}
	private String[] ids = {"IDL:omg.org/dds/StatusCondition:1.0","IDL:omg.org/dds/Condition:1.0"};
	public org.omg.dds.StatusCondition _this()
	{
		return org.omg.dds.StatusConditionHelper.narrow(_this_object());
	}
	public org.omg.dds.StatusCondition _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.StatusConditionHelper.narrow(_this_object(orb));
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
			case 0: // set_enabled_statuses
			{
				int _arg0=_input.read_ulong();
				_out = handler.createReply();
				_out.write_long(set_enabled_statuses(_arg0));
				break;
			}
			case 1: // get_trigger_value
			{
				_out = handler.createReply();
				_out.write_boolean(get_trigger_value());
				break;
			}
			case 2: // get_entity
			{
				_out = handler.createReply();
				org.omg.dds.EntityHelper.write(_out,get_entity());
				break;
			}
			case 3: // get_enabled_statuses
			{
				_out = handler.createReply();
				_out.write_ulong(get_enabled_statuses());
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

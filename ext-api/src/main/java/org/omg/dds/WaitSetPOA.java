package org.omg.dds;


/**
 * Generated from IDL interface "WaitSet".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public abstract class WaitSetPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.dds.WaitSetOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "detach_condition", new java.lang.Integer(0));
		m_opsHash.put ( "wait", new java.lang.Integer(1));
		m_opsHash.put ( "get_conditions", new java.lang.Integer(2));
		m_opsHash.put ( "attach_condition", new java.lang.Integer(3));
	}
	private String[] ids = {"IDL:omg.org/dds/WaitSet:1.0"};
	public org.omg.dds.WaitSet _this()
	{
		return org.omg.dds.WaitSetHelper.narrow(_this_object());
	}
	public org.omg.dds.WaitSet _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.WaitSetHelper.narrow(_this_object(orb));
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
			case 0: // detach_condition
			{
				org.omg.dds.Condition _arg0=org.omg.dds.ConditionHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(detach_condition(_arg0));
				break;
			}
			case 1: // wait
			{
				org.omg.dds.ConditionSeqHolder _arg0= new org.omg.dds.ConditionSeqHolder();
				org.omg.dds.Duration_t _arg1=org.omg.dds.Duration_tHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(_wait(_arg0,_arg1));
				org.omg.dds.ConditionSeqHelper.write(_out,_arg0.value);
				break;
			}
			case 2: // get_conditions
			{
				org.omg.dds.ConditionSeqHolder _arg0= new org.omg.dds.ConditionSeqHolder();
				_out = handler.createReply();
				_out.write_long(get_conditions(_arg0));
				org.omg.dds.ConditionSeqHelper.write(_out,_arg0.value);
				break;
			}
			case 3: // attach_condition
			{
				org.omg.dds.Condition _arg0=org.omg.dds.ConditionHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(attach_condition(_arg0));
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

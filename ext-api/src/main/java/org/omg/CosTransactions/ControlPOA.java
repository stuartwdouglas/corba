package org.omg.CosTransactions;


/**
 * Generated from IDL interface "Control".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public abstract class ControlPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosTransactions.ControlOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "get_terminator", new java.lang.Integer(0));
		m_opsHash.put ( "get_coordinator", new java.lang.Integer(1));
	}
	private String[] ids = {"IDL:omg.org/CosTransactions/Control:1.0"};
	public org.omg.CosTransactions.Control _this()
	{
		return org.omg.CosTransactions.ControlHelper.narrow(_this_object());
	}
	public org.omg.CosTransactions.Control _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTransactions.ControlHelper.narrow(_this_object(orb));
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
			case 0: // get_terminator
			{
			try
			{
				_out = handler.createReply();
				org.omg.CosTransactions.TerminatorHelper.write(_out,get_terminator());
			}
			catch(org.omg.CosTransactions.Unavailable _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.UnavailableHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // get_coordinator
			{
			try
			{
				_out = handler.createReply();
				org.omg.CosTransactions.CoordinatorHelper.write(_out,get_coordinator());
			}
			catch(org.omg.CosTransactions.Unavailable _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.UnavailableHelper.write(_out, _ex0);
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

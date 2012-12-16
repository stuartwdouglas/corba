package org.omg.CosTransactions;


/**
 * Generated from IDL interface "Current".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public abstract class CurrentPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosTransactions.CurrentOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "suspend", new java.lang.Integer(0));
		m_opsHash.put ( "get_status", new java.lang.Integer(1));
		m_opsHash.put ( "rollback", new java.lang.Integer(2));
		m_opsHash.put ( "resume", new java.lang.Integer(3));
		m_opsHash.put ( "get_transaction_name", new java.lang.Integer(4));
		m_opsHash.put ( "set_timeout", new java.lang.Integer(5));
		m_opsHash.put ( "commit", new java.lang.Integer(6));
		m_opsHash.put ( "rollback_only", new java.lang.Integer(7));
		m_opsHash.put ( "get_control", new java.lang.Integer(8));
		m_opsHash.put ( "begin", new java.lang.Integer(9));
	}
	private String[] ids = {"IDL:omg.org/CosTransactions/Current:1.0","IDL:omg.org/CORBA/Current:1.0"};
	public org.omg.CosTransactions.Current _this()
	{
		return org.omg.CosTransactions.CurrentHelper.narrow(_this_object());
	}
	public org.omg.CosTransactions.Current _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTransactions.CurrentHelper.narrow(_this_object(orb));
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
			case 0: // suspend
			{
				_out = handler.createReply();
				org.omg.CosTransactions.ControlHelper.write(_out,suspend());
				break;
			}
			case 1: // get_status
			{
				_out = handler.createReply();
				org.omg.CosTransactions.StatusHelper.write(_out,get_status());
				break;
			}
			case 2: // rollback
			{
			try
			{
				_out = handler.createReply();
				rollback();
			}
			catch(org.omg.CosTransactions.NoTransaction _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.NoTransactionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // resume
			{
			try
			{
				org.omg.CosTransactions.Control _arg0=org.omg.CosTransactions.ControlHelper.read(_input);
				_out = handler.createReply();
				resume(_arg0);
			}
			catch(org.omg.CosTransactions.InvalidControl _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.InvalidControlHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // get_transaction_name
			{
				_out = handler.createReply();
				_out.write_string(get_transaction_name());
				break;
			}
			case 5: // set_timeout
			{
				int _arg0=_input.read_ulong();
				_out = handler.createReply();
				set_timeout(_arg0);
				break;
			}
			case 6: // commit
			{
			try
			{
				boolean _arg0=_input.read_boolean();
				_out = handler.createReply();
				commit(_arg0);
			}
			catch(org.omg.CosTransactions.NoTransaction _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.NoTransactionHelper.write(_out, _ex0);
			}
			catch(org.omg.CosTransactions.HeuristicHazard _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.HeuristicHazardHelper.write(_out, _ex1);
			}
			catch(org.omg.CosTransactions.HeuristicMixed _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.HeuristicMixedHelper.write(_out, _ex2);
			}
				break;
			}
			case 7: // rollback_only
			{
			try
			{
				_out = handler.createReply();
				rollback_only();
			}
			catch(org.omg.CosTransactions.NoTransaction _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.NoTransactionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // get_control
			{
				_out = handler.createReply();
				org.omg.CosTransactions.ControlHelper.write(_out,get_control());
				break;
			}
			case 9: // begin
			{
			try
			{
				_out = handler.createReply();
				begin();
			}
			catch(org.omg.CosTransactions.SubtransactionsUnavailable _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.SubtransactionsUnavailableHelper.write(_out, _ex0);
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

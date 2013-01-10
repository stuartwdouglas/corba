package org.omg.BridgeTransactionMgmt;


/**
 * Generated from IDL interface "TransactionManagement".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public abstract class TransactionManagementPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.BridgeTransactionMgmt.TransactionManagementOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "disable_transaction", new java.lang.Integer(0));
		m_opsHash.put ( "enable_transaction", new java.lang.Integer(1));
	}
	private String[] ids = {"IDL:omg.org/BridgeTransactionMgmt/TransactionManagement:1.0"};
	public org.omg.BridgeTransactionMgmt.TransactionManagement _this()
	{
		return org.omg.BridgeTransactionMgmt.TransactionManagementHelper.narrow(_this_object());
	}
	public org.omg.BridgeTransactionMgmt.TransactionManagement _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.BridgeTransactionMgmt.TransactionManagementHelper.narrow(_this_object(orb));
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
			case 0: // disable_transaction
			{
			try
			{
				_out = handler.createReply();
				disable_transaction();
			}
			catch(org.omg.BridgeTransactionMgmt.TransactionActive _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.BridgeTransactionMgmt.TransactionActiveHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // enable_transaction
			{
			try
			{
				int _arg0=_input.read_ulong();
				int _arg1=_input.read_ulong();
				_out = handler.createReply();
				enable_transaction(_arg0,_arg1);
			}
			catch(org.omg.BridgeTransactionMgmt.TransactionAlreadyActive _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.BridgeTransactionMgmt.TransactionAlreadyActiveHelper.write(_out, _ex0);
			}
			catch(org.omg.BridgeTransactionMgmt.UnsupportedTransaction _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.BridgeTransactionMgmt.UnsupportedTransactionHelper.write(_out, _ex1);
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

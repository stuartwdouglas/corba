package org.omg.CosTransactions;


/**
 * Generated from IDL interface "Coordinator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public abstract class CoordinatorPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosTransactions.CoordinatorOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "is_ancestor_transaction", new java.lang.Integer(0));
		m_opsHash.put ( "get_status", new java.lang.Integer(1));
		m_opsHash.put ( "is_descendant_transaction", new java.lang.Integer(2));
		m_opsHash.put ( "get_transaction_name", new java.lang.Integer(3));
		m_opsHash.put ( "get_top_level_status", new java.lang.Integer(4));
		m_opsHash.put ( "get_parent_status", new java.lang.Integer(5));
		m_opsHash.put ( "rollback_only", new java.lang.Integer(6));
		m_opsHash.put ( "is_top_level_transaction", new java.lang.Integer(7));
		m_opsHash.put ( "create_subtransaction", new java.lang.Integer(8));
		m_opsHash.put ( "get_txcontext", new java.lang.Integer(9));
		m_opsHash.put ( "register_synchronization", new java.lang.Integer(10));
		m_opsHash.put ( "hash_top_level_tran", new java.lang.Integer(11));
		m_opsHash.put ( "is_same_transaction", new java.lang.Integer(12));
		m_opsHash.put ( "register_subtran_aware", new java.lang.Integer(13));
		m_opsHash.put ( "hash_transaction", new java.lang.Integer(14));
		m_opsHash.put ( "register_resource", new java.lang.Integer(15));
		m_opsHash.put ( "is_related_transaction", new java.lang.Integer(16));
	}
	private String[] ids = {"IDL:omg.org/CosTransactions/Coordinator:1.0"};
	public org.omg.CosTransactions.Coordinator _this()
	{
		return org.omg.CosTransactions.CoordinatorHelper.narrow(_this_object());
	}
	public org.omg.CosTransactions.Coordinator _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTransactions.CoordinatorHelper.narrow(_this_object(orb));
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
			case 0: // is_ancestor_transaction
			{
				org.omg.CosTransactions.Coordinator _arg0=org.omg.CosTransactions.CoordinatorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(is_ancestor_transaction(_arg0));
				break;
			}
			case 1: // get_status
			{
				_out = handler.createReply();
				org.omg.CosTransactions.StatusHelper.write(_out,get_status());
				break;
			}
			case 2: // is_descendant_transaction
			{
				org.omg.CosTransactions.Coordinator _arg0=org.omg.CosTransactions.CoordinatorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(is_descendant_transaction(_arg0));
				break;
			}
			case 3: // get_transaction_name
			{
				_out = handler.createReply();
				_out.write_string(get_transaction_name());
				break;
			}
			case 4: // get_top_level_status
			{
				_out = handler.createReply();
				org.omg.CosTransactions.StatusHelper.write(_out,get_top_level_status());
				break;
			}
			case 5: // get_parent_status
			{
				_out = handler.createReply();
				org.omg.CosTransactions.StatusHelper.write(_out,get_parent_status());
				break;
			}
			case 6: // rollback_only
			{
			try
			{
				_out = handler.createReply();
				rollback_only();
			}
			catch(org.omg.CosTransactions.Inactive _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.InactiveHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // is_top_level_transaction
			{
				_out = handler.createReply();
				_out.write_boolean(is_top_level_transaction());
				break;
			}
			case 8: // create_subtransaction
			{
			try
			{
				_out = handler.createReply();
				org.omg.CosTransactions.ControlHelper.write(_out,create_subtransaction());
			}
			catch(org.omg.CosTransactions.SubtransactionsUnavailable _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.SubtransactionsUnavailableHelper.write(_out, _ex0);
			}
			catch(org.omg.CosTransactions.Inactive _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.InactiveHelper.write(_out, _ex1);
			}
				break;
			}
			case 9: // get_txcontext
			{
			try
			{
				_out = handler.createReply();
				org.omg.CosTransactions.PropagationContextHelper.write(_out,get_txcontext());
			}
			catch(org.omg.CosTransactions.Unavailable _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.UnavailableHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // register_synchronization
			{
			try
			{
				org.omg.CosTransactions.Synchronization _arg0=org.omg.CosTransactions.SynchronizationHelper.read(_input);
				_out = handler.createReply();
				register_synchronization(_arg0);
			}
			catch(org.omg.CosTransactions.SynchronizationUnavailable _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.SynchronizationUnavailableHelper.write(_out, _ex0);
			}
			catch(org.omg.CosTransactions.Inactive _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.InactiveHelper.write(_out, _ex1);
			}
				break;
			}
			case 11: // hash_top_level_tran
			{
				_out = handler.createReply();
				_out.write_ulong(hash_top_level_tran());
				break;
			}
			case 12: // is_same_transaction
			{
				org.omg.CosTransactions.Coordinator _arg0=org.omg.CosTransactions.CoordinatorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(is_same_transaction(_arg0));
				break;
			}
			case 13: // register_subtran_aware
			{
			try
			{
				org.omg.CosTransactions.SubtransactionAwareResource _arg0=org.omg.CosTransactions.SubtransactionAwareResourceHelper.read(_input);
				_out = handler.createReply();
				register_subtran_aware(_arg0);
			}
			catch(org.omg.CosTransactions.NotSubtransaction _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.NotSubtransactionHelper.write(_out, _ex0);
			}
			catch(org.omg.CosTransactions.Inactive _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.InactiveHelper.write(_out, _ex1);
			}
				break;
			}
			case 14: // hash_transaction
			{
				_out = handler.createReply();
				_out.write_ulong(hash_transaction());
				break;
			}
			case 15: // register_resource
			{
			try
			{
				org.omg.CosTransactions.Resource _arg0=org.omg.CosTransactions.ResourceHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosTransactions.RecoveryCoordinatorHelper.write(_out,register_resource(_arg0));
			}
			catch(org.omg.CosTransactions.Inactive _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.InactiveHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // is_related_transaction
			{
				org.omg.CosTransactions.Coordinator _arg0=org.omg.CosTransactions.CoordinatorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(is_related_transaction(_arg0));
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

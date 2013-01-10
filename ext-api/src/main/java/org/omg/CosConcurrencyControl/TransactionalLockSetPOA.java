package org.omg.CosConcurrencyControl;


/**
 * Generated from IDL interface "TransactionalLockSet".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public abstract class TransactionalLockSetPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosConcurrencyControl.TransactionalLockSetOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "try_lock", new java.lang.Integer(0));
		m_opsHash.put ( "get_coordinator", new java.lang.Integer(1));
		m_opsHash.put ( "change_mode", new java.lang.Integer(2));
		m_opsHash.put ( "lock", new java.lang.Integer(3));
		m_opsHash.put ( "unlock", new java.lang.Integer(4));
	}
	private String[] ids = {"IDL:omg.org/CosConcurrencyControl/TransactionalLockSet:1.0"};
	public org.omg.CosConcurrencyControl.TransactionalLockSet _this()
	{
		return org.omg.CosConcurrencyControl.TransactionalLockSetHelper.narrow(_this_object());
	}
	public org.omg.CosConcurrencyControl.TransactionalLockSet _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosConcurrencyControl.TransactionalLockSetHelper.narrow(_this_object(orb));
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
			case 0: // try_lock
			{
				org.omg.CosTransactions.Coordinator _arg0=org.omg.CosTransactions.CoordinatorHelper.read(_input);
				org.omg.CosConcurrencyControl.lock_mode _arg1=org.omg.CosConcurrencyControl.lock_modeHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(try_lock(_arg0,_arg1));
				break;
			}
			case 1: // get_coordinator
			{
				org.omg.CosTransactions.Coordinator _arg0=org.omg.CosTransactions.CoordinatorHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosConcurrencyControl.LockCoordinatorHelper.write(_out,get_coordinator(_arg0));
				break;
			}
			case 2: // change_mode
			{
			try
			{
				org.omg.CosTransactions.Coordinator _arg0=org.omg.CosTransactions.CoordinatorHelper.read(_input);
				org.omg.CosConcurrencyControl.lock_mode _arg1=org.omg.CosConcurrencyControl.lock_modeHelper.read(_input);
				org.omg.CosConcurrencyControl.lock_mode _arg2=org.omg.CosConcurrencyControl.lock_modeHelper.read(_input);
				_out = handler.createReply();
				change_mode(_arg0,_arg1,_arg2);
			}
			catch(org.omg.CosConcurrencyControl.LockNotHeld _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosConcurrencyControl.LockNotHeldHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // lock
			{
				org.omg.CosTransactions.Coordinator _arg0=org.omg.CosTransactions.CoordinatorHelper.read(_input);
				org.omg.CosConcurrencyControl.lock_mode _arg1=org.omg.CosConcurrencyControl.lock_modeHelper.read(_input);
				_out = handler.createReply();
				lock(_arg0,_arg1);
				break;
			}
			case 4: // unlock
			{
			try
			{
				org.omg.CosTransactions.Coordinator _arg0=org.omg.CosTransactions.CoordinatorHelper.read(_input);
				org.omg.CosConcurrencyControl.lock_mode _arg1=org.omg.CosConcurrencyControl.lock_modeHelper.read(_input);
				_out = handler.createReply();
				unlock(_arg0,_arg1);
			}
			catch(org.omg.CosConcurrencyControl.LockNotHeld _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosConcurrencyControl.LockNotHeldHelper.write(_out, _ex0);
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

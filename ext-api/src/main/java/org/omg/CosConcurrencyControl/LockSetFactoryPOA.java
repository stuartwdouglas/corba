package org.omg.CosConcurrencyControl;


/**
 * Generated from IDL interface "LockSetFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public abstract class LockSetFactoryPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosConcurrencyControl.LockSetFactoryOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "create_transactional", new java.lang.Integer(0));
		m_opsHash.put ( "create_transactional_related", new java.lang.Integer(1));
		m_opsHash.put ( "create_related", new java.lang.Integer(2));
		m_opsHash.put ( "create", new java.lang.Integer(3));
	}
	private String[] ids = {"IDL:omg.org/CosConcurrencyControl/LockSetFactory:1.0"};
	public org.omg.CosConcurrencyControl.LockSetFactory _this()
	{
		return org.omg.CosConcurrencyControl.LockSetFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosConcurrencyControl.LockSetFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosConcurrencyControl.LockSetFactoryHelper.narrow(_this_object(orb));
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
			case 0: // create_transactional
			{
				_out = handler.createReply();
				org.omg.CosConcurrencyControl.TransactionalLockSetHelper.write(_out,create_transactional());
				break;
			}
			case 1: // create_transactional_related
			{
				org.omg.CosConcurrencyControl.TransactionalLockSet _arg0=org.omg.CosConcurrencyControl.TransactionalLockSetHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosConcurrencyControl.TransactionalLockSetHelper.write(_out,create_transactional_related(_arg0));
				break;
			}
			case 2: // create_related
			{
				org.omg.CosConcurrencyControl.LockSet _arg0=org.omg.CosConcurrencyControl.LockSetHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosConcurrencyControl.LockSetHelper.write(_out,create_related(_arg0));
				break;
			}
			case 3: // create
			{
				_out = handler.createReply();
				org.omg.CosConcurrencyControl.LockSetHelper.write(_out,create());
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

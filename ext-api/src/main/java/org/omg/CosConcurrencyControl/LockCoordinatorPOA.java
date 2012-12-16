package org.omg.CosConcurrencyControl;


/**
 * Generated from IDL interface "LockCoordinator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public abstract class LockCoordinatorPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosConcurrencyControl.LockCoordinatorOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "drop_locks", new java.lang.Integer(0));
	}
	private String[] ids = {"IDL:omg.org/CosConcurrencyControl/LockCoordinator:1.0"};
	public org.omg.CosConcurrencyControl.LockCoordinator _this()
	{
		return org.omg.CosConcurrencyControl.LockCoordinatorHelper.narrow(_this_object());
	}
	public org.omg.CosConcurrencyControl.LockCoordinator _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosConcurrencyControl.LockCoordinatorHelper.narrow(_this_object(orb));
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
			case 0: // drop_locks
			{
				_out = handler.createReply();
				drop_locks();
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

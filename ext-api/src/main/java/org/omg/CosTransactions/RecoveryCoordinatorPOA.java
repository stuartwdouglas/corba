package org.omg.CosTransactions;


/**
 * Generated from IDL interface "RecoveryCoordinator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public abstract class RecoveryCoordinatorPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosTransactions.RecoveryCoordinatorOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "replay_completion", new java.lang.Integer(0));
	}
	private String[] ids = {"IDL:omg.org/CosTransactions/RecoveryCoordinator:1.0"};
	public org.omg.CosTransactions.RecoveryCoordinator _this()
	{
		return org.omg.CosTransactions.RecoveryCoordinatorHelper.narrow(_this_object());
	}
	public org.omg.CosTransactions.RecoveryCoordinator _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTransactions.RecoveryCoordinatorHelper.narrow(_this_object(orb));
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
			case 0: // replay_completion
			{
			try
			{
				org.omg.CosTransactions.Resource _arg0=org.omg.CosTransactions.ResourceHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosTransactions.StatusHelper.write(_out,replay_completion(_arg0));
			}
			catch(org.omg.CosTransactions.NotPrepared _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.NotPreparedHelper.write(_out, _ex0);
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

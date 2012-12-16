package org.omg.CosTransactions;


/**
 * Generated from IDL interface "Synchronization".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public abstract class SynchronizationPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosTransactions.SynchronizationOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "before_completion", new java.lang.Integer(0));
		m_opsHash.put ( "after_completion", new java.lang.Integer(1));
	}
	private String[] ids = {"IDL:omg.org/CosTransactions/Synchronization:1.0","IDL:omg.org/CosTransactions/TransactionalObject:1.0"};
	public org.omg.CosTransactions.Synchronization _this()
	{
		return org.omg.CosTransactions.SynchronizationHelper.narrow(_this_object());
	}
	public org.omg.CosTransactions.Synchronization _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTransactions.SynchronizationHelper.narrow(_this_object(orb));
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
			case 0: // before_completion
			{
				_out = handler.createReply();
				before_completion();
				break;
			}
			case 1: // after_completion
			{
				org.omg.CosTransactions.Status _arg0=org.omg.CosTransactions.StatusHelper.read(_input);
				_out = handler.createReply();
				after_completion(_arg0);
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

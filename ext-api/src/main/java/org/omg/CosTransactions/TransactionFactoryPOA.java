package org.omg.CosTransactions;


/**
 * Generated from IDL interface "TransactionFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public abstract class TransactionFactoryPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosTransactions.TransactionFactoryOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "create", new java.lang.Integer(0));
		m_opsHash.put ( "recreate", new java.lang.Integer(1));
	}
	private String[] ids = {"IDL:omg.org/CosTransactions/TransactionFactory:1.0"};
	public org.omg.CosTransactions.TransactionFactory _this()
	{
		return org.omg.CosTransactions.TransactionFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosTransactions.TransactionFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTransactions.TransactionFactoryHelper.narrow(_this_object(orb));
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
			case 0: // create
			{
				int _arg0=_input.read_ulong();
				_out = handler.createReply();
				org.omg.CosTransactions.ControlHelper.write(_out,create(_arg0));
				break;
			}
			case 1: // recreate
			{
				org.omg.CosTransactions.PropagationContext _arg0=org.omg.CosTransactions.PropagationContextHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosTransactions.ControlHelper.write(_out,recreate(_arg0));
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

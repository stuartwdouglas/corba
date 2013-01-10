package org.omg.CosCollection;


/**
 * Generated from IDL interface "BagFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public abstract class BagFactoryPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosCollection.BagFactoryOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "create", new java.lang.Integer(0));
	}
	private String[] ids = {"IDL:omg.org/CosCollection/BagFactory:1.0"};
	public org.omg.CosCollection.BagFactory _this()
	{
		return org.omg.CosCollection.BagFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.BagFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.BagFactoryHelper.narrow(_this_object(orb));
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
				org.omg.CosCollection.Operations _arg0=org.omg.CosCollection.OperationsHelper.read(_input);
				int _arg1=_input.read_ulong();
				_out = handler.createReply();
				org.omg.CosCollection.BagHelper.write(_out,create(_arg0,_arg1));
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

package org.omg.CosCollection;


/**
 * Generated from IDL interface "Comparator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public abstract class ComparatorPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosCollection.ComparatorOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "compare", new java.lang.Integer(0));
	}
	private String[] ids = {"IDL:omg.org/CosCollection/Comparator:1.0"};
	public org.omg.CosCollection.Comparator _this()
	{
		return org.omg.CosCollection.ComparatorHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.Comparator _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.ComparatorHelper.narrow(_this_object(orb));
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
			case 0: // compare
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				org.omg.CORBA.Any _arg1=_input.read_any();
				_out = handler.createReply();
				_out.write_long(compare(_arg0,_arg1));
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

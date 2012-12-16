package org.omg.CosCollection;


/**
 * Generated from IDL interface "RestrictedAccessCollection".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public abstract class RestrictedAccessCollectionPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosCollection.RestrictedAccessCollectionOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "purge", new java.lang.Integer(0));
		m_opsHash.put ( "unfilled", new java.lang.Integer(1));
		m_opsHash.put ( "size", new java.lang.Integer(2));
	}
	private String[] ids = {"IDL:omg.org/CosCollection/RestrictedAccessCollection:1.0"};
	public org.omg.CosCollection.RestrictedAccessCollection _this()
	{
		return org.omg.CosCollection.RestrictedAccessCollectionHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.RestrictedAccessCollection _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.RestrictedAccessCollectionHelper.narrow(_this_object(orb));
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
			case 0: // purge
			{
				_out = handler.createReply();
				purge();
				break;
			}
			case 1: // unfilled
			{
				_out = handler.createReply();
				_out.write_boolean(unfilled());
				break;
			}
			case 2: // size
			{
				_out = handler.createReply();
				_out.write_ulong(size());
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
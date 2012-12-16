package org.omg.CosCollection;


/**
 * Generated from IDL interface "RACollectionFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public abstract class RACollectionFactoryPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosCollection.RACollectionFactoryOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "generic_create", new java.lang.Integer(0));
	}
	private String[] ids = {"IDL:omg.org/CosCollection/RACollectionFactory:1.0"};
	public org.omg.CosCollection.RACollectionFactory _this()
	{
		return org.omg.CosCollection.RACollectionFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.RACollectionFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.RACollectionFactoryHelper.narrow(_this_object(orb));
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
			case 0: // generic_create
			{
			try
			{
				org.omg.CosCollection.NVPair[] _arg0=org.omg.CosCollection.ParameterListHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosCollection.RestrictedAccessCollectionHelper.write(_out,generic_create(_arg0));
			}
			catch(org.omg.CosCollection.ParameterInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ParameterInvalidHelper.write(_out, _ex0);
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

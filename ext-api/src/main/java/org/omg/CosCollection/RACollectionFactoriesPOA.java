package org.omg.CosCollection;


/**
 * Generated from IDL interface "RACollectionFactories".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public abstract class RACollectionFactoriesPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosCollection.RACollectionFactoriesOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "generic_create", new java.lang.Integer(0));
		m_opsHash.put ( "create", new java.lang.Integer(1));
		m_opsHash.put ( "remove_factory", new java.lang.Integer(2));
		m_opsHash.put ( "add_factory", new java.lang.Integer(3));
	}
	private String[] ids = {"IDL:omg.org/CosCollection/RACollectionFactories:1.0","IDL:omg.org/CosCollection/RACollectionFactory:1.0"};
	public org.omg.CosCollection.RACollectionFactories _this()
	{
		return org.omg.CosCollection.RACollectionFactoriesHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.RACollectionFactories _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.RACollectionFactoriesHelper.narrow(_this_object(orb));
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
			case 1: // create
			{
			try
			{
				org.omg.CosCollection.NVPair[] _arg0=org.omg.CosCollection.ParameterListHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosCollection.CollectionHelper.write(_out,create(_arg0));
			}
			catch(org.omg.CosCollection.ParameterInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ParameterInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // remove_factory
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				_out = handler.createReply();
				_out.write_boolean(remove_factory(_arg0,_arg1,_arg2));
				break;
			}
			case 3: // add_factory
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CosCollection.RACollectionFactory _arg3=org.omg.CosCollection.RACollectionFactoryHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(add_factory(_arg0,_arg1,_arg2,_arg3));
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

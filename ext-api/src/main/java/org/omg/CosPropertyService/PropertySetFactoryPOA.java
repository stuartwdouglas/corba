package org.omg.CosPropertyService;


/**
 * Generated from IDL interface "PropertySetFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public abstract class PropertySetFactoryPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosPropertyService.PropertySetFactoryOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "create_propertyset", new java.lang.Integer(0));
		m_opsHash.put ( "create_constrained_propertyset", new java.lang.Integer(1));
		m_opsHash.put ( "create_initial_propertyset", new java.lang.Integer(2));
	}
	private String[] ids = {"IDL:omg.org/CosPropertyService/PropertySetFactory:1.0"};
	public org.omg.CosPropertyService.PropertySetFactory _this()
	{
		return org.omg.CosPropertyService.PropertySetFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosPropertyService.PropertySetFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosPropertyService.PropertySetFactoryHelper.narrow(_this_object(orb));
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
			case 0: // create_propertyset
			{
				_out = handler.createReply();
				org.omg.CosPropertyService.PropertySetHelper.write(_out,create_propertyset());
				break;
			}
			case 1: // create_constrained_propertyset
			{
			try
			{
				org.omg.CORBA.TypeCode[] _arg0=org.omg.CosPropertyService.PropertyTypesHelper.read(_input);
				org.omg.CosPropertyService.Property[] _arg1=org.omg.CosPropertyService.PropertiesHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosPropertyService.PropertySetHelper.write(_out,create_constrained_propertyset(_arg0,_arg1));
			}
			catch(org.omg.CosPropertyService.ConstraintNotSupported _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.ConstraintNotSupportedHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // create_initial_propertyset
			{
			try
			{
				org.omg.CosPropertyService.Property[] _arg0=org.omg.CosPropertyService.PropertiesHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosPropertyService.PropertySetHelper.write(_out,create_initial_propertyset(_arg0));
			}
			catch(org.omg.CosPropertyService.MultipleExceptions _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.MultipleExceptionsHelper.write(_out, _ex0);
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

package org.omg.CosPropertyService;


/**
 * Generated from IDL interface "PropertySetDefFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public abstract class PropertySetDefFactoryPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosPropertyService.PropertySetDefFactoryOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "create_initial_propertysetdef", new java.lang.Integer(0));
		m_opsHash.put ( "create_constrained_propertysetdef", new java.lang.Integer(1));
		m_opsHash.put ( "create_propertysetdef", new java.lang.Integer(2));
	}
	private String[] ids = {"IDL:omg.org/CosPropertyService/PropertySetDefFactory:1.0"};
	public org.omg.CosPropertyService.PropertySetDefFactory _this()
	{
		return org.omg.CosPropertyService.PropertySetDefFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosPropertyService.PropertySetDefFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosPropertyService.PropertySetDefFactoryHelper.narrow(_this_object(orb));
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
			case 0: // create_initial_propertysetdef
			{
			try
			{
				org.omg.CosPropertyService.PropertyDef[] _arg0=org.omg.CosPropertyService.PropertyDefsHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosPropertyService.PropertySetDefHelper.write(_out,create_initial_propertysetdef(_arg0));
			}
			catch(org.omg.CosPropertyService.MultipleExceptions _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.MultipleExceptionsHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // create_constrained_propertysetdef
			{
			try
			{
				org.omg.CORBA.TypeCode[] _arg0=org.omg.CosPropertyService.PropertyTypesHelper.read(_input);
				org.omg.CosPropertyService.PropertyDef[] _arg1=org.omg.CosPropertyService.PropertyDefsHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosPropertyService.PropertySetDefHelper.write(_out,create_constrained_propertysetdef(_arg0,_arg1));
			}
			catch(org.omg.CosPropertyService.ConstraintNotSupported _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.ConstraintNotSupportedHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // create_propertysetdef
			{
				_out = handler.createReply();
				org.omg.CosPropertyService.PropertySetDefHelper.write(_out,create_propertysetdef());
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

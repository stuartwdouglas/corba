package org.omg.CosPropertyService;


/**
 * Generated from IDL interface "PropertySetDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public abstract class PropertySetDefPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosPropertyService.PropertySetDefOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "define_property_with_mode", new java.lang.Integer(0));
		m_opsHash.put ( "get_property_value", new java.lang.Integer(1));
		m_opsHash.put ( "set_property_modes", new java.lang.Integer(2));
		m_opsHash.put ( "delete_property", new java.lang.Integer(3));
		m_opsHash.put ( "get_properties", new java.lang.Integer(4));
		m_opsHash.put ( "get_property_modes", new java.lang.Integer(5));
		m_opsHash.put ( "get_property_mode", new java.lang.Integer(6));
		m_opsHash.put ( "set_property_mode", new java.lang.Integer(7));
		m_opsHash.put ( "delete_properties", new java.lang.Integer(8));
		m_opsHash.put ( "get_all_property_names", new java.lang.Integer(9));
		m_opsHash.put ( "get_allowed_property_types", new java.lang.Integer(10));
		m_opsHash.put ( "delete_all_properties", new java.lang.Integer(11));
		m_opsHash.put ( "define_property", new java.lang.Integer(12));
		m_opsHash.put ( "define_properties_with_modes", new java.lang.Integer(13));
		m_opsHash.put ( "get_number_of_properties", new java.lang.Integer(14));
		m_opsHash.put ( "get_all_properties", new java.lang.Integer(15));
		m_opsHash.put ( "is_property_defined", new java.lang.Integer(16));
		m_opsHash.put ( "define_properties", new java.lang.Integer(17));
		m_opsHash.put ( "get_allowed_properties", new java.lang.Integer(18));
	}
	private String[] ids = {"IDL:omg.org/CosPropertyService/PropertySetDef:1.0","IDL:omg.org/CosPropertyService/PropertySet:1.0"};
	public org.omg.CosPropertyService.PropertySetDef _this()
	{
		return org.omg.CosPropertyService.PropertySetDefHelper.narrow(_this_object());
	}
	public org.omg.CosPropertyService.PropertySetDef _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosPropertyService.PropertySetDefHelper.narrow(_this_object(orb));
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
			case 0: // define_property_with_mode
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				org.omg.CORBA.Any _arg1=_input.read_any();
				org.omg.CosPropertyService.PropertyModeType _arg2=org.omg.CosPropertyService.PropertyModeTypeHelper.read(_input);
				_out = handler.createReply();
				define_property_with_mode(_arg0,_arg1,_arg2);
			}
			catch(org.omg.CosPropertyService.UnsupportedMode _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.UnsupportedModeHelper.write(_out, _ex0);
			}
			catch(org.omg.CosPropertyService.ConflictingProperty _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.ConflictingPropertyHelper.write(_out, _ex1);
			}
			catch(org.omg.CosPropertyService.UnsupportedProperty _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.UnsupportedPropertyHelper.write(_out, _ex2);
			}
			catch(org.omg.CosPropertyService.UnsupportedTypeCode _ex3)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.UnsupportedTypeCodeHelper.write(_out, _ex3);
			}
			catch(org.omg.CosPropertyService.ReadOnlyProperty _ex4)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.ReadOnlyPropertyHelper.write(_out, _ex4);
			}
			catch(org.omg.CosPropertyService.InvalidPropertyName _ex5)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.InvalidPropertyNameHelper.write(_out, _ex5);
			}
				break;
			}
			case 1: // get_property_value
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				_out.write_any(get_property_value(_arg0));
			}
			catch(org.omg.CosPropertyService.PropertyNotFound _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.PropertyNotFoundHelper.write(_out, _ex0);
			}
			catch(org.omg.CosPropertyService.InvalidPropertyName _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.InvalidPropertyNameHelper.write(_out, _ex1);
			}
				break;
			}
			case 2: // set_property_modes
			{
			try
			{
				org.omg.CosPropertyService.PropertyMode[] _arg0=org.omg.CosPropertyService.PropertyModesHelper.read(_input);
				_out = handler.createReply();
				set_property_modes(_arg0);
			}
			catch(org.omg.CosPropertyService.MultipleExceptions _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.MultipleExceptionsHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // delete_property
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				delete_property(_arg0);
			}
			catch(org.omg.CosPropertyService.FixedProperty _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.FixedPropertyHelper.write(_out, _ex0);
			}
			catch(org.omg.CosPropertyService.PropertyNotFound _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.PropertyNotFoundHelper.write(_out, _ex1);
			}
			catch(org.omg.CosPropertyService.InvalidPropertyName _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.InvalidPropertyNameHelper.write(_out, _ex2);
			}
				break;
			}
			case 4: // get_properties
			{
				java.lang.String[] _arg0=org.omg.CosPropertyService.PropertyNamesHelper.read(_input);
				org.omg.CosPropertyService.PropertiesHolder _arg1= new org.omg.CosPropertyService.PropertiesHolder();
				_out = handler.createReply();
				_out.write_boolean(get_properties(_arg0,_arg1));
				org.omg.CosPropertyService.PropertiesHelper.write(_out,_arg1.value);
				break;
			}
			case 5: // get_property_modes
			{
				java.lang.String[] _arg0=org.omg.CosPropertyService.PropertyNamesHelper.read(_input);
				org.omg.CosPropertyService.PropertyModesHolder _arg1= new org.omg.CosPropertyService.PropertyModesHolder();
				_out = handler.createReply();
				_out.write_boolean(get_property_modes(_arg0,_arg1));
				org.omg.CosPropertyService.PropertyModesHelper.write(_out,_arg1.value);
				break;
			}
			case 6: // get_property_mode
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				org.omg.CosPropertyService.PropertyModeTypeHelper.write(_out,get_property_mode(_arg0));
			}
			catch(org.omg.CosPropertyService.PropertyNotFound _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.PropertyNotFoundHelper.write(_out, _ex0);
			}
			catch(org.omg.CosPropertyService.InvalidPropertyName _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.InvalidPropertyNameHelper.write(_out, _ex1);
			}
				break;
			}
			case 7: // set_property_mode
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				org.omg.CosPropertyService.PropertyModeType _arg1=org.omg.CosPropertyService.PropertyModeTypeHelper.read(_input);
				_out = handler.createReply();
				set_property_mode(_arg0,_arg1);
			}
			catch(org.omg.CosPropertyService.UnsupportedMode _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.UnsupportedModeHelper.write(_out, _ex0);
			}
			catch(org.omg.CosPropertyService.PropertyNotFound _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.PropertyNotFoundHelper.write(_out, _ex1);
			}
			catch(org.omg.CosPropertyService.InvalidPropertyName _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.InvalidPropertyNameHelper.write(_out, _ex2);
			}
				break;
			}
			case 8: // delete_properties
			{
			try
			{
				java.lang.String[] _arg0=org.omg.CosPropertyService.PropertyNamesHelper.read(_input);
				_out = handler.createReply();
				delete_properties(_arg0);
			}
			catch(org.omg.CosPropertyService.MultipleExceptions _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.MultipleExceptionsHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // get_all_property_names
			{
				int _arg0=_input.read_ulong();
				org.omg.CosPropertyService.PropertyNamesHolder _arg1= new org.omg.CosPropertyService.PropertyNamesHolder();
				org.omg.CosPropertyService.PropertyNamesIteratorHolder _arg2= new org.omg.CosPropertyService.PropertyNamesIteratorHolder();
				_out = handler.createReply();
				get_all_property_names(_arg0,_arg1,_arg2);
				org.omg.CosPropertyService.PropertyNamesHelper.write(_out,_arg1.value);
				org.omg.CosPropertyService.PropertyNamesIteratorHelper.write(_out,_arg2.value);
				break;
			}
			case 10: // get_allowed_property_types
			{
				org.omg.CosPropertyService.PropertyTypesHolder _arg0= new org.omg.CosPropertyService.PropertyTypesHolder();
				_out = handler.createReply();
				get_allowed_property_types(_arg0);
				org.omg.CosPropertyService.PropertyTypesHelper.write(_out,_arg0.value);
				break;
			}
			case 11: // delete_all_properties
			{
				_out = handler.createReply();
				_out.write_boolean(delete_all_properties());
				break;
			}
			case 12: // define_property
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				org.omg.CORBA.Any _arg1=_input.read_any();
				_out = handler.createReply();
				define_property(_arg0,_arg1);
			}
			catch(org.omg.CosPropertyService.ConflictingProperty _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.ConflictingPropertyHelper.write(_out, _ex0);
			}
			catch(org.omg.CosPropertyService.UnsupportedProperty _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.UnsupportedPropertyHelper.write(_out, _ex1);
			}
			catch(org.omg.CosPropertyService.UnsupportedTypeCode _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.UnsupportedTypeCodeHelper.write(_out, _ex2);
			}
			catch(org.omg.CosPropertyService.ReadOnlyProperty _ex3)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.ReadOnlyPropertyHelper.write(_out, _ex3);
			}
			catch(org.omg.CosPropertyService.InvalidPropertyName _ex4)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.InvalidPropertyNameHelper.write(_out, _ex4);
			}
				break;
			}
			case 13: // define_properties_with_modes
			{
			try
			{
				org.omg.CosPropertyService.PropertyDef[] _arg0=org.omg.CosPropertyService.PropertyDefsHelper.read(_input);
				_out = handler.createReply();
				define_properties_with_modes(_arg0);
			}
			catch(org.omg.CosPropertyService.MultipleExceptions _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.MultipleExceptionsHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // get_number_of_properties
			{
				_out = handler.createReply();
				_out.write_ulong(get_number_of_properties());
				break;
			}
			case 15: // get_all_properties
			{
				int _arg0=_input.read_ulong();
				org.omg.CosPropertyService.PropertiesHolder _arg1= new org.omg.CosPropertyService.PropertiesHolder();
				org.omg.CosPropertyService.PropertiesIteratorHolder _arg2= new org.omg.CosPropertyService.PropertiesIteratorHolder();
				_out = handler.createReply();
				get_all_properties(_arg0,_arg1,_arg2);
				org.omg.CosPropertyService.PropertiesHelper.write(_out,_arg1.value);
				org.omg.CosPropertyService.PropertiesIteratorHelper.write(_out,_arg2.value);
				break;
			}
			case 16: // is_property_defined
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				_out.write_boolean(is_property_defined(_arg0));
			}
			catch(org.omg.CosPropertyService.InvalidPropertyName _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.InvalidPropertyNameHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // define_properties
			{
			try
			{
				org.omg.CosPropertyService.Property[] _arg0=org.omg.CosPropertyService.PropertiesHelper.read(_input);
				_out = handler.createReply();
				define_properties(_arg0);
			}
			catch(org.omg.CosPropertyService.MultipleExceptions _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosPropertyService.MultipleExceptionsHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // get_allowed_properties
			{
				org.omg.CosPropertyService.PropertyDefsHolder _arg0= new org.omg.CosPropertyService.PropertyDefsHolder();
				_out = handler.createReply();
				get_allowed_properties(_arg0);
				org.omg.CosPropertyService.PropertyDefsHelper.write(_out,_arg0.value);
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

package org.omg.CosPropertyService;


/**
 * Generated from IDL interface "PropertySet".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public abstract class PropertySetPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosPropertyService.PropertySetOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "delete_properties", new java.lang.Integer(0));
		m_opsHash.put ( "get_property_value", new java.lang.Integer(1));
		m_opsHash.put ( "delete_property", new java.lang.Integer(2));
		m_opsHash.put ( "get_all_properties", new java.lang.Integer(3));
		m_opsHash.put ( "is_property_defined", new java.lang.Integer(4));
		m_opsHash.put ( "get_all_property_names", new java.lang.Integer(5));
		m_opsHash.put ( "get_properties", new java.lang.Integer(6));
		m_opsHash.put ( "define_properties", new java.lang.Integer(7));
		m_opsHash.put ( "define_property", new java.lang.Integer(8));
		m_opsHash.put ( "get_number_of_properties", new java.lang.Integer(9));
		m_opsHash.put ( "delete_all_properties", new java.lang.Integer(10));
	}
	private String[] ids = {"IDL:omg.org/CosPropertyService/PropertySet:1.0"};
	public org.omg.CosPropertyService.PropertySet _this()
	{
		return org.omg.CosPropertyService.PropertySetHelper.narrow(_this_object());
	}
	public org.omg.CosPropertyService.PropertySet _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosPropertyService.PropertySetHelper.narrow(_this_object(orb));
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
			case 0: // delete_properties
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
			case 2: // delete_property
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
			case 3: // get_all_properties
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
			case 4: // is_property_defined
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
			case 5: // get_all_property_names
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
			case 6: // get_properties
			{
				java.lang.String[] _arg0=org.omg.CosPropertyService.PropertyNamesHelper.read(_input);
				org.omg.CosPropertyService.PropertiesHolder _arg1= new org.omg.CosPropertyService.PropertiesHolder();
				_out = handler.createReply();
				_out.write_boolean(get_properties(_arg0,_arg1));
				org.omg.CosPropertyService.PropertiesHelper.write(_out,_arg1.value);
				break;
			}
			case 7: // define_properties
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
			case 8: // define_property
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
			case 9: // get_number_of_properties
			{
				_out = handler.createReply();
				_out.write_ulong(get_number_of_properties());
				break;
			}
			case 10: // delete_all_properties
			{
				_out = handler.createReply();
				_out.write_boolean(delete_all_properties());
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

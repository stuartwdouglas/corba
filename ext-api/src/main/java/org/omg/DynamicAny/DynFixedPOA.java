package org.omg.DynamicAny;


/**
 * Generated from IDL interface "DynFixed".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public abstract class DynFixedPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.DynamicAny.DynFixedOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "get_reference", new java.lang.Integer(0));
		m_opsHash.put ( "insert_typecode", new java.lang.Integer(1));
		m_opsHash.put ( "get_typecode", new java.lang.Integer(2));
		m_opsHash.put ( "set_value", new java.lang.Integer(3));
		m_opsHash.put ( "copy", new java.lang.Integer(4));
		m_opsHash.put ( "get_ulong", new java.lang.Integer(5));
		m_opsHash.put ( "insert_float", new java.lang.Integer(6));
		m_opsHash.put ( "get_any", new java.lang.Integer(7));
		m_opsHash.put ( "get_short", new java.lang.Integer(8));
		m_opsHash.put ( "from_any", new java.lang.Integer(9));
		m_opsHash.put ( "get_string", new java.lang.Integer(10));
		m_opsHash.put ( "get_float", new java.lang.Integer(11));
		m_opsHash.put ( "insert_ulonglong", new java.lang.Integer(12));
		m_opsHash.put ( "insert_reference", new java.lang.Integer(13));
		m_opsHash.put ( "insert_string", new java.lang.Integer(14));
		m_opsHash.put ( "current_component", new java.lang.Integer(15));
		m_opsHash.put ( "get_boolean", new java.lang.Integer(16));
		m_opsHash.put ( "insert_boolean", new java.lang.Integer(17));
		m_opsHash.put ( "get_value", new java.lang.Integer(18));
		m_opsHash.put ( "next", new java.lang.Integer(19));
		m_opsHash.put ( "insert_char", new java.lang.Integer(20));
		m_opsHash.put ( "insert_wstring", new java.lang.Integer(21));
		m_opsHash.put ( "get_dyn_any", new java.lang.Integer(22));
		m_opsHash.put ( "to_any", new java.lang.Integer(23));
		m_opsHash.put ( "get_char", new java.lang.Integer(24));
		m_opsHash.put ( "seek", new java.lang.Integer(25));
		m_opsHash.put ( "destroy", new java.lang.Integer(26));
		m_opsHash.put ( "insert_short", new java.lang.Integer(27));
		m_opsHash.put ( "type", new java.lang.Integer(28));
		m_opsHash.put ( "insert_double", new java.lang.Integer(29));
		m_opsHash.put ( "get_longlong", new java.lang.Integer(30));
		m_opsHash.put ( "component_count", new java.lang.Integer(31));
		m_opsHash.put ( "insert_wchar", new java.lang.Integer(32));
		m_opsHash.put ( "insert_any", new java.lang.Integer(33));
		m_opsHash.put ( "insert_ushort", new java.lang.Integer(34));
		m_opsHash.put ( "get_ushort", new java.lang.Integer(35));
		m_opsHash.put ( "get_wstring", new java.lang.Integer(36));
		m_opsHash.put ( "get_long", new java.lang.Integer(37));
		m_opsHash.put ( "assign", new java.lang.Integer(38));
		m_opsHash.put ( "get_wchar", new java.lang.Integer(39));
		m_opsHash.put ( "insert_longlong", new java.lang.Integer(40));
		m_opsHash.put ( "insert_long", new java.lang.Integer(41));
		m_opsHash.put ( "insert_dyn_any", new java.lang.Integer(42));
		m_opsHash.put ( "rewind", new java.lang.Integer(43));
		m_opsHash.put ( "insert_ulong", new java.lang.Integer(44));
		m_opsHash.put ( "get_ulonglong", new java.lang.Integer(45));
		m_opsHash.put ( "insert_octet", new java.lang.Integer(46));
		m_opsHash.put ( "equal", new java.lang.Integer(47));
		m_opsHash.put ( "get_double", new java.lang.Integer(48));
		m_opsHash.put ( "get_octet", new java.lang.Integer(49));
	}
	private String[] ids = {"IDL:omg.org/DynamicAny/DynFixed:1.0","IDL:omg.org/DynamicAny/DynAny:1.0"};
	public org.omg.DynamicAny.DynFixed _this()
	{
		return org.omg.DynamicAny.DynFixedHelper.narrow(_this_object());
	}
	public org.omg.DynamicAny.DynFixed _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.DynamicAny.DynFixedHelper.narrow(_this_object(orb));
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
			case 0: // get_reference
			{
			try
			{
				_out = handler.createReply();
				_out.write_Object(get_reference());
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 1: // insert_typecode
			{
			try
			{
				org.omg.CORBA.TypeCode _arg0=_input.read_TypeCode();
				_out = handler.createReply();
				insert_typecode(_arg0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 2: // get_typecode
			{
			try
			{
				_out = handler.createReply();
				_out.write_TypeCode(get_typecode());
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 3: // set_value
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				_out.write_boolean(set_value(_arg0));
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 4: // copy
			{
				_out = handler.createReply();
				org.omg.DynamicAny.DynAnyHelper.write(_out,copy());
				break;
			}
			case 5: // get_ulong
			{
			try
			{
				_out = handler.createReply();
				_out.write_ulong(get_ulong());
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 6: // insert_float
			{
			try
			{
				float _arg0=_input.read_float();
				_out = handler.createReply();
				insert_float(_arg0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 7: // get_any
			{
			try
			{
				_out = handler.createReply();
				_out.write_any(get_any());
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 8: // get_short
			{
			try
			{
				_out = handler.createReply();
				_out.write_short(get_short());
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 9: // from_any
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				from_any(_arg0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 10: // get_string
			{
			try
			{
				_out = handler.createReply();
				_out.write_string(get_string());
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 11: // get_float
			{
			try
			{
				_out = handler.createReply();
				_out.write_float(get_float());
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 12: // insert_ulonglong
			{
			try
			{
				long _arg0=_input.read_ulonglong();
				_out = handler.createReply();
				insert_ulonglong(_arg0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 13: // insert_reference
			{
			try
			{
				org.omg.CORBA.Object _arg0=_input.read_Object();
				_out = handler.createReply();
				insert_reference(_arg0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 14: // insert_string
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				insert_string(_arg0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 15: // current_component
			{
			try
			{
				_out = handler.createReply();
				org.omg.DynamicAny.DynAnyHelper.write(_out,current_component());
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // get_boolean
			{
			try
			{
				_out = handler.createReply();
				_out.write_boolean(get_boolean());
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 17: // insert_boolean
			{
			try
			{
				boolean _arg0=_input.read_boolean();
				_out = handler.createReply();
				insert_boolean(_arg0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 18: // get_value
			{
				_out = handler.createReply();
				_out.write_string(get_value());
				break;
			}
			case 19: // next
			{
				_out = handler.createReply();
				_out.write_boolean(next());
				break;
			}
			case 20: // insert_char
			{
			try
			{
				char _arg0=_input.read_char();
				_out = handler.createReply();
				insert_char(_arg0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 21: // insert_wstring
			{
			try
			{
				java.lang.String _arg0=_input.read_wstring();
				_out = handler.createReply();
				insert_wstring(_arg0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 22: // get_dyn_any
			{
			try
			{
				_out = handler.createReply();
				org.omg.DynamicAny.DynAnyHelper.write(_out,get_dyn_any());
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 23: // to_any
			{
				_out = handler.createReply();
				_out.write_any(to_any());
				break;
			}
			case 24: // get_char
			{
			try
			{
				_out = handler.createReply();
				_out.write_char(get_char());
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 25: // seek
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				_out.write_boolean(seek(_arg0));
				break;
			}
			case 26: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
			case 27: // insert_short
			{
			try
			{
				short _arg0=_input.read_short();
				_out = handler.createReply();
				insert_short(_arg0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 28: // type
			{
				_out = handler.createReply();
				_out.write_TypeCode(type());
				break;
			}
			case 29: // insert_double
			{
			try
			{
				double _arg0=_input.read_double();
				_out = handler.createReply();
				insert_double(_arg0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 30: // get_longlong
			{
			try
			{
				_out = handler.createReply();
				_out.write_longlong(get_longlong());
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 31: // component_count
			{
				_out = handler.createReply();
				_out.write_ulong(component_count());
				break;
			}
			case 32: // insert_wchar
			{
			try
			{
				char _arg0=_input.read_wchar();
				_out = handler.createReply();
				insert_wchar(_arg0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 33: // insert_any
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				insert_any(_arg0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 34: // insert_ushort
			{
			try
			{
				short _arg0=_input.read_ushort();
				_out = handler.createReply();
				insert_ushort(_arg0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 35: // get_ushort
			{
			try
			{
				_out = handler.createReply();
				_out.write_ushort(get_ushort());
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 36: // get_wstring
			{
			try
			{
				_out = handler.createReply();
				_out.write_wstring(get_wstring());
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 37: // get_long
			{
			try
			{
				_out = handler.createReply();
				_out.write_long(get_long());
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 38: // assign
			{
			try
			{
				org.omg.DynamicAny.DynAny _arg0=org.omg.DynamicAny.DynAnyHelper.read(_input);
				_out = handler.createReply();
				assign(_arg0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex0);
			}
				break;
			}
			case 39: // get_wchar
			{
			try
			{
				_out = handler.createReply();
				_out.write_wchar(get_wchar());
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 40: // insert_longlong
			{
			try
			{
				long _arg0=_input.read_longlong();
				_out = handler.createReply();
				insert_longlong(_arg0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 41: // insert_long
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				insert_long(_arg0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 42: // insert_dyn_any
			{
			try
			{
				org.omg.DynamicAny.DynAny _arg0=org.omg.DynamicAny.DynAnyHelper.read(_input);
				_out = handler.createReply();
				insert_dyn_any(_arg0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 43: // rewind
			{
				_out = handler.createReply();
				rewind();
				break;
			}
			case 44: // insert_ulong
			{
			try
			{
				int _arg0=_input.read_ulong();
				_out = handler.createReply();
				insert_ulong(_arg0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 45: // get_ulonglong
			{
			try
			{
				_out = handler.createReply();
				_out.write_ulonglong(get_ulonglong());
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 46: // insert_octet
			{
			try
			{
				byte _arg0=_input.read_octet();
				_out = handler.createReply();
				insert_octet(_arg0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 47: // equal
			{
				org.omg.DynamicAny.DynAny _arg0=org.omg.DynamicAny.DynAnyHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(equal(_arg0));
				break;
			}
			case 48: // get_double
			{
			try
			{
				_out = handler.createReply();
				_out.write_double(get_double());
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
			}
				break;
			}
			case 49: // get_octet
			{
			try
			{
				_out = handler.createReply();
				_out.write_octet(get_octet());
			}
			catch(org.omg.DynamicAny.DynAnyPackage.InvalidValue _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, _ex0);
			}
			catch(org.omg.DynamicAny.DynAnyPackage.TypeMismatch _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.write(_out, _ex1);
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

package org.omg.CORBA;


/**
 * Generated from IDL interface "InterfaceDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public abstract class InterfaceDefPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CORBA.InterfaceDefOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "create_value", new java.lang.Integer(0));
		m_opsHash.put ( "create_interface", new java.lang.Integer(1));
		m_opsHash.put ( "_get_id", new java.lang.Integer(2));
		m_opsHash.put ( "is_a", new java.lang.Integer(3));
		m_opsHash.put ( "_get_absolute_name", new java.lang.Integer(4));
		m_opsHash.put ( "create_struct", new java.lang.Integer(5));
		m_opsHash.put ( "describe_contents", new java.lang.Integer(6));
		m_opsHash.put ( "create_alias", new java.lang.Integer(7));
		m_opsHash.put ( "create_enum", new java.lang.Integer(8));
		m_opsHash.put ( "lookup", new java.lang.Integer(9));
		m_opsHash.put ( "_set_version", new java.lang.Integer(10));
		m_opsHash.put ( "describe", new java.lang.Integer(11));
		m_opsHash.put ( "_set_name", new java.lang.Integer(12));
		m_opsHash.put ( "_get_is_abstract", new java.lang.Integer(13));
		m_opsHash.put ( "_get_defined_in", new java.lang.Integer(14));
		m_opsHash.put ( "create_operation", new java.lang.Integer(15));
		m_opsHash.put ( "_get_containing_repository", new java.lang.Integer(16));
		m_opsHash.put ( "create_module", new java.lang.Integer(17));
		m_opsHash.put ( "move", new java.lang.Integer(18));
		m_opsHash.put ( "_get_version", new java.lang.Integer(19));
		m_opsHash.put ( "create_constant", new java.lang.Integer(20));
		m_opsHash.put ( "destroy", new java.lang.Integer(21));
		m_opsHash.put ( "lookup_name", new java.lang.Integer(22));
		m_opsHash.put ( "_get_type", new java.lang.Integer(23));
		m_opsHash.put ( "_set_id", new java.lang.Integer(24));
		m_opsHash.put ( "contents", new java.lang.Integer(25));
		m_opsHash.put ( "_get_def_kind", new java.lang.Integer(26));
		m_opsHash.put ( "_get_base_interfaces", new java.lang.Integer(27));
		m_opsHash.put ( "_set_base_interfaces", new java.lang.Integer(28));
		m_opsHash.put ( "create_value_box", new java.lang.Integer(29));
		m_opsHash.put ( "describe_interface", new java.lang.Integer(30));
		m_opsHash.put ( "create_attribute", new java.lang.Integer(31));
		m_opsHash.put ( "create_union", new java.lang.Integer(32));
		m_opsHash.put ( "create_exception", new java.lang.Integer(33));
		m_opsHash.put ( "_get_name", new java.lang.Integer(34));
		m_opsHash.put ( "_set_is_abstract", new java.lang.Integer(35));
		m_opsHash.put ( "create_native", new java.lang.Integer(36));
	}
	private String[] ids = {"IDL:omg.org/CORBA/InterfaceDef:1.0","IDL:omg.org/CORBA/Container:1.0","IDL:omg.org/CORBA/Contained:1.0","IDL:omg.org/CORBA/IDLType:1.0","IDL:omg.org/CORBA/IRObject:1.0"};
	public org.omg.CORBA.InterfaceDef _this()
	{
		return org.omg.CORBA.InterfaceDefHelper.narrow(_this_object());
	}
	public org.omg.CORBA.InterfaceDef _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CORBA.InterfaceDefHelper.narrow(_this_object(orb));
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
			case 0: // create_value
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				boolean _arg3=_input.read_boolean();
				boolean _arg4=_input.read_boolean();
				org.omg.CORBA.ValueDef _arg5=org.omg.CORBA.ValueDefHelper.read(_input);
				boolean _arg6=_input.read_boolean();
				org.omg.CORBA.ValueDef[] _arg7=org.omg.CORBA.ValueDefSeqHelper.read(_input);
				org.omg.CORBA.InterfaceDef[] _arg8=org.omg.CORBA.InterfaceDefSeqHelper.read(_input);
				org.omg.CORBA.Initializer[] _arg9=org.omg.CORBA.InitializerSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.ValueDefHelper.write(_out,create_value(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8,_arg9));
				break;
			}
			case 1: // create_interface
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.InterfaceDef[] _arg3=org.omg.CORBA.InterfaceDefSeqHelper.read(_input);
				boolean _arg4=_input.read_boolean();
				_out = handler.createReply();
				org.omg.CORBA.InterfaceDefHelper.write(_out,create_interface(_arg0,_arg1,_arg2,_arg3,_arg4));
				break;
			}
			case 2: // _get_id
			{
			_out = handler.createReply();
			_out.write_string(id());
				break;
			}
			case 3: // is_a
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				_out.write_boolean(is_a(_arg0));
				break;
			}
			case 4: // _get_absolute_name
			{
			_out = handler.createReply();
			_out.write_string(absolute_name());
				break;
			}
			case 5: // create_struct
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.StructMember[] _arg3=org.omg.CORBA.StructMemberSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.StructDefHelper.write(_out,create_struct(_arg0,_arg1,_arg2,_arg3));
				break;
			}
			case 6: // describe_contents
			{
				org.omg.CORBA.DefinitionKind _arg0=org.omg.CORBA.DefinitionKindHelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_long();
				_out = handler.createReply();
				org.omg.CORBA.ContainerPackage.DescriptionSeqHelper.write(_out,describe_contents(_arg0,_arg1,_arg2));
				break;
			}
			case 7: // create_alias
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.IDLType _arg3=org.omg.CORBA.IDLTypeHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.AliasDefHelper.write(_out,create_alias(_arg0,_arg1,_arg2,_arg3));
				break;
			}
			case 8: // create_enum
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				java.lang.String[] _arg3=org.omg.CORBA.EnumMemberSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.EnumDefHelper.write(_out,create_enum(_arg0,_arg1,_arg2,_arg3));
				break;
			}
			case 9: // lookup
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				org.omg.CORBA.ContainedHelper.write(_out,lookup(_arg0));
				break;
			}
			case 10: // _set_version
			{
			_out = handler.createReply();
			version(_input.read_string());
				break;
			}
			case 11: // describe
			{
				_out = handler.createReply();
				org.omg.CORBA.ContainedPackage.DescriptionHelper.write(_out,describe());
				break;
			}
			case 12: // _set_name
			{
			_out = handler.createReply();
			name(_input.read_string());
				break;
			}
			case 13: // _get_is_abstract
			{
			_out = handler.createReply();
			_out.write_boolean(is_abstract());
				break;
			}
			case 14: // _get_defined_in
			{
			_out = handler.createReply();
			org.omg.CORBA.ContainerHelper.write(_out,defined_in());
				break;
			}
			case 15: // create_operation
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.IDLType _arg3=org.omg.CORBA.IDLTypeHelper.read(_input);
				org.omg.CORBA.OperationMode _arg4=org.omg.CORBA.OperationModeHelper.read(_input);
				org.omg.CORBA.ParameterDescription[] _arg5=org.omg.CORBA.ParDescriptionSeqHelper.read(_input);
				org.omg.CORBA.ExceptionDef[] _arg6=org.omg.CORBA.ExceptionDefSeqHelper.read(_input);
				java.lang.String[] _arg7=org.omg.CORBA.ContextIdSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.OperationDefHelper.write(_out,create_operation(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7));
				break;
			}
			case 16: // _get_containing_repository
			{
			_out = handler.createReply();
			org.omg.CORBA.RepositoryHelper.write(_out,containing_repository());
				break;
			}
			case 17: // create_module
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				_out = handler.createReply();
				org.omg.CORBA.ModuleDefHelper.write(_out,create_module(_arg0,_arg1,_arg2));
				break;
			}
			case 18: // move
			{
				org.omg.CORBA.Container _arg0=org.omg.CORBA.ContainerHelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				_out = handler.createReply();
				move(_arg0,_arg1,_arg2);
				break;
			}
			case 19: // _get_version
			{
			_out = handler.createReply();
			_out.write_string(version());
				break;
			}
			case 20: // create_constant
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.IDLType _arg3=org.omg.CORBA.IDLTypeHelper.read(_input);
				org.omg.CORBA.Any _arg4=_input.read_any();
				_out = handler.createReply();
				org.omg.CORBA.ConstantDefHelper.write(_out,create_constant(_arg0,_arg1,_arg2,_arg3,_arg4));
				break;
			}
			case 21: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
			case 22: // lookup_name
			{
				java.lang.String _arg0=_input.read_string();
				int _arg1=_input.read_long();
				org.omg.CORBA.DefinitionKind _arg2=org.omg.CORBA.DefinitionKindHelper.read(_input);
				boolean _arg3=_input.read_boolean();
				_out = handler.createReply();
				org.omg.CORBA.ContainedSeqHelper.write(_out,lookup_name(_arg0,_arg1,_arg2,_arg3));
				break;
			}
			case 23: // _get_type
			{
			_out = handler.createReply();
			_out.write_TypeCode(type());
				break;
			}
			case 24: // _set_id
			{
			_out = handler.createReply();
			id(_input.read_string());
				break;
			}
			case 25: // contents
			{
				org.omg.CORBA.DefinitionKind _arg0=org.omg.CORBA.DefinitionKindHelper.read(_input);
				boolean _arg1=_input.read_boolean();
				_out = handler.createReply();
				org.omg.CORBA.ContainedSeqHelper.write(_out,contents(_arg0,_arg1));
				break;
			}
			case 26: // _get_def_kind
			{
			_out = handler.createReply();
			org.omg.CORBA.DefinitionKindHelper.write(_out,def_kind());
				break;
			}
			case 27: // _get_base_interfaces
			{
			_out = handler.createReply();
			org.omg.CORBA.InterfaceDefSeqHelper.write(_out,base_interfaces());
				break;
			}
			case 28: // _set_base_interfaces
			{
			_out = handler.createReply();
			base_interfaces(org.omg.CORBA.InterfaceDefSeqHelper.read(_input));
				break;
			}
			case 29: // create_value_box
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.IDLType _arg3=org.omg.CORBA.IDLTypeHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.ValueBoxDefHelper.write(_out,create_value_box(_arg0,_arg1,_arg2,_arg3));
				break;
			}
			case 30: // describe_interface
			{
				_out = handler.createReply();
				org.omg.CORBA.InterfaceDefPackage.FullInterfaceDescriptionHelper.write(_out,describe_interface());
				break;
			}
			case 31: // create_attribute
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.IDLType _arg3=org.omg.CORBA.IDLTypeHelper.read(_input);
				org.omg.CORBA.AttributeMode _arg4=org.omg.CORBA.AttributeModeHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.AttributeDefHelper.write(_out,create_attribute(_arg0,_arg1,_arg2,_arg3,_arg4));
				break;
			}
			case 32: // create_union
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.IDLType _arg3=org.omg.CORBA.IDLTypeHelper.read(_input);
				org.omg.CORBA.UnionMember[] _arg4=org.omg.CORBA.UnionMemberSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.UnionDefHelper.write(_out,create_union(_arg0,_arg1,_arg2,_arg3,_arg4));
				break;
			}
			case 33: // create_exception
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.StructMember[] _arg3=org.omg.CORBA.StructMemberSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.ExceptionDefHelper.write(_out,create_exception(_arg0,_arg1,_arg2,_arg3));
				break;
			}
			case 34: // _get_name
			{
			_out = handler.createReply();
			_out.write_string(name());
				break;
			}
			case 35: // _set_is_abstract
			{
			_out = handler.createReply();
			is_abstract(_input.read_boolean());
				break;
			}
			case 36: // create_native
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				_out = handler.createReply();
				org.omg.CORBA.NativeDefHelper.write(_out,create_native(_arg0,_arg1,_arg2));
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

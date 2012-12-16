package org.omg.CORBA;


/**
 * Generated from IDL interface "Repository".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public abstract class RepositoryPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CORBA.RepositoryOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "create_struct", new java.lang.Integer(0));
		m_opsHash.put ( "create_constant", new java.lang.Integer(1));
		m_opsHash.put ( "create_fixed", new java.lang.Integer(2));
		m_opsHash.put ( "_get_def_kind", new java.lang.Integer(3));
		m_opsHash.put ( "lookup_id", new java.lang.Integer(4));
		m_opsHash.put ( "create_alias", new java.lang.Integer(5));
		m_opsHash.put ( "create_wstring", new java.lang.Integer(6));
		m_opsHash.put ( "create_union", new java.lang.Integer(7));
		m_opsHash.put ( "create_native", new java.lang.Integer(8));
		m_opsHash.put ( "lookup", new java.lang.Integer(9));
		m_opsHash.put ( "create_value_box", new java.lang.Integer(10));
		m_opsHash.put ( "create_string", new java.lang.Integer(11));
		m_opsHash.put ( "lookup_name", new java.lang.Integer(12));
		m_opsHash.put ( "describe_contents", new java.lang.Integer(13));
		m_opsHash.put ( "create_module", new java.lang.Integer(14));
		m_opsHash.put ( "create_value", new java.lang.Integer(15));
		m_opsHash.put ( "contents", new java.lang.Integer(16));
		m_opsHash.put ( "create_enum", new java.lang.Integer(17));
		m_opsHash.put ( "create_sequence", new java.lang.Integer(18));
		m_opsHash.put ( "get_primitive", new java.lang.Integer(19));
		m_opsHash.put ( "create_array", new java.lang.Integer(20));
		m_opsHash.put ( "create_exception", new java.lang.Integer(21));
		m_opsHash.put ( "destroy", new java.lang.Integer(22));
		m_opsHash.put ( "get_canonical_typecode", new java.lang.Integer(23));
		m_opsHash.put ( "create_interface", new java.lang.Integer(24));
	}
	private String[] ids = {"IDL:omg.org/CORBA/Repository:1.0","IDL:omg.org/CORBA/Container:1.0","IDL:omg.org/CORBA/IRObject:1.0"};
	public org.omg.CORBA.Repository _this()
	{
		return org.omg.CORBA.RepositoryHelper.narrow(_this_object());
	}
	public org.omg.CORBA.Repository _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CORBA.RepositoryHelper.narrow(_this_object(orb));
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
			case 0: // create_struct
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.StructMember[] _arg3=org.omg.CORBA.StructMemberSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.StructDefHelper.write(_out,create_struct(_arg0,_arg1,_arg2,_arg3));
				break;
			}
			case 1: // create_constant
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
			case 2: // create_fixed
			{
				short _arg0=_input.read_ushort();
				short _arg1=_input.read_short();
				_out = handler.createReply();
				org.omg.CORBA.FixedDefHelper.write(_out,create_fixed(_arg0,_arg1));
				break;
			}
			case 3: // _get_def_kind
			{
			_out = handler.createReply();
			org.omg.CORBA.DefinitionKindHelper.write(_out,def_kind());
				break;
			}
			case 4: // lookup_id
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				org.omg.CORBA.ContainedHelper.write(_out,lookup_id(_arg0));
				break;
			}
			case 5: // create_alias
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.IDLType _arg3=org.omg.CORBA.IDLTypeHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.AliasDefHelper.write(_out,create_alias(_arg0,_arg1,_arg2,_arg3));
				break;
			}
			case 6: // create_wstring
			{
				int _arg0=_input.read_ulong();
				_out = handler.createReply();
				org.omg.CORBA.WstringDefHelper.write(_out,create_wstring(_arg0));
				break;
			}
			case 7: // create_union
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
			case 8: // create_native
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				_out = handler.createReply();
				org.omg.CORBA.NativeDefHelper.write(_out,create_native(_arg0,_arg1,_arg2));
				break;
			}
			case 9: // lookup
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				org.omg.CORBA.ContainedHelper.write(_out,lookup(_arg0));
				break;
			}
			case 10: // create_value_box
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.IDLType _arg3=org.omg.CORBA.IDLTypeHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.ValueBoxDefHelper.write(_out,create_value_box(_arg0,_arg1,_arg2,_arg3));
				break;
			}
			case 11: // create_string
			{
				int _arg0=_input.read_ulong();
				_out = handler.createReply();
				org.omg.CORBA.StringDefHelper.write(_out,create_string(_arg0));
				break;
			}
			case 12: // lookup_name
			{
				java.lang.String _arg0=_input.read_string();
				int _arg1=_input.read_long();
				org.omg.CORBA.DefinitionKind _arg2=org.omg.CORBA.DefinitionKindHelper.read(_input);
				boolean _arg3=_input.read_boolean();
				_out = handler.createReply();
				org.omg.CORBA.ContainedSeqHelper.write(_out,lookup_name(_arg0,_arg1,_arg2,_arg3));
				break;
			}
			case 13: // describe_contents
			{
				org.omg.CORBA.DefinitionKind _arg0=org.omg.CORBA.DefinitionKindHelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_long();
				_out = handler.createReply();
				org.omg.CORBA.ContainerPackage.DescriptionSeqHelper.write(_out,describe_contents(_arg0,_arg1,_arg2));
				break;
			}
			case 14: // create_module
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				_out = handler.createReply();
				org.omg.CORBA.ModuleDefHelper.write(_out,create_module(_arg0,_arg1,_arg2));
				break;
			}
			case 15: // create_value
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
			case 16: // contents
			{
				org.omg.CORBA.DefinitionKind _arg0=org.omg.CORBA.DefinitionKindHelper.read(_input);
				boolean _arg1=_input.read_boolean();
				_out = handler.createReply();
				org.omg.CORBA.ContainedSeqHelper.write(_out,contents(_arg0,_arg1));
				break;
			}
			case 17: // create_enum
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				java.lang.String[] _arg3=org.omg.CORBA.EnumMemberSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.EnumDefHelper.write(_out,create_enum(_arg0,_arg1,_arg2,_arg3));
				break;
			}
			case 18: // create_sequence
			{
				int _arg0=_input.read_ulong();
				org.omg.CORBA.IDLType _arg1=org.omg.CORBA.IDLTypeHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.SequenceDefHelper.write(_out,create_sequence(_arg0,_arg1));
				break;
			}
			case 19: // get_primitive
			{
				org.omg.CORBA.PrimitiveKind _arg0=org.omg.CORBA.PrimitiveKindHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.PrimitiveDefHelper.write(_out,get_primitive(_arg0));
				break;
			}
			case 20: // create_array
			{
				int _arg0=_input.read_ulong();
				org.omg.CORBA.IDLType _arg1=org.omg.CORBA.IDLTypeHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.ArrayDefHelper.write(_out,create_array(_arg0,_arg1));
				break;
			}
			case 21: // create_exception
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.StructMember[] _arg3=org.omg.CORBA.StructMemberSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.ExceptionDefHelper.write(_out,create_exception(_arg0,_arg1,_arg2,_arg3));
				break;
			}
			case 22: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
			case 23: // get_canonical_typecode
			{
				org.omg.CORBA.TypeCode _arg0=_input.read_TypeCode();
				_out = handler.createReply();
				_out.write_TypeCode(get_canonical_typecode(_arg0));
				break;
			}
			case 24: // create_interface
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
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}

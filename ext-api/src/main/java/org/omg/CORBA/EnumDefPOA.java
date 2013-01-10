package org.omg.CORBA;


/**
 * Generated from IDL interface "EnumDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public abstract class EnumDefPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CORBA.EnumDefOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "_get_def_kind", new java.lang.Integer(0));
		m_opsHash.put ( "_get_type", new java.lang.Integer(1));
		m_opsHash.put ( "_get_absolute_name", new java.lang.Integer(2));
		m_opsHash.put ( "_set_id", new java.lang.Integer(3));
		m_opsHash.put ( "_get_name", new java.lang.Integer(4));
		m_opsHash.put ( "_get_version", new java.lang.Integer(5));
		m_opsHash.put ( "describe", new java.lang.Integer(6));
		m_opsHash.put ( "_set_version", new java.lang.Integer(7));
		m_opsHash.put ( "_get_id", new java.lang.Integer(8));
		m_opsHash.put ( "_get_containing_repository", new java.lang.Integer(9));
		m_opsHash.put ( "destroy", new java.lang.Integer(10));
		m_opsHash.put ( "_get_defined_in", new java.lang.Integer(11));
		m_opsHash.put ( "move", new java.lang.Integer(12));
		m_opsHash.put ( "_set_name", new java.lang.Integer(13));
		m_opsHash.put ( "_get_members", new java.lang.Integer(14));
		m_opsHash.put ( "_set_members", new java.lang.Integer(15));
	}
	private String[] ids = {"IDL:omg.org/CORBA/EnumDef:1.0","IDL:omg.org/CORBA/Contained:1.0","IDL:omg.org/CORBA/IDLType:1.0","IDL:omg.org/CORBA/TypedefDef:1.0","IDL:omg.org/CORBA/IRObject:1.0"};
	public org.omg.CORBA.EnumDef _this()
	{
		return org.omg.CORBA.EnumDefHelper.narrow(_this_object());
	}
	public org.omg.CORBA.EnumDef _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CORBA.EnumDefHelper.narrow(_this_object(orb));
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
			case 0: // _get_def_kind
			{
			_out = handler.createReply();
			org.omg.CORBA.DefinitionKindHelper.write(_out,def_kind());
				break;
			}
			case 1: // _get_type
			{
			_out = handler.createReply();
			_out.write_TypeCode(type());
				break;
			}
			case 2: // _get_absolute_name
			{
			_out = handler.createReply();
			_out.write_string(absolute_name());
				break;
			}
			case 3: // _set_id
			{
			_out = handler.createReply();
			id(_input.read_string());
				break;
			}
			case 4: // _get_name
			{
			_out = handler.createReply();
			_out.write_string(name());
				break;
			}
			case 5: // _get_version
			{
			_out = handler.createReply();
			_out.write_string(version());
				break;
			}
			case 6: // describe
			{
				_out = handler.createReply();
				org.omg.CORBA.ContainedPackage.DescriptionHelper.write(_out,describe());
				break;
			}
			case 7: // _set_version
			{
			_out = handler.createReply();
			version(_input.read_string());
				break;
			}
			case 8: // _get_id
			{
			_out = handler.createReply();
			_out.write_string(id());
				break;
			}
			case 9: // _get_containing_repository
			{
			_out = handler.createReply();
			org.omg.CORBA.RepositoryHelper.write(_out,containing_repository());
				break;
			}
			case 10: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
			case 11: // _get_defined_in
			{
			_out = handler.createReply();
			org.omg.CORBA.ContainerHelper.write(_out,defined_in());
				break;
			}
			case 12: // move
			{
				org.omg.CORBA.Container _arg0=org.omg.CORBA.ContainerHelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				_out = handler.createReply();
				move(_arg0,_arg1,_arg2);
				break;
			}
			case 13: // _set_name
			{
			_out = handler.createReply();
			name(_input.read_string());
				break;
			}
			case 14: // _get_members
			{
			_out = handler.createReply();
			org.omg.CORBA.EnumMemberSeqHelper.write(_out,members());
				break;
			}
			case 15: // _set_members
			{
			_out = handler.createReply();
			members(org.omg.CORBA.EnumMemberSeqHelper.read(_input));
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

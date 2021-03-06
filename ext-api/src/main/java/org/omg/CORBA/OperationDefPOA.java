package org.omg.CORBA;


/**
 * Generated from IDL interface "OperationDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public abstract class OperationDefPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CORBA.OperationDefOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "_get_containing_repository", new java.lang.Integer(0));
		m_opsHash.put ( "_get_def_kind", new java.lang.Integer(1));
		m_opsHash.put ( "_get_absolute_name", new java.lang.Integer(2));
		m_opsHash.put ( "_get_name", new java.lang.Integer(3));
		m_opsHash.put ( "_set_name", new java.lang.Integer(4));
		m_opsHash.put ( "_set_params", new java.lang.Integer(5));
		m_opsHash.put ( "_get_result_def", new java.lang.Integer(6));
		m_opsHash.put ( "_get_contexts", new java.lang.Integer(7));
		m_opsHash.put ( "_get_defined_in", new java.lang.Integer(8));
		m_opsHash.put ( "_get_mode", new java.lang.Integer(9));
		m_opsHash.put ( "_get_version", new java.lang.Integer(10));
		m_opsHash.put ( "_set_result_def", new java.lang.Integer(11));
		m_opsHash.put ( "_set_version", new java.lang.Integer(12));
		m_opsHash.put ( "describe", new java.lang.Integer(13));
		m_opsHash.put ( "_get_params", new java.lang.Integer(14));
		m_opsHash.put ( "_get_id", new java.lang.Integer(15));
		m_opsHash.put ( "move", new java.lang.Integer(16));
		m_opsHash.put ( "_get_result", new java.lang.Integer(17));
		m_opsHash.put ( "_set_contexts", new java.lang.Integer(18));
		m_opsHash.put ( "_set_mode", new java.lang.Integer(19));
		m_opsHash.put ( "destroy", new java.lang.Integer(20));
		m_opsHash.put ( "_get_exceptions", new java.lang.Integer(21));
		m_opsHash.put ( "_set_exceptions", new java.lang.Integer(22));
		m_opsHash.put ( "_set_id", new java.lang.Integer(23));
	}
	private String[] ids = {"IDL:omg.org/CORBA/OperationDef:1.0","IDL:omg.org/CORBA/Contained:1.0","IDL:omg.org/CORBA/IRObject:1.0"};
	public org.omg.CORBA.OperationDef _this()
	{
		return org.omg.CORBA.OperationDefHelper.narrow(_this_object());
	}
	public org.omg.CORBA.OperationDef _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CORBA.OperationDefHelper.narrow(_this_object(orb));
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
			case 0: // _get_containing_repository
			{
			_out = handler.createReply();
			org.omg.CORBA.RepositoryHelper.write(_out,containing_repository());
				break;
			}
			case 1: // _get_def_kind
			{
			_out = handler.createReply();
			org.omg.CORBA.DefinitionKindHelper.write(_out,def_kind());
				break;
			}
			case 2: // _get_absolute_name
			{
			_out = handler.createReply();
			_out.write_string(absolute_name());
				break;
			}
			case 3: // _get_name
			{
			_out = handler.createReply();
			_out.write_string(name());
				break;
			}
			case 4: // _set_name
			{
			_out = handler.createReply();
			name(_input.read_string());
				break;
			}
			case 5: // _set_params
			{
			_out = handler.createReply();
			params(org.omg.CORBA.ParDescriptionSeqHelper.read(_input));
				break;
			}
			case 6: // _get_result_def
			{
			_out = handler.createReply();
			org.omg.CORBA.IDLTypeHelper.write(_out,result_def());
				break;
			}
			case 7: // _get_contexts
			{
			_out = handler.createReply();
			org.omg.CORBA.ContextIdSeqHelper.write(_out,contexts());
				break;
			}
			case 8: // _get_defined_in
			{
			_out = handler.createReply();
			org.omg.CORBA.ContainerHelper.write(_out,defined_in());
				break;
			}
			case 9: // _get_mode
			{
			_out = handler.createReply();
			org.omg.CORBA.OperationModeHelper.write(_out,mode());
				break;
			}
			case 10: // _get_version
			{
			_out = handler.createReply();
			_out.write_string(version());
				break;
			}
			case 11: // _set_result_def
			{
			_out = handler.createReply();
			result_def(org.omg.CORBA.IDLTypeHelper.read(_input));
				break;
			}
			case 12: // _set_version
			{
			_out = handler.createReply();
			version(_input.read_string());
				break;
			}
			case 13: // describe
			{
				_out = handler.createReply();
				org.omg.CORBA.ContainedPackage.DescriptionHelper.write(_out,describe());
				break;
			}
			case 14: // _get_params
			{
			_out = handler.createReply();
			org.omg.CORBA.ParDescriptionSeqHelper.write(_out,params());
				break;
			}
			case 15: // _get_id
			{
			_out = handler.createReply();
			_out.write_string(id());
				break;
			}
			case 16: // move
			{
				org.omg.CORBA.Container _arg0=org.omg.CORBA.ContainerHelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				_out = handler.createReply();
				move(_arg0,_arg1,_arg2);
				break;
			}
			case 17: // _get_result
			{
			_out = handler.createReply();
			_out.write_TypeCode(result());
				break;
			}
			case 18: // _set_contexts
			{
			_out = handler.createReply();
			contexts(org.omg.CORBA.ContextIdSeqHelper.read(_input));
				break;
			}
			case 19: // _set_mode
			{
			_out = handler.createReply();
			mode(org.omg.CORBA.OperationModeHelper.read(_input));
				break;
			}
			case 20: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
			case 21: // _get_exceptions
			{
			_out = handler.createReply();
			org.omg.CORBA.ExceptionDefSeqHelper.write(_out,exceptions());
				break;
			}
			case 22: // _set_exceptions
			{
			_out = handler.createReply();
			exceptions(org.omg.CORBA.ExceptionDefSeqHelper.read(_input));
				break;
			}
			case 23: // _set_id
			{
			_out = handler.createReply();
			id(_input.read_string());
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

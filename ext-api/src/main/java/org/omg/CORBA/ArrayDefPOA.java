package org.omg.CORBA;


/**
 * Generated from IDL interface "ArrayDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public abstract class ArrayDefPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CORBA.ArrayDefOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "_get_element_type", new java.lang.Integer(0));
		m_opsHash.put ( "_get_length", new java.lang.Integer(1));
		m_opsHash.put ( "_get_element_type_def", new java.lang.Integer(2));
		m_opsHash.put ( "_set_length", new java.lang.Integer(3));
		m_opsHash.put ( "_get_type", new java.lang.Integer(4));
		m_opsHash.put ( "destroy", new java.lang.Integer(5));
		m_opsHash.put ( "_get_def_kind", new java.lang.Integer(6));
		m_opsHash.put ( "_set_element_type_def", new java.lang.Integer(7));
	}
	private String[] ids = {"IDL:omg.org/CORBA/ArrayDef:1.0","IDL:omg.org/CORBA/IDLType:1.0","IDL:omg.org/CORBA/IRObject:1.0"};
	public org.omg.CORBA.ArrayDef _this()
	{
		return org.omg.CORBA.ArrayDefHelper.narrow(_this_object());
	}
	public org.omg.CORBA.ArrayDef _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CORBA.ArrayDefHelper.narrow(_this_object(orb));
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
			case 0: // _get_element_type
			{
			_out = handler.createReply();
			_out.write_TypeCode(element_type());
				break;
			}
			case 1: // _get_length
			{
			_out = handler.createReply();
			_out.write_ulong(length());
				break;
			}
			case 2: // _get_element_type_def
			{
			_out = handler.createReply();
			org.omg.CORBA.IDLTypeHelper.write(_out,element_type_def());
				break;
			}
			case 3: // _set_length
			{
			_out = handler.createReply();
			length(_input.read_ulong());
				break;
			}
			case 4: // _get_type
			{
			_out = handler.createReply();
			_out.write_TypeCode(type());
				break;
			}
			case 5: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
			case 6: // _get_def_kind
			{
			_out = handler.createReply();
			org.omg.CORBA.DefinitionKindHelper.write(_out,def_kind());
				break;
			}
			case 7: // _set_element_type_def
			{
			_out = handler.createReply();
			element_type_def(org.omg.CORBA.IDLTypeHelper.read(_input));
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

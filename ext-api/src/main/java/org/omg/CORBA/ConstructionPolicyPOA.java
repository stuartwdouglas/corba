package org.omg.CORBA;


/**
 * Generated from IDL interface "ConstructionPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public abstract class ConstructionPolicyPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CORBA.ConstructionPolicyOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "_get_policy_type", new java.lang.Integer(0));
		m_opsHash.put ( "copy", new java.lang.Integer(1));
		m_opsHash.put ( "make_domain_manager", new java.lang.Integer(2));
		m_opsHash.put ( "destroy", new java.lang.Integer(3));
	}
	private String[] ids = {"IDL:omg.org/CORBA/ConstructionPolicy:1.0","IDL:omg.org/CORBA/Policy:1.0"};
	public org.omg.CORBA.ConstructionPolicy _this()
	{
		return org.omg.CORBA.ConstructionPolicyHelper.narrow(_this_object());
	}
	public org.omg.CORBA.ConstructionPolicy _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CORBA.ConstructionPolicyHelper.narrow(_this_object(orb));
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
			case 0: // _get_policy_type
			{
			_out = handler.createReply();
			_out.write_ulong(policy_type());
				break;
			}
			case 1: // copy
			{
				_out = handler.createReply();
				org.omg.CORBA.PolicyHelper.write(_out,copy());
				break;
			}
			case 2: // make_domain_manager
			{
				org.omg.CORBA.InterfaceDef _arg0=org.omg.CORBA.InterfaceDefHelper.read(_input);
				boolean _arg1=_input.read_boolean();
				_out = handler.createReply();
				make_domain_manager(_arg0,_arg1);
				break;
			}
			case 3: // destroy
			{
				_out = handler.createReply();
				destroy();
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

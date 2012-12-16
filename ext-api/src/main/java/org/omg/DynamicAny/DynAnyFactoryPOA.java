package org.omg.DynamicAny;


/**
 * Generated from IDL interface "DynAnyFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public abstract class DynAnyFactoryPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.DynamicAny.DynAnyFactoryOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "create_dyn_any", new java.lang.Integer(0));
		m_opsHash.put ( "create_dyn_any_from_type_code", new java.lang.Integer(1));
	}
	private String[] ids = {"IDL:omg.org/DynamicAny/DynAnyFactory:1.0"};
	public org.omg.DynamicAny.DynAnyFactory _this()
	{
		return org.omg.DynamicAny.DynAnyFactoryHelper.narrow(_this_object());
	}
	public org.omg.DynamicAny.DynAnyFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.DynamicAny.DynAnyFactoryHelper.narrow(_this_object(orb));
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
			case 0: // create_dyn_any
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				org.omg.DynamicAny.DynAnyHelper.write(_out,create_dyn_any(_arg0));
			}
			catch(org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCodeHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // create_dyn_any_from_type_code
			{
			try
			{
				org.omg.CORBA.TypeCode _arg0=_input.read_TypeCode();
				_out = handler.createReply();
				org.omg.DynamicAny.DynAnyHelper.write(_out,create_dyn_any_from_type_code(_arg0));
			}
			catch(org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCodeHelper.write(_out, _ex0);
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

package org.omg.dds;


/**
 * Generated from IDL interface "Listener".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public abstract class ListenerPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.dds.ListenerOperations
{
	private String[] ids = {"IDL:omg.org/dds/Listener:1.0"};
	public org.omg.dds.Listener _this()
	{
		return org.omg.dds.ListenerHelper.narrow(_this_object());
	}
	public org.omg.dds.Listener _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.ListenerHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}

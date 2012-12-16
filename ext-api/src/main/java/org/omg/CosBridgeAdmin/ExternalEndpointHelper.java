package org.omg.CosBridgeAdmin;


/**
 * Generated from IDL struct "ExternalEndpoint".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public final class ExternalEndpointHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CosBridgeAdmin.ExternalEndpointHelper.id(),"ExternalEndpoint",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("role", org.omg.CosBridgeAdmin.ExternalEndpointRoleHelper.type(), null),new org.omg.CORBA.StructMember("connector", org.omg.CosBridgeAdmin.ExternalEndpointConnectorHelper.type(), null),new org.omg.CORBA.StructMember("style", org.omg.CosBridgeAdmin.FlowStyleHelper.type(), null),new org.omg.CORBA.StructMember("type", org.omg.CosBridgeAdmin.MessageTypeHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosBridgeAdmin.ExternalEndpoint s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosBridgeAdmin.ExternalEndpoint extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosBridgeAdmin/ExternalEndpoint:1.0";
	}
	public static org.omg.CosBridgeAdmin.ExternalEndpoint read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosBridgeAdmin.ExternalEndpoint result = new org.omg.CosBridgeAdmin.ExternalEndpoint();
		result.role=org.omg.CosBridgeAdmin.ExternalEndpointRoleHelper.read(in);
		result.connector=org.omg.CosBridgeAdmin.ExternalEndpointConnectorHelper.read(in);
		result.style=org.omg.CosBridgeAdmin.FlowStyleHelper.read(in);
		result.type=org.omg.CosBridgeAdmin.MessageTypeHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosBridgeAdmin.ExternalEndpoint s)
	{
		org.omg.CosBridgeAdmin.ExternalEndpointRoleHelper.write(out,s.role);
		org.omg.CosBridgeAdmin.ExternalEndpointConnectorHelper.write(out,s.connector);
		org.omg.CosBridgeAdmin.FlowStyleHelper.write(out,s.style);
		org.omg.CosBridgeAdmin.MessageTypeHelper.write(out,s.type);
	}
}

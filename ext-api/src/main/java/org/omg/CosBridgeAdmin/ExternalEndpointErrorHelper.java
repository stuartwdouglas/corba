package org.omg.CosBridgeAdmin;


/**
 * Generated from IDL struct "ExternalEndpointError".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class ExternalEndpointErrorHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CosBridgeAdmin.ExternalEndpointErrorHelper.id(),"ExternalEndpointError",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("role", org.omg.CosBridgeAdmin.ExternalEndpointRoleHelper.type(), null),new org.omg.CORBA.StructMember("code", org.omg.CosBridgeAdmin.ExternalEndpointErrorCodeHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosBridgeAdmin.ExternalEndpointError s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosBridgeAdmin.ExternalEndpointError extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosBridgeAdmin/ExternalEndpointError:1.0";
	}
	public static org.omg.CosBridgeAdmin.ExternalEndpointError read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosBridgeAdmin.ExternalEndpointError result = new org.omg.CosBridgeAdmin.ExternalEndpointError();
		result.role=org.omg.CosBridgeAdmin.ExternalEndpointRoleHelper.read(in);
		result.code=org.omg.CosBridgeAdmin.ExternalEndpointErrorCodeHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosBridgeAdmin.ExternalEndpointError s)
	{
		org.omg.CosBridgeAdmin.ExternalEndpointRoleHelper.write(out,s.role);
		org.omg.CosBridgeAdmin.ExternalEndpointErrorCodeHelper.write(out,s.code);
	}
}

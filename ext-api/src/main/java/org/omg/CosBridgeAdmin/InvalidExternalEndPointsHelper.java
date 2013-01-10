package org.omg.CosBridgeAdmin;


/**
 * Generated from IDL exception "InvalidExternalEndPoints".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class InvalidExternalEndPointsHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosBridgeAdmin.InvalidExternalEndPointsHelper.id(),"InvalidExternalEndPoints",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("error", org.omg.CosBridgeAdmin.ExternalEndpointErrorSeqHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosBridgeAdmin.InvalidExternalEndPoints s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosBridgeAdmin.InvalidExternalEndPoints extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosBridgeAdmin/InvalidExternalEndPoints:1.0";
	}
	public static org.omg.CosBridgeAdmin.InvalidExternalEndPoints read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		org.omg.CosBridgeAdmin.ExternalEndpointError[] x0;
		x0 = org.omg.CosBridgeAdmin.ExternalEndpointErrorSeqHelper.read(in);
		final org.omg.CosBridgeAdmin.InvalidExternalEndPoints result = new org.omg.CosBridgeAdmin.InvalidExternalEndPoints(id, x0);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosBridgeAdmin.InvalidExternalEndPoints s)
	{
		out.write_string(id());
		org.omg.CosBridgeAdmin.ExternalEndpointErrorSeqHelper.write(out,s.error);
	}
}

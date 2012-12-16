package org.omg.GIOP;


/**
 * Generated from IDL struct "Version".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class VersionHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.GIOP.VersionHelper.id(),"Version",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("major", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10)), null),new org.omg.CORBA.StructMember("minor", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.GIOP.Version s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.GIOP.Version extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/GIOP/Version:1.0";
	}
	public static org.omg.GIOP.Version read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.GIOP.Version result = new org.omg.GIOP.Version();
		result.major=in.read_octet();
		result.minor=in.read_octet();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.GIOP.Version s)
	{
		out.write_octet(s.major);
		out.write_octet(s.minor);
	}
}

package org.omg.Dynamic;


/**
 * Generated from IDL struct "Parameter".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class ParameterHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.Dynamic.ParameterHelper.id(),"Parameter",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("argument", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null),new org.omg.CORBA.StructMember("mode", org.omg.CORBA.ParameterModeHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.Dynamic.Parameter s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.Dynamic.Parameter extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/Dynamic/Parameter:1.0";
	}
	public static org.omg.Dynamic.Parameter read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.Dynamic.Parameter result = new org.omg.Dynamic.Parameter();
		result.argument=in.read_any();
		result.mode=org.omg.CORBA.ParameterModeHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.Dynamic.Parameter s)
	{
		out.write_any(s.argument);
		org.omg.CORBA.ParameterModeHelper.write(out,s.mode);
	}
}

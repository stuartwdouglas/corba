package org.omg.CORBA;


/**
 * Generated from IDL struct "ParameterDescription".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class ParameterDescriptionHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.ParameterDescriptionHelper.id(),"ParameterDescription",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.IdentifierHelper.type(), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().get_primitive_tc( org.omg.CORBA.TCKind.tk_TypeCode), null),new org.omg.CORBA.StructMember("type_def", org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/IDLType:1.0", "IDLType"), null),new org.omg.CORBA.StructMember("mode", org.omg.CORBA.ParameterModeHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.ParameterDescription s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.ParameterDescription extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/ParameterDescription:1.0";
	}
	public static org.omg.CORBA.ParameterDescription read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CORBA.ParameterDescription result = new org.omg.CORBA.ParameterDescription();
		result.name=in.read_string();
		result.type=in.read_TypeCode();
		result.type_def=org.omg.CORBA.IDLTypeHelper.read(in);
		result.mode=org.omg.CORBA.ParameterModeHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CORBA.ParameterDescription s)
	{
		out.write_string(s.name);
		out.write_TypeCode(s.type);
		org.omg.CORBA.IDLTypeHelper.write(out,s.type_def);
		org.omg.CORBA.ParameterModeHelper.write(out,s.mode);
	}
}

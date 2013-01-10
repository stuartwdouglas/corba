package org.omg.Security;


/**
 * Generated from IDL struct "MechandOptions".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class MechandOptionsHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.Security.MechandOptionsHelper.id(),"MechandOptions",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("mechanism_type", org.omg.Security.MechanismTypeHelper.type(), null),new org.omg.CORBA.StructMember("options_supported", org.omg.Security.AssociationOptionsHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.Security.MechandOptions s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.Security.MechandOptions extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/Security/MechandOptions:1.0";
	}
	public static org.omg.Security.MechandOptions read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.Security.MechandOptions result = new org.omg.Security.MechandOptions();
		result.mechanism_type=in.read_string();
		result.options_supported=in.read_ushort();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.Security.MechandOptions s)
	{
		out.write_string(s.mechanism_type);
		out.write_ushort(s.options_supported);
	}
}

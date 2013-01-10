package org.omg.Security;


/**
 * Generated from IDL struct "Right".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class RightHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.Security.RightHelper.id(),"Right",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("rights_family", org.omg.Security.ExtensibleFamilyHelper.type(), null),new org.omg.CORBA.StructMember("right", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.Security.Right s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.Security.Right extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/Security/Right:1.0";
	}
	public static org.omg.Security.Right read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.Security.Right result = new org.omg.Security.Right();
		result.rights_family=org.omg.Security.ExtensibleFamilyHelper.read(in);
		result.right=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.Security.Right s)
	{
		org.omg.Security.ExtensibleFamilyHelper.write(out,s.rights_family);
		out.write_string(s.right);
	}
}

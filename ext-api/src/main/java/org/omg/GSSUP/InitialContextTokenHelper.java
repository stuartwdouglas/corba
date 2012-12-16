package org.omg.GSSUP;


/**
 * Generated from IDL struct "InitialContextToken".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:41 PM
 */

public final class InitialContextTokenHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.GSSUP.InitialContextTokenHelper.id(),"InitialContextToken",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("username", org.omg.CSI.UTF8StringHelper.type(), null),new org.omg.CORBA.StructMember("password", org.omg.CSI.UTF8StringHelper.type(), null),new org.omg.CORBA.StructMember("target_name", org.omg.CSI.GSS_NT_ExportedNameHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.GSSUP.InitialContextToken s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.GSSUP.InitialContextToken extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/GSSUP/InitialContextToken:1.0";
	}
	public static org.omg.GSSUP.InitialContextToken read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.GSSUP.InitialContextToken result = new org.omg.GSSUP.InitialContextToken();
		result.username = org.omg.CSI.UTF8StringHelper.read(in);
		result.password = org.omg.CSI.UTF8StringHelper.read(in);
		result.target_name = org.omg.CSI.GSS_NT_ExportedNameHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.GSSUP.InitialContextToken s)
	{
		org.omg.CSI.UTF8StringHelper.write(out,s.username);
		org.omg.CSI.UTF8StringHelper.write(out,s.password);
		org.omg.CSI.GSS_NT_ExportedNameHelper.write(out,s.target_name);
	}
}

package org.omg.CORBA;


/**
 * Generated from IDL struct "Initializer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class InitializerHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.InitializerHelper.id(),"Initializer",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("members", org.omg.CORBA.StructMemberSeqHelper.type(), null),new org.omg.CORBA.StructMember("name", org.omg.CORBA.IdentifierHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.Initializer s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.Initializer extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/Initializer:1.0";
	}
	public static org.omg.CORBA.Initializer read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CORBA.Initializer result = new org.omg.CORBA.Initializer();
		result.members = org.omg.CORBA.StructMemberSeqHelper.read(in);
		result.name=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CORBA.Initializer s)
	{
		org.omg.CORBA.StructMemberSeqHelper.write(out,s.members);
		out.write_string(s.name);
	}
}
package org.omg.CONV_FRAME;


/**
 * Generated from IDL struct "CodeSetContext".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class CodeSetContextHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CONV_FRAME.CodeSetContextHelper.id(),"CodeSetContext",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("char_data", org.omg.CONV_FRAME.CodeSetIdHelper.type(), null),new org.omg.CORBA.StructMember("wchar_data", org.omg.CONV_FRAME.CodeSetIdHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CONV_FRAME.CodeSetContext s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CONV_FRAME.CodeSetContext extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CONV_FRAME/CodeSetContext:1.0";
	}
	public static org.omg.CONV_FRAME.CodeSetContext read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CONV_FRAME.CodeSetContext result = new org.omg.CONV_FRAME.CodeSetContext();
		result.char_data=in.read_ulong();
		result.wchar_data=in.read_ulong();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CONV_FRAME.CodeSetContext s)
	{
		out.write_ulong(s.char_data);
		out.write_ulong(s.wchar_data);
	}
}

package org.omg.GSSUP;


/**
 * Generated from IDL struct "ErrorToken".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:41 PM
 */

public final class ErrorTokenHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.GSSUP.ErrorTokenHelper.id(),"ErrorToken",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("error_code", org.omg.GSSUP.ErrorCodeHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.GSSUP.ErrorToken s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.GSSUP.ErrorToken extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/GSSUP/ErrorToken:1.0";
	}
	public static org.omg.GSSUP.ErrorToken read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.GSSUP.ErrorToken result = new org.omg.GSSUP.ErrorToken();
		result.error_code=in.read_ulong();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.GSSUP.ErrorToken s)
	{
		out.write_ulong(s.error_code);
	}
}

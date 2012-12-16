package org.omg.Security;
/**
 * Generated from IDL enum "RequiresSupports".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class RequiresSupportsHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.Security.RequiresSupportsHelper.id(),"RequiresSupports",new String[]{"SecRequires","SecSupports"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.Security.RequiresSupports s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.Security.RequiresSupports extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/Security/RequiresSupports:1.0";
	}
	public static RequiresSupports read (final org.omg.CORBA.portable.InputStream in)
	{
		return RequiresSupports.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final RequiresSupports s)
	{
		out.write_long(s.value());
	}
}

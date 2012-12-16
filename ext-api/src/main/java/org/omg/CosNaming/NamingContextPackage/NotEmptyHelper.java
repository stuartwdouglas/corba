package org.omg.CosNaming.NamingContextPackage;


/**
 * Generated from IDL exception "NotEmpty".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:39 PM
 */

public final class NotEmptyHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosNaming.NamingContextPackage.NotEmptyHelper.id(),"NotEmpty",new org.omg.CORBA.StructMember[0]);
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNaming.NamingContextPackage.NotEmpty s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNaming.NamingContextPackage.NotEmpty extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNaming/NamingContext/NotEmpty:1.0";
	}
	public static org.omg.CosNaming.NamingContextPackage.NotEmpty read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		final org.omg.CosNaming.NamingContextPackage.NotEmpty result = new org.omg.CosNaming.NamingContextPackage.NotEmpty(id);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNaming.NamingContextPackage.NotEmpty s)
	{
		out.write_string(id());
	}
}

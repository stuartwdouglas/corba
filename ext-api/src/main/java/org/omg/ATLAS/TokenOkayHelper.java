package org.omg.ATLAS;


/**
 * Generated from IDL exception "TokenOkay".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:41 PM
 */

public final class TokenOkayHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.ATLAS.TokenOkayHelper.id(),"TokenOkay",new org.omg.CORBA.StructMember[0]);
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.ATLAS.TokenOkay s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.ATLAS.TokenOkay extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/ATLAS/TokenOkay:1.0";
	}
	public static org.omg.ATLAS.TokenOkay read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		final org.omg.ATLAS.TokenOkay result = new org.omg.ATLAS.TokenOkay(id);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.ATLAS.TokenOkay s)
	{
		out.write_string(id());
	}
}

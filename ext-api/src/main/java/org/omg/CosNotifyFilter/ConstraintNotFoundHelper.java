package org.omg.CosNotifyFilter;


/**
 * Generated from IDL exception "ConstraintNotFound".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class ConstraintNotFoundHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosNotifyFilter.ConstraintNotFoundHelper.id(),"ConstraintNotFound",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("id", org.omg.CosNotifyFilter.ConstraintIDHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyFilter.ConstraintNotFound s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNotifyFilter.ConstraintNotFound extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyFilter/ConstraintNotFound:1.0";
	}
	public static org.omg.CosNotifyFilter.ConstraintNotFound read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		int x0;
		x0=in.read_long();
		final org.omg.CosNotifyFilter.ConstraintNotFound result = new org.omg.CosNotifyFilter.ConstraintNotFound(id, x0);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNotifyFilter.ConstraintNotFound s)
	{
		out.write_string(id());
		out.write_long(s.id);
	}
}

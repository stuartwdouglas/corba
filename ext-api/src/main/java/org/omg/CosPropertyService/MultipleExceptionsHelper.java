package org.omg.CosPropertyService;


/**
 * Generated from IDL exception "MultipleExceptions".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public final class MultipleExceptionsHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosPropertyService.MultipleExceptionsHelper.id(),"MultipleExceptions",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("exceptions", org.omg.CosPropertyService.PropertyExceptionsHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosPropertyService.MultipleExceptions s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosPropertyService.MultipleExceptions extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosPropertyService/MultipleExceptions:1.0";
	}
	public static org.omg.CosPropertyService.MultipleExceptions read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		org.omg.CosPropertyService.PropertyException[] x0;
		x0 = org.omg.CosPropertyService.PropertyExceptionsHelper.read(in);
		final org.omg.CosPropertyService.MultipleExceptions result = new org.omg.CosPropertyService.MultipleExceptions(id, x0);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosPropertyService.MultipleExceptions s)
	{
		out.write_string(id());
		org.omg.CosPropertyService.PropertyExceptionsHelper.write(out,s.exceptions);
	}
}

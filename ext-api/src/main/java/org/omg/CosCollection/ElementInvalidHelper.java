package org.omg.CosCollection;


/**
 * Generated from IDL exception "ElementInvalid".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class ElementInvalidHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosCollection.ElementInvalidHelper.id(),"ElementInvalid",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("why", org.omg.CosCollection.ElementInvalidReasonHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosCollection.ElementInvalid s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosCollection.ElementInvalid extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosCollection/ElementInvalid:1.0";
	}
	public static org.omg.CosCollection.ElementInvalid read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		org.omg.CosCollection.ElementInvalidReason x0;
		x0=org.omg.CosCollection.ElementInvalidReasonHelper.read(in);
		final org.omg.CosCollection.ElementInvalid result = new org.omg.CosCollection.ElementInvalid(id, x0);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosCollection.ElementInvalid s)
	{
		out.write_string(id());
		org.omg.CosCollection.ElementInvalidReasonHelper.write(out,s.why);
	}
}

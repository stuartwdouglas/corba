package org.omg.CosCollection;


/**
 * Generated from IDL exception "IteratorInvalid".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class IteratorInvalidHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosCollection.IteratorInvalidHelper.id(),"IteratorInvalid",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("why", org.omg.CosCollection.IteratorInvalidReasonHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosCollection.IteratorInvalid s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosCollection.IteratorInvalid extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosCollection/IteratorInvalid:1.0";
	}
	public static org.omg.CosCollection.IteratorInvalid read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		org.omg.CosCollection.IteratorInvalidReason x0;
		x0=org.omg.CosCollection.IteratorInvalidReasonHelper.read(in);
		final org.omg.CosCollection.IteratorInvalid result = new org.omg.CosCollection.IteratorInvalid(id, x0);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosCollection.IteratorInvalid s)
	{
		out.write_string(id());
		org.omg.CosCollection.IteratorInvalidReasonHelper.write(out,s.why);
	}
}

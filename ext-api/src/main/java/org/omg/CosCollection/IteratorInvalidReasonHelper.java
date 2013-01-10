package org.omg.CosCollection;
/**
 * Generated from IDL enum "IteratorInvalidReason".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class IteratorInvalidReasonHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CosCollection.IteratorInvalidReasonHelper.id(),"IteratorInvalidReason",new String[]{"is_invalid","is_not_for_collection","is_const"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosCollection.IteratorInvalidReason s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosCollection.IteratorInvalidReason extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosCollection/IteratorInvalidReason:1.0";
	}
	public static IteratorInvalidReason read (final org.omg.CORBA.portable.InputStream in)
	{
		return IteratorInvalidReason.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final IteratorInvalidReason s)
	{
		out.write_long(s.value());
	}
}

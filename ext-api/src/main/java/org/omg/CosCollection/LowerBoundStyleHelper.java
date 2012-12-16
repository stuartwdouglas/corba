package org.omg.CosCollection;
/**
 * Generated from IDL enum "LowerBoundStyle".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class LowerBoundStyleHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CosCollection.LowerBoundStyleHelper.id(),"LowerBoundStyle",new String[]{"equal_lo","greater","greater_or_equal"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosCollection.LowerBoundStyle s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosCollection.LowerBoundStyle extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosCollection/LowerBoundStyle:1.0";
	}
	public static LowerBoundStyle read (final org.omg.CORBA.portable.InputStream in)
	{
		return LowerBoundStyle.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final LowerBoundStyle s)
	{
		out.write_long(s.value());
	}
}

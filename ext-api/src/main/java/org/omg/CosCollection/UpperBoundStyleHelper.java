package org.omg.CosCollection;
/**
 * Generated from IDL enum "UpperBoundStyle".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class UpperBoundStyleHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CosCollection.UpperBoundStyleHelper.id(),"UpperBoundStyle",new String[]{"equal_up","less","less_or_equal"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosCollection.UpperBoundStyle s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosCollection.UpperBoundStyle extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosCollection/UpperBoundStyle:1.0";
	}
	public static UpperBoundStyle read (final org.omg.CORBA.portable.InputStream in)
	{
		return UpperBoundStyle.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final UpperBoundStyle s)
	{
		out.write_long(s.value());
	}
}

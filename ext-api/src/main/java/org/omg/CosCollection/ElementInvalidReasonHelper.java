package org.omg.CosCollection;
/**
 * Generated from IDL enum "ElementInvalidReason".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class ElementInvalidReasonHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CosCollection.ElementInvalidReasonHelper.id(),"ElementInvalidReason",new String[]{"element_type_invalid","positioning_property_invalid","element_exists"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosCollection.ElementInvalidReason s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosCollection.ElementInvalidReason extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosCollection/ElementInvalidReason:1.0";
	}
	public static ElementInvalidReason read (final org.omg.CORBA.portable.InputStream in)
	{
		return ElementInvalidReason.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ElementInvalidReason s)
	{
		out.write_long(s.value());
	}
}

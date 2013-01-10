package org.omg.CosCollection;


/**
 * Generated from IDL struct "NVPair".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class NVPairHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CosCollection.NVPairHelper.id(),"NVPair",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CosCollection.IstringHelper.type(), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosCollection.NVPair s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosCollection.NVPair extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosCollection/NVPair:1.0";
	}
	public static org.omg.CosCollection.NVPair read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosCollection.NVPair result = new org.omg.CosCollection.NVPair();
		result.name=in.read_string();
		result.value=in.read_any();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosCollection.NVPair s)
	{
		out.write_string(s.name);
		out.write_any(s.value);
	}
}

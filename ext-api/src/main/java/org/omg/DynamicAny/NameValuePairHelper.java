package org.omg.DynamicAny;


/**
 * Generated from IDL struct "NameValuePair".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public final class NameValuePairHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.DynamicAny.NameValuePairHelper.id(),"NameValuePair",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("id", org.omg.DynamicAny.FieldNameHelper.type(), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.DynamicAny.NameValuePair s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.DynamicAny.NameValuePair extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/DynamicAny/NameValuePair:1.0";
	}
	public static org.omg.DynamicAny.NameValuePair read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.DynamicAny.NameValuePair result = new org.omg.DynamicAny.NameValuePair();
		result.id=in.read_string();
		result.value=in.read_any();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.DynamicAny.NameValuePair s)
	{
		out.write_string(s.id);
		out.write_any(s.value);
	}
}

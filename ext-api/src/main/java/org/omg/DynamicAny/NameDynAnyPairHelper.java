package org.omg.DynamicAny;


/**
 * Generated from IDL struct "NameDynAnyPair".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public final class NameDynAnyPairHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.DynamicAny.NameDynAnyPairHelper.id(),"NameDynAnyPair",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("id", org.omg.DynamicAny.FieldNameHelper.type(), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/DynamicAny/DynAny:1.0", "DynAny"), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.DynamicAny.NameDynAnyPair s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.DynamicAny.NameDynAnyPair extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/DynamicAny/NameDynAnyPair:1.0";
	}
	public static org.omg.DynamicAny.NameDynAnyPair read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.DynamicAny.NameDynAnyPair result = new org.omg.DynamicAny.NameDynAnyPair();
		result.id=in.read_string();
		result.value=org.omg.DynamicAny.DynAnyHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.DynamicAny.NameDynAnyPair s)
	{
		out.write_string(s.id);
		org.omg.DynamicAny.DynAnyHelper.write(out,s.value);
	}
}

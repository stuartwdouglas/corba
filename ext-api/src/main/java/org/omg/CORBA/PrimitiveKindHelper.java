package org.omg.CORBA;
/**
 * Generated from IDL enum "PrimitiveKind".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class PrimitiveKindHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CORBA.PrimitiveKindHelper.id(),"PrimitiveKind",new String[]{"pk_null","pk_void","pk_short","pk_long","pk_ushort","pk_ulong","pk_float","pk_double","pk_boolean","pk_char","pk_octet","pk_any","pk_TypeCode","pk_Principal","pk_string","pk_objref","pk_longlong","pk_ulonglong","pk_longdouble","pk_wchar","pk_wstring","pk_value_base"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.PrimitiveKind s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.PrimitiveKind extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/PrimitiveKind:1.0";
	}
	public static PrimitiveKind read (final org.omg.CORBA.portable.InputStream in)
	{
		return PrimitiveKind.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final PrimitiveKind s)
	{
		out.write_long(s.value());
	}
}

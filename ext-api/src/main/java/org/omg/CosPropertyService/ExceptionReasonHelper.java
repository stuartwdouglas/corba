package org.omg.CosPropertyService;
/**
 * Generated from IDL enum "ExceptionReason".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public final class ExceptionReasonHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CosPropertyService.ExceptionReasonHelper.id(),"ExceptionReason",new String[]{"invalid_property_name","conflicting_property","property_not_found","unsupported_type_code","unsupported_property","unsupported_mode","fixed_property","read_only_property"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosPropertyService.ExceptionReason s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosPropertyService.ExceptionReason extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosPropertyService/ExceptionReason:1.0";
	}
	public static ExceptionReason read (final org.omg.CORBA.portable.InputStream in)
	{
		return ExceptionReason.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ExceptionReason s)
	{
		out.write_long(s.value());
	}
}

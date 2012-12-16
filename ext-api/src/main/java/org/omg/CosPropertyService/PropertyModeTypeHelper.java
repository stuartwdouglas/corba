package org.omg.CosPropertyService;
/**
 * Generated from IDL enum "PropertyModeType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public final class PropertyModeTypeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CosPropertyService.PropertyModeTypeHelper.id(),"PropertyModeType",new String[]{"normal","read_only","fixed_normal","fixed_readonly","undefined"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosPropertyService.PropertyModeType s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosPropertyService.PropertyModeType extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosPropertyService/PropertyModeType:1.0";
	}
	public static PropertyModeType read (final org.omg.CORBA.portable.InputStream in)
	{
		return PropertyModeType.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final PropertyModeType s)
	{
		out.write_long(s.value());
	}
}

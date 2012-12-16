package org.omg.CosPropertyService;


/**
 * Generated from IDL struct "PropertyDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public final class PropertyDefHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CosPropertyService.PropertyDefHelper.id(),"PropertyDef",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("property_name", org.omg.CosPropertyService.PropertyNameHelper.type(), null),new org.omg.CORBA.StructMember("property_value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null),new org.omg.CORBA.StructMember("property_mode", org.omg.CosPropertyService.PropertyModeTypeHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosPropertyService.PropertyDef s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosPropertyService.PropertyDef extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosPropertyService/PropertyDef:1.0";
	}
	public static org.omg.CosPropertyService.PropertyDef read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosPropertyService.PropertyDef result = new org.omg.CosPropertyService.PropertyDef();
		result.property_name=in.read_string();
		result.property_value=in.read_any();
		result.property_mode=org.omg.CosPropertyService.PropertyModeTypeHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosPropertyService.PropertyDef s)
	{
		out.write_string(s.property_name);
		out.write_any(s.property_value);
		org.omg.CosPropertyService.PropertyModeTypeHelper.write(out,s.property_mode);
	}
}

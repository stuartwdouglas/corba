package org.omg.CosPropertyService;


/**
 * Generated from IDL struct "PropertyMode".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public final class PropertyModeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CosPropertyService.PropertyModeHelper.id(),"PropertyMode",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("property_name", org.omg.CosPropertyService.PropertyNameHelper.type(), null),new org.omg.CORBA.StructMember("property_mode", org.omg.CosPropertyService.PropertyModeTypeHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosPropertyService.PropertyMode s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosPropertyService.PropertyMode extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosPropertyService/PropertyMode:1.0";
	}
	public static org.omg.CosPropertyService.PropertyMode read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosPropertyService.PropertyMode result = new org.omg.CosPropertyService.PropertyMode();
		result.property_name=in.read_string();
		result.property_mode=org.omg.CosPropertyService.PropertyModeTypeHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosPropertyService.PropertyMode s)
	{
		out.write_string(s.property_name);
		org.omg.CosPropertyService.PropertyModeTypeHelper.write(out,s.property_mode);
	}
}

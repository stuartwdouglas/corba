package org.omg.CosPropertyService;


/**
 * Generated from IDL struct "PropertyException".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public final class PropertyExceptionHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CosPropertyService.PropertyExceptionHelper.id(),"PropertyException",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("reason", org.omg.CosPropertyService.ExceptionReasonHelper.type(), null),new org.omg.CORBA.StructMember("failing_property_name", org.omg.CosPropertyService.PropertyNameHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosPropertyService.PropertyException s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosPropertyService.PropertyException extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosPropertyService/PropertyException:1.0";
	}
	public static org.omg.CosPropertyService.PropertyException read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosPropertyService.PropertyException result = new org.omg.CosPropertyService.PropertyException();
		result.reason=org.omg.CosPropertyService.ExceptionReasonHelper.read(in);
		result.failing_property_name=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosPropertyService.PropertyException s)
	{
		org.omg.CosPropertyService.ExceptionReasonHelper.write(out,s.reason);
		out.write_string(s.failing_property_name);
	}
}

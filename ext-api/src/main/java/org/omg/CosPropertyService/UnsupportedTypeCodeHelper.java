package org.omg.CosPropertyService;


/**
 * Generated from IDL exception "UnsupportedTypeCode".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public final class UnsupportedTypeCodeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosPropertyService.UnsupportedTypeCodeHelper.id(),"UnsupportedTypeCode",new org.omg.CORBA.StructMember[0]);
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosPropertyService.UnsupportedTypeCode s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosPropertyService.UnsupportedTypeCode extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosPropertyService/UnsupportedTypeCode:1.0";
	}
	public static org.omg.CosPropertyService.UnsupportedTypeCode read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		final org.omg.CosPropertyService.UnsupportedTypeCode result = new org.omg.CosPropertyService.UnsupportedTypeCode(id);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosPropertyService.UnsupportedTypeCode s)
	{
		out.write_string(id());
	}
}

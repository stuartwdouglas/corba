package org.omg.GIOP;


/**
 * Generated from IDL struct "IORAddressingInfo".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class IORAddressingInfoHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.GIOP.IORAddressingInfoHelper.id(),"IORAddressingInfo",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("selected_profile_index", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("ior", org.omg.IOP.IORHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.GIOP.IORAddressingInfo s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.GIOP.IORAddressingInfo extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/GIOP/IORAddressingInfo:1.0";
	}
	public static org.omg.GIOP.IORAddressingInfo read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.GIOP.IORAddressingInfo result = new org.omg.GIOP.IORAddressingInfo();
		result.selected_profile_index=in.read_ulong();
		result.ior=org.omg.IOP.IORHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.GIOP.IORAddressingInfo s)
	{
		out.write_ulong(s.selected_profile_index);
		org.omg.IOP.IORHelper.write(out,s.ior);
	}
}

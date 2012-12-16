package org.omg.GIOP;


/**
 * Generated from IDL struct "LocateRequestHeader_1_2".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class LocateRequestHeader_1_2Helper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.GIOP.LocateRequestHeader_1_2Helper.id(),"LocateRequestHeader_1_2",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("request_id", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("target", org.omg.GIOP.TargetAddressHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.GIOP.LocateRequestHeader_1_2 s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.GIOP.LocateRequestHeader_1_2 extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/GIOP/LocateRequestHeader_1_2:1.0";
	}
	public static org.omg.GIOP.LocateRequestHeader_1_2 read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.GIOP.LocateRequestHeader_1_2 result = new org.omg.GIOP.LocateRequestHeader_1_2();
		result.request_id=in.read_ulong();
		result.target=org.omg.GIOP.TargetAddressHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.GIOP.LocateRequestHeader_1_2 s)
	{
		out.write_ulong(s.request_id);
		org.omg.GIOP.TargetAddressHelper.write(out,s.target);
	}
}

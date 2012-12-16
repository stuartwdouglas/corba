package org.omg.CosBridgeAdmin;
/**
 * Generated from IDL enum "FlowStyle".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public final class FlowStyleHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CosBridgeAdmin.FlowStyleHelper.id(),"FlowStyle",new String[]{"PUSH","PULL"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosBridgeAdmin.FlowStyle s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosBridgeAdmin.FlowStyle extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosBridgeAdmin/FlowStyle:1.0";
	}
	public static FlowStyle read (final org.omg.CORBA.portable.InputStream in)
	{
		return FlowStyle.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final FlowStyle s)
	{
		out.write_long(s.value());
	}
}

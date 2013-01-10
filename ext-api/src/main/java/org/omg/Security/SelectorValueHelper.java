package org.omg.Security;


/**
 * Generated from IDL struct "SelectorValue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class SelectorValueHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.Security.SelectorValueHelper.id(),"SelectorValue",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("selector", org.omg.Security.SelectorTypeHelper.type(), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.Security.SelectorValue s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.Security.SelectorValue extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/Security/SelectorValue:1.0";
	}
	public static org.omg.Security.SelectorValue read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.Security.SelectorValue result = new org.omg.Security.SelectorValue();
		result.selector=in.read_ulong();
		result.value=in.read_any();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.Security.SelectorValue s)
	{
		out.write_ulong(s.selector);
		out.write_any(s.value);
	}
}

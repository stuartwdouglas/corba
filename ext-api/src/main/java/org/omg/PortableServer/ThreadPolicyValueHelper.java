package org.omg.PortableServer;
/**
 * Generated from IDL enum "ThreadPolicyValue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class ThreadPolicyValueHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.PortableServer.ThreadPolicyValueHelper.id(),"ThreadPolicyValue",new String[]{"ORB_CTRL_MODEL","SINGLE_THREAD_MODEL","MAIN_THREAD_MODEL"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.PortableServer.ThreadPolicyValue s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.PortableServer.ThreadPolicyValue extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/PortableServer/ThreadPolicyValue:1.0";
	}
	public static ThreadPolicyValue read (final org.omg.CORBA.portable.InputStream in)
	{
		return ThreadPolicyValue.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ThreadPolicyValue s)
	{
		out.write_long(s.value());
	}
}

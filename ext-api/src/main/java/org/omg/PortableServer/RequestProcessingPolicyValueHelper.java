package org.omg.PortableServer;
/**
 * Generated from IDL enum "RequestProcessingPolicyValue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class RequestProcessingPolicyValueHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.PortableServer.RequestProcessingPolicyValueHelper.id(),"RequestProcessingPolicyValue",new String[]{"USE_ACTIVE_OBJECT_MAP_ONLY","USE_DEFAULT_SERVANT","USE_SERVANT_MANAGER"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.PortableServer.RequestProcessingPolicyValue s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.PortableServer.RequestProcessingPolicyValue extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/PortableServer/RequestProcessingPolicyValue:1.0";
	}
	public static RequestProcessingPolicyValue read (final org.omg.CORBA.portable.InputStream in)
	{
		return RequestProcessingPolicyValue.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final RequestProcessingPolicyValue s)
	{
		out.write_long(s.value());
	}
}

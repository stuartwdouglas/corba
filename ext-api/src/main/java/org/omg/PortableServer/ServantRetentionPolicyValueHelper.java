package org.omg.PortableServer;
/**
 * Generated from IDL enum "ServantRetentionPolicyValue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class ServantRetentionPolicyValueHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.PortableServer.ServantRetentionPolicyValueHelper.id(),"ServantRetentionPolicyValue",new String[]{"RETAIN","NON_RETAIN"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.PortableServer.ServantRetentionPolicyValue s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.PortableServer.ServantRetentionPolicyValue extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/PortableServer/ServantRetentionPolicyValue:1.0";
	}
	public static ServantRetentionPolicyValue read (final org.omg.CORBA.portable.InputStream in)
	{
		return ServantRetentionPolicyValue.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ServantRetentionPolicyValue s)
	{
		out.write_long(s.value());
	}
}

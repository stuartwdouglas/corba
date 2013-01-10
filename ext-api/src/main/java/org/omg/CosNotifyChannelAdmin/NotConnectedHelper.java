package org.omg.CosNotifyChannelAdmin;


/**
 * Generated from IDL exception "NotConnected".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class NotConnectedHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosNotifyChannelAdmin.NotConnectedHelper.id(),"NotConnected",new org.omg.CORBA.StructMember[0]);
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyChannelAdmin.NotConnected s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNotifyChannelAdmin.NotConnected extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/NotConnected:1.0";
	}
	public static org.omg.CosNotifyChannelAdmin.NotConnected read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		final org.omg.CosNotifyChannelAdmin.NotConnected result = new org.omg.CosNotifyChannelAdmin.NotConnected(id);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNotifyChannelAdmin.NotConnected s)
	{
		out.write_string(id());
	}
}

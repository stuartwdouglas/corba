package org.omg.CosNotification;


/**
 * Generated from IDL exception "UnsupportedQoS".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class UnsupportedQoSHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosNotification.UnsupportedQoSHelper.id(),"UnsupportedQoS",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("qos_err", org.omg.CosNotification.PropertyErrorSeqHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotification.UnsupportedQoS s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNotification.UnsupportedQoS extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotification/UnsupportedQoS:1.0";
	}
	public static org.omg.CosNotification.UnsupportedQoS read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		org.omg.CosNotification.PropertyError[] x0;
		x0 = org.omg.CosNotification.PropertyErrorSeqHelper.read(in);
		final org.omg.CosNotification.UnsupportedQoS result = new org.omg.CosNotification.UnsupportedQoS(id, x0);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNotification.UnsupportedQoS s)
	{
		out.write_string(id());
		org.omg.CosNotification.PropertyErrorSeqHelper.write(out,s.qos_err);
	}
}

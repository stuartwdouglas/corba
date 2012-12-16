package org.omg.CosNotifyChannelAdmin;


/**
 * Generated from IDL exception "AdminLimitExceeded".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class AdminLimitExceededHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosNotifyChannelAdmin.AdminLimitExceededHelper.id(),"AdminLimitExceeded",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("admin_property_err", org.omg.CosNotifyChannelAdmin.AdminLimitHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyChannelAdmin.AdminLimitExceeded s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNotifyChannelAdmin.AdminLimitExceeded extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/AdminLimitExceeded:1.0";
	}
	public static org.omg.CosNotifyChannelAdmin.AdminLimitExceeded read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		org.omg.CosNotifyChannelAdmin.AdminLimit x0;
		x0=org.omg.CosNotifyChannelAdmin.AdminLimitHelper.read(in);
		final org.omg.CosNotifyChannelAdmin.AdminLimitExceeded result = new org.omg.CosNotifyChannelAdmin.AdminLimitExceeded(id, x0);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNotifyChannelAdmin.AdminLimitExceeded s)
	{
		out.write_string(id());
		org.omg.CosNotifyChannelAdmin.AdminLimitHelper.write(out,s.admin_property_err);
	}
}

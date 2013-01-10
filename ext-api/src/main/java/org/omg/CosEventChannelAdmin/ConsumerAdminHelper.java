package org.omg.CosEventChannelAdmin;


/**
 * Generated from IDL interface "ConsumerAdmin".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class ConsumerAdminHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosEventChannelAdmin.ConsumerAdmin s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosEventChannelAdmin.ConsumerAdmin extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosEventChannelAdmin/ConsumerAdmin:1.0", "ConsumerAdmin");
	}
	public static String id()
	{
		return "IDL:omg.org/CosEventChannelAdmin/ConsumerAdmin:1.0";
	}
	public static ConsumerAdmin read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosEventChannelAdmin._ConsumerAdminStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosEventChannelAdmin.ConsumerAdmin s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosEventChannelAdmin.ConsumerAdmin narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosEventChannelAdmin.ConsumerAdmin)
		{
			return (org.omg.CosEventChannelAdmin.ConsumerAdmin)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosEventChannelAdmin/ConsumerAdmin:1.0"))
		{
			org.omg.CosEventChannelAdmin._ConsumerAdminStub stub;
			stub = new org.omg.CosEventChannelAdmin._ConsumerAdminStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosEventChannelAdmin.ConsumerAdmin unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosEventChannelAdmin.ConsumerAdmin)
		{
			return (org.omg.CosEventChannelAdmin.ConsumerAdmin)obj;
		}
		else
		{
			org.omg.CosEventChannelAdmin._ConsumerAdminStub stub;
			stub = new org.omg.CosEventChannelAdmin._ConsumerAdminStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

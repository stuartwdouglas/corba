package org.omg.CosTypedEventChannelAdmin;


/**
 * Generated from IDL interface "TypedConsumerAdmin".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class TypedConsumerAdminHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTypedEventChannelAdmin.TypedConsumerAdmin s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosTypedEventChannelAdmin.TypedConsumerAdmin extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosTypedEventChannelAdmin/TypedConsumerAdmin:1.0", "TypedConsumerAdmin");
	}
	public static String id()
	{
		return "IDL:omg.org/CosTypedEventChannelAdmin/TypedConsumerAdmin:1.0";
	}
	public static TypedConsumerAdmin read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosTypedEventChannelAdmin._TypedConsumerAdminStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosTypedEventChannelAdmin.TypedConsumerAdmin s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosTypedEventChannelAdmin.TypedConsumerAdmin narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTypedEventChannelAdmin.TypedConsumerAdmin)
		{
			return (org.omg.CosTypedEventChannelAdmin.TypedConsumerAdmin)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosTypedEventChannelAdmin/TypedConsumerAdmin:1.0"))
		{
			org.omg.CosTypedEventChannelAdmin._TypedConsumerAdminStub stub;
			stub = new org.omg.CosTypedEventChannelAdmin._TypedConsumerAdminStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosTypedEventChannelAdmin.TypedConsumerAdmin unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTypedEventChannelAdmin.TypedConsumerAdmin)
		{
			return (org.omg.CosTypedEventChannelAdmin.TypedConsumerAdmin)obj;
		}
		else
		{
			org.omg.CosTypedEventChannelAdmin._TypedConsumerAdminStub stub;
			stub = new org.omg.CosTypedEventChannelAdmin._TypedConsumerAdminStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

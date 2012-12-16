package org.omg.CosTypedNotifyChannelAdmin;


/**
 * Generated from IDL interface "TypedEventChannelFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:53 PM
 */

public final class TypedEventChannelFactoryHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTypedNotifyChannelAdmin.TypedEventChannelFactory s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosTypedNotifyChannelAdmin.TypedEventChannelFactory extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosTypedNotifyChannelAdmin/TypedEventChannelFactory:1.0", "TypedEventChannelFactory");
	}
	public static String id()
	{
		return "IDL:omg.org/CosTypedNotifyChannelAdmin/TypedEventChannelFactory:1.0";
	}
	public static TypedEventChannelFactory read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosTypedNotifyChannelAdmin._TypedEventChannelFactoryStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosTypedNotifyChannelAdmin.TypedEventChannelFactory s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosTypedNotifyChannelAdmin.TypedEventChannelFactory narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTypedNotifyChannelAdmin.TypedEventChannelFactory)
		{
			return (org.omg.CosTypedNotifyChannelAdmin.TypedEventChannelFactory)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosTypedNotifyChannelAdmin/TypedEventChannelFactory:1.0"))
		{
			org.omg.CosTypedNotifyChannelAdmin._TypedEventChannelFactoryStub stub;
			stub = new org.omg.CosTypedNotifyChannelAdmin._TypedEventChannelFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosTypedNotifyChannelAdmin.TypedEventChannelFactory unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTypedNotifyChannelAdmin.TypedEventChannelFactory)
		{
			return (org.omg.CosTypedNotifyChannelAdmin.TypedEventChannelFactory)obj;
		}
		else
		{
			org.omg.CosTypedNotifyChannelAdmin._TypedEventChannelFactoryStub stub;
			stub = new org.omg.CosTypedNotifyChannelAdmin._TypedEventChannelFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

package org.omg.CosNotifyChannelAdmin;


/**
 * Generated from IDL interface "EventChannelFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class EventChannelFactoryHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyChannelAdmin.EventChannelFactory s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosNotifyChannelAdmin.EventChannelFactory extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyChannelAdmin/EventChannelFactory:1.0", "EventChannelFactory");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/EventChannelFactory:1.0";
	}
	public static EventChannelFactory read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosNotifyChannelAdmin._EventChannelFactoryStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNotifyChannelAdmin.EventChannelFactory s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNotifyChannelAdmin.EventChannelFactory narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyChannelAdmin.EventChannelFactory)
		{
			return (org.omg.CosNotifyChannelAdmin.EventChannelFactory)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosNotifyChannelAdmin/EventChannelFactory:1.0"))
		{
			org.omg.CosNotifyChannelAdmin._EventChannelFactoryStub stub;
			stub = new org.omg.CosNotifyChannelAdmin._EventChannelFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosNotifyChannelAdmin.EventChannelFactory unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyChannelAdmin.EventChannelFactory)
		{
			return (org.omg.CosNotifyChannelAdmin.EventChannelFactory)obj;
		}
		else
		{
			org.omg.CosNotifyChannelAdmin._EventChannelFactoryStub stub;
			stub = new org.omg.CosNotifyChannelAdmin._EventChannelFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

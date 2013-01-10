package org.omg.CosNotifyFilter;


/**
 * Generated from IDL interface "FilterFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class FilterFactoryHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyFilter.FilterFactory s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosNotifyFilter.FilterFactory extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyFilter/FilterFactory:1.0", "FilterFactory");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyFilter/FilterFactory:1.0";
	}
	public static FilterFactory read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosNotifyFilter._FilterFactoryStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNotifyFilter.FilterFactory s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNotifyFilter.FilterFactory narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyFilter.FilterFactory)
		{
			return (org.omg.CosNotifyFilter.FilterFactory)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosNotifyFilter/FilterFactory:1.0"))
		{
			org.omg.CosNotifyFilter._FilterFactoryStub stub;
			stub = new org.omg.CosNotifyFilter._FilterFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosNotifyFilter.FilterFactory unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyFilter.FilterFactory)
		{
			return (org.omg.CosNotifyFilter.FilterFactory)obj;
		}
		else
		{
			org.omg.CosNotifyFilter._FilterFactoryStub stub;
			stub = new org.omg.CosNotifyFilter._FilterFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

package org.omg.dds;


/**
 * Generated from IDL interface "WaitSet".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class WaitSetHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.WaitSet s)
	{
			any.insert_Object(s);
	}
	public static org.omg.dds.WaitSet extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/dds/WaitSet:1.0", "WaitSet");
	}
	public static String id()
	{
		return "IDL:omg.org/dds/WaitSet:1.0";
	}
	public static WaitSet read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.dds._WaitSetStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.dds.WaitSet s)
	{
		_out.write_Object(s);
	}
	public static org.omg.dds.WaitSet narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.dds.WaitSet)
		{
			return (org.omg.dds.WaitSet)obj;
		}
		else if (obj._is_a("IDL:omg.org/dds/WaitSet:1.0"))
		{
			org.omg.dds._WaitSetStub stub;
			stub = new org.omg.dds._WaitSetStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.dds.WaitSet unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.dds.WaitSet)
		{
			return (org.omg.dds.WaitSet)obj;
		}
		else
		{
			org.omg.dds._WaitSetStub stub;
			stub = new org.omg.dds._WaitSetStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

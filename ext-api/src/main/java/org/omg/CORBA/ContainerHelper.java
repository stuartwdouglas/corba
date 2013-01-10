package org.omg.CORBA;


/**
 * Generated from IDL interface "Container".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class ContainerHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.Container s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CORBA.Container extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/Container:1.0", "Container");
	}
	public static String id()
	{
		return "IDL:omg.org/CORBA/Container:1.0";
	}
	public static Container read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CORBA._ContainerStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CORBA.Container s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CORBA.Container narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.Container)
		{
			return (org.omg.CORBA.Container)obj;
		}
		else if (obj._is_a("IDL:omg.org/CORBA/Container:1.0"))
		{
			org.omg.CORBA._ContainerStub stub;
			stub = new org.omg.CORBA._ContainerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CORBA.Container unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.Container)
		{
			return (org.omg.CORBA.Container)obj;
		}
		else
		{
			org.omg.CORBA._ContainerStub stub;
			stub = new org.omg.CORBA._ContainerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

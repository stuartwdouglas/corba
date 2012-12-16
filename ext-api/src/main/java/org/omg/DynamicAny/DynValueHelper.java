package org.omg.DynamicAny;


/**
 * Generated from IDL interface "DynValue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public final class DynValueHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.DynamicAny.DynValue s)
	{
			any.insert_Object(s);
	}
	public static org.omg.DynamicAny.DynValue extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/DynamicAny/DynValue:1.0", "DynValue");
	}
	public static String id()
	{
		return "IDL:omg.org/DynamicAny/DynValue:1.0";
	}
	public static DynValue read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.DynamicAny._DynValueStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.DynamicAny.DynValue s)
	{
		_out.write_Object(s);
	}
	public static org.omg.DynamicAny.DynValue narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.DynamicAny.DynValue)
		{
			return (org.omg.DynamicAny.DynValue)obj;
		}
		else if (obj._is_a("IDL:omg.org/DynamicAny/DynValue:1.0"))
		{
			org.omg.DynamicAny._DynValueStub stub;
			stub = new org.omg.DynamicAny._DynValueStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.DynamicAny.DynValue unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.DynamicAny.DynValue)
		{
			return (org.omg.DynamicAny.DynValue)obj;
		}
		else
		{
			org.omg.DynamicAny._DynValueStub stub;
			stub = new org.omg.DynamicAny._DynValueStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

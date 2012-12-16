package org.omg.DynamicAny;


/**
 * Generated from IDL interface "DynArray".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public final class DynArrayHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.DynamicAny.DynArray s)
	{
			any.insert_Object(s);
	}
	public static org.omg.DynamicAny.DynArray extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/DynamicAny/DynArray:1.0", "DynArray");
	}
	public static String id()
	{
		return "IDL:omg.org/DynamicAny/DynArray:1.0";
	}
	public static DynArray read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.DynamicAny._DynArrayStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.DynamicAny.DynArray s)
	{
		_out.write_Object(s);
	}
	public static org.omg.DynamicAny.DynArray narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.DynamicAny.DynArray)
		{
			return (org.omg.DynamicAny.DynArray)obj;
		}
		else if (obj._is_a("IDL:omg.org/DynamicAny/DynArray:1.0"))
		{
			org.omg.DynamicAny._DynArrayStub stub;
			stub = new org.omg.DynamicAny._DynArrayStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.DynamicAny.DynArray unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.DynamicAny.DynArray)
		{
			return (org.omg.DynamicAny.DynArray)obj;
		}
		else
		{
			org.omg.DynamicAny._DynArrayStub stub;
			stub = new org.omg.DynamicAny._DynArrayStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

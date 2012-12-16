package org.omg.DynamicAny;


/**
 * Generated from IDL interface "DynFixed".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public final class DynFixedHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.DynamicAny.DynFixed s)
	{
			any.insert_Object(s);
	}
	public static org.omg.DynamicAny.DynFixed extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/DynamicAny/DynFixed:1.0", "DynFixed");
	}
	public static String id()
	{
		return "IDL:omg.org/DynamicAny/DynFixed:1.0";
	}
	public static DynFixed read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.DynamicAny._DynFixedStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.DynamicAny.DynFixed s)
	{
		_out.write_Object(s);
	}
	public static org.omg.DynamicAny.DynFixed narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.DynamicAny.DynFixed)
		{
			return (org.omg.DynamicAny.DynFixed)obj;
		}
		else if (obj._is_a("IDL:omg.org/DynamicAny/DynFixed:1.0"))
		{
			org.omg.DynamicAny._DynFixedStub stub;
			stub = new org.omg.DynamicAny._DynFixedStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.DynamicAny.DynFixed unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.DynamicAny.DynFixed)
		{
			return (org.omg.DynamicAny.DynFixed)obj;
		}
		else
		{
			org.omg.DynamicAny._DynFixedStub stub;
			stub = new org.omg.DynamicAny._DynFixedStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

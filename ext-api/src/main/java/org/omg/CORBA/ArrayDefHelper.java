package org.omg.CORBA;


/**
 * Generated from IDL interface "ArrayDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class ArrayDefHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.ArrayDef s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CORBA.ArrayDef extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/ArrayDef:1.0", "ArrayDef");
	}
	public static String id()
	{
		return "IDL:omg.org/CORBA/ArrayDef:1.0";
	}
	public static ArrayDef read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CORBA._ArrayDefStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CORBA.ArrayDef s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CORBA.ArrayDef narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.ArrayDef)
		{
			return (org.omg.CORBA.ArrayDef)obj;
		}
		else if (obj._is_a("IDL:omg.org/CORBA/ArrayDef:1.0"))
		{
			org.omg.CORBA._ArrayDefStub stub;
			stub = new org.omg.CORBA._ArrayDefStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CORBA.ArrayDef unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.ArrayDef)
		{
			return (org.omg.CORBA.ArrayDef)obj;
		}
		else
		{
			org.omg.CORBA._ArrayDefStub stub;
			stub = new org.omg.CORBA._ArrayDefStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

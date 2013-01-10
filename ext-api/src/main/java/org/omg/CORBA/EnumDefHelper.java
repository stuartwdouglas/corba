package org.omg.CORBA;


/**
 * Generated from IDL interface "EnumDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class EnumDefHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.EnumDef s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CORBA.EnumDef extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/EnumDef:1.0", "EnumDef");
	}
	public static String id()
	{
		return "IDL:omg.org/CORBA/EnumDef:1.0";
	}
	public static EnumDef read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CORBA._EnumDefStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CORBA.EnumDef s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CORBA.EnumDef narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.EnumDef)
		{
			return (org.omg.CORBA.EnumDef)obj;
		}
		else if (obj._is_a("IDL:omg.org/CORBA/EnumDef:1.0"))
		{
			org.omg.CORBA._EnumDefStub stub;
			stub = new org.omg.CORBA._EnumDefStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CORBA.EnumDef unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.EnumDef)
		{
			return (org.omg.CORBA.EnumDef)obj;
		}
		else
		{
			org.omg.CORBA._EnumDefStub stub;
			stub = new org.omg.CORBA._EnumDefStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

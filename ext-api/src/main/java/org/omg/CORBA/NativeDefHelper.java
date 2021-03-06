package org.omg.CORBA;


/**
 * Generated from IDL interface "NativeDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class NativeDefHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.NativeDef s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CORBA.NativeDef extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/NativeDef:1.0", "NativeDef");
	}
	public static String id()
	{
		return "IDL:omg.org/CORBA/NativeDef:1.0";
	}
	public static NativeDef read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CORBA._NativeDefStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CORBA.NativeDef s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CORBA.NativeDef narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.NativeDef)
		{
			return (org.omg.CORBA.NativeDef)obj;
		}
		else if (obj._is_a("IDL:omg.org/CORBA/NativeDef:1.0"))
		{
			org.omg.CORBA._NativeDefStub stub;
			stub = new org.omg.CORBA._NativeDefStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CORBA.NativeDef unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.NativeDef)
		{
			return (org.omg.CORBA.NativeDef)obj;
		}
		else
		{
			org.omg.CORBA._NativeDefStub stub;
			stub = new org.omg.CORBA._NativeDefStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

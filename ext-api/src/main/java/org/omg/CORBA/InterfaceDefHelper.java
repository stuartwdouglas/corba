package org.omg.CORBA;


/**
 * Generated from IDL interface "InterfaceDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class InterfaceDefHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.InterfaceDef s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CORBA.InterfaceDef extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/InterfaceDef:1.0", "InterfaceDef");
	}
	public static String id()
	{
		return "IDL:omg.org/CORBA/InterfaceDef:1.0";
	}
	public static InterfaceDef read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CORBA._InterfaceDefStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CORBA.InterfaceDef s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CORBA.InterfaceDef narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.InterfaceDef)
		{
			return (org.omg.CORBA.InterfaceDef)obj;
		}
		else if (obj._is_a("IDL:omg.org/CORBA/InterfaceDef:1.0"))
		{
			org.omg.CORBA._InterfaceDefStub stub;
			stub = new org.omg.CORBA._InterfaceDefStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CORBA.InterfaceDef unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.InterfaceDef)
		{
			return (org.omg.CORBA.InterfaceDef)obj;
		}
		else
		{
			org.omg.CORBA._InterfaceDefStub stub;
			stub = new org.omg.CORBA._InterfaceDefStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

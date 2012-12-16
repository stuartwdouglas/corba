package org.omg.CosNaming;


/**
 * Generated from IDL interface "NamingContextExt".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:39 PM
 */

public final class NamingContextExtHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNaming.NamingContextExt s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosNaming.NamingContextExt extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNaming/NamingContextExt:1.0", "NamingContextExt");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNaming/NamingContextExt:1.0";
	}
	public static NamingContextExt read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosNaming._NamingContextExtStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNaming.NamingContextExt s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNaming.NamingContextExt narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNaming.NamingContextExt)
		{
			return (org.omg.CosNaming.NamingContextExt)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosNaming/NamingContextExt:1.0"))
		{
			org.omg.CosNaming._NamingContextExtStub stub;
			stub = new org.omg.CosNaming._NamingContextExtStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosNaming.NamingContextExt unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNaming.NamingContextExt)
		{
			return (org.omg.CosNaming.NamingContextExt)obj;
		}
		else
		{
			org.omg.CosNaming._NamingContextExtStub stub;
			stub = new org.omg.CosNaming._NamingContextExtStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

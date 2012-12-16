package org.omg.CosTime;


/**
 * Generated from IDL interface "UTO".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class UTOHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTime.UTO s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosTime.UTO extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:CosTime/UTO:1.0", "UTO");
	}
	public static String id()
	{
		return "IDL:CosTime/UTO:1.0";
	}
	public static UTO read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosTime.UTO s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosTime.UTO narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTime.UTO)
		{
			return (org.omg.CosTime.UTO)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosTime.UTO unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTime.UTO)
		{
			return (org.omg.CosTime.UTO)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}

package org.omg.CORBA;


/**
 * Generated from IDL interface "AliasDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class AliasDefHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.AliasDef s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CORBA.AliasDef extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/AliasDef:1.0", "AliasDef");
	}
	public static String id()
	{
		return "IDL:omg.org/CORBA/AliasDef:1.0";
	}
	public static AliasDef read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CORBA._AliasDefStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CORBA.AliasDef s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CORBA.AliasDef narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.AliasDef)
		{
			return (org.omg.CORBA.AliasDef)obj;
		}
		else if (obj._is_a("IDL:omg.org/CORBA/AliasDef:1.0"))
		{
			org.omg.CORBA._AliasDefStub stub;
			stub = new org.omg.CORBA._AliasDefStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CORBA.AliasDef unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.AliasDef)
		{
			return (org.omg.CORBA.AliasDef)obj;
		}
		else
		{
			org.omg.CORBA._AliasDefStub stub;
			stub = new org.omg.CORBA._AliasDefStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

package org.omg.dds;


/**
 * Generated from IDL interface "Condition".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class ConditionHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.Condition s)
	{
			any.insert_Object(s);
	}
	public static org.omg.dds.Condition extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/dds/Condition:1.0", "Condition");
	}
	public static String id()
	{
		return "IDL:omg.org/dds/Condition:1.0";
	}
	public static Condition read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.dds._ConditionStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.dds.Condition s)
	{
		_out.write_Object(s);
	}
	public static org.omg.dds.Condition narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.dds.Condition)
		{
			return (org.omg.dds.Condition)obj;
		}
		else if (obj._is_a("IDL:omg.org/dds/Condition:1.0"))
		{
			org.omg.dds._ConditionStub stub;
			stub = new org.omg.dds._ConditionStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.dds.Condition unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.dds.Condition)
		{
			return (org.omg.dds.Condition)obj;
		}
		else
		{
			org.omg.dds._ConditionStub stub;
			stub = new org.omg.dds._ConditionStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

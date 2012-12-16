package org.omg.CORBA;


/**
 * Generated from IDL interface "Contained".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class ContainedHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.Contained s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CORBA.Contained extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/Contained:1.0", "Contained");
	}
	public static String id()
	{
		return "IDL:omg.org/CORBA/Contained:1.0";
	}
	public static Contained read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CORBA._ContainedStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CORBA.Contained s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CORBA.Contained narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.Contained)
		{
			return (org.omg.CORBA.Contained)obj;
		}
		else if (obj._is_a("IDL:omg.org/CORBA/Contained:1.0"))
		{
			org.omg.CORBA._ContainedStub stub;
			stub = new org.omg.CORBA._ContainedStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CORBA.Contained unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.Contained)
		{
			return (org.omg.CORBA.Contained)obj;
		}
		else
		{
			org.omg.CORBA._ContainedStub stub;
			stub = new org.omg.CORBA._ContainedStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

package org.omg.CosConcurrencyControl;


/**
 * Generated from IDL interface "LockSet".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public final class LockSetHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosConcurrencyControl.LockSet s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosConcurrencyControl.LockSet extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosConcurrencyControl/LockSet:1.0", "LockSet");
	}
	public static String id()
	{
		return "IDL:omg.org/CosConcurrencyControl/LockSet:1.0";
	}
	public static LockSet read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosConcurrencyControl._LockSetStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosConcurrencyControl.LockSet s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosConcurrencyControl.LockSet narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosConcurrencyControl.LockSet)
		{
			return (org.omg.CosConcurrencyControl.LockSet)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosConcurrencyControl/LockSet:1.0"))
		{
			org.omg.CosConcurrencyControl._LockSetStub stub;
			stub = new org.omg.CosConcurrencyControl._LockSetStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosConcurrencyControl.LockSet unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosConcurrencyControl.LockSet)
		{
			return (org.omg.CosConcurrencyControl.LockSet)obj;
		}
		else
		{
			org.omg.CosConcurrencyControl._LockSetStub stub;
			stub = new org.omg.CosConcurrencyControl._LockSetStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

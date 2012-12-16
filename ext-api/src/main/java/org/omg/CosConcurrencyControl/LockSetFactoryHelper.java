package org.omg.CosConcurrencyControl;


/**
 * Generated from IDL interface "LockSetFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class LockSetFactoryHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosConcurrencyControl.LockSetFactory s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosConcurrencyControl.LockSetFactory extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosConcurrencyControl/LockSetFactory:1.0", "LockSetFactory");
	}
	public static String id()
	{
		return "IDL:omg.org/CosConcurrencyControl/LockSetFactory:1.0";
	}
	public static LockSetFactory read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosConcurrencyControl._LockSetFactoryStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosConcurrencyControl.LockSetFactory s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosConcurrencyControl.LockSetFactory narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosConcurrencyControl.LockSetFactory)
		{
			return (org.omg.CosConcurrencyControl.LockSetFactory)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosConcurrencyControl/LockSetFactory:1.0"))
		{
			org.omg.CosConcurrencyControl._LockSetFactoryStub stub;
			stub = new org.omg.CosConcurrencyControl._LockSetFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosConcurrencyControl.LockSetFactory unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosConcurrencyControl.LockSetFactory)
		{
			return (org.omg.CosConcurrencyControl.LockSetFactory)obj;
		}
		else
		{
			org.omg.CosConcurrencyControl._LockSetFactoryStub stub;
			stub = new org.omg.CosConcurrencyControl._LockSetFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

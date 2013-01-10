package org.omg.CosConcurrencyControl;


/**
 * Generated from IDL interface "TransactionalLockSet".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public final class TransactionalLockSetHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosConcurrencyControl.TransactionalLockSet s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosConcurrencyControl.TransactionalLockSet extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosConcurrencyControl/TransactionalLockSet:1.0", "TransactionalLockSet");
	}
	public static String id()
	{
		return "IDL:omg.org/CosConcurrencyControl/TransactionalLockSet:1.0";
	}
	public static TransactionalLockSet read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosConcurrencyControl._TransactionalLockSetStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosConcurrencyControl.TransactionalLockSet s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosConcurrencyControl.TransactionalLockSet narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosConcurrencyControl.TransactionalLockSet)
		{
			return (org.omg.CosConcurrencyControl.TransactionalLockSet)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosConcurrencyControl/TransactionalLockSet:1.0"))
		{
			org.omg.CosConcurrencyControl._TransactionalLockSetStub stub;
			stub = new org.omg.CosConcurrencyControl._TransactionalLockSetStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosConcurrencyControl.TransactionalLockSet unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosConcurrencyControl.TransactionalLockSet)
		{
			return (org.omg.CosConcurrencyControl.TransactionalLockSet)obj;
		}
		else
		{
			org.omg.CosConcurrencyControl._TransactionalLockSetStub stub;
			stub = new org.omg.CosConcurrencyControl._TransactionalLockSetStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

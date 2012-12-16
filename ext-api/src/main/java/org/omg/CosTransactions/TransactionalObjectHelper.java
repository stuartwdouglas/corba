package org.omg.CosTransactions;


/**
 * Generated from IDL interface "TransactionalObject".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public final class TransactionalObjectHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTransactions.TransactionalObject s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosTransactions.TransactionalObject extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosTransactions/TransactionalObject:1.0", "TransactionalObject");
	}
	public static String id()
	{
		return "IDL:omg.org/CosTransactions/TransactionalObject:1.0";
	}
	public static TransactionalObject read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosTransactions._TransactionalObjectStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosTransactions.TransactionalObject s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosTransactions.TransactionalObject narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTransactions.TransactionalObject)
		{
			return (org.omg.CosTransactions.TransactionalObject)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosTransactions/TransactionalObject:1.0"))
		{
			org.omg.CosTransactions._TransactionalObjectStub stub;
			stub = new org.omg.CosTransactions._TransactionalObjectStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosTransactions.TransactionalObject unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTransactions.TransactionalObject)
		{
			return (org.omg.CosTransactions.TransactionalObject)obj;
		}
		else
		{
			org.omg.CosTransactions._TransactionalObjectStub stub;
			stub = new org.omg.CosTransactions._TransactionalObjectStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

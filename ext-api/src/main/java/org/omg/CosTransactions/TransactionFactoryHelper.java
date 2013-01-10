package org.omg.CosTransactions;


/**
 * Generated from IDL interface "TransactionFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public final class TransactionFactoryHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTransactions.TransactionFactory s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosTransactions.TransactionFactory extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosTransactions/TransactionFactory:1.0", "TransactionFactory");
	}
	public static String id()
	{
		return "IDL:omg.org/CosTransactions/TransactionFactory:1.0";
	}
	public static TransactionFactory read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosTransactions._TransactionFactoryStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosTransactions.TransactionFactory s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosTransactions.TransactionFactory narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTransactions.TransactionFactory)
		{
			return (org.omg.CosTransactions.TransactionFactory)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosTransactions/TransactionFactory:1.0"))
		{
			org.omg.CosTransactions._TransactionFactoryStub stub;
			stub = new org.omg.CosTransactions._TransactionFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosTransactions.TransactionFactory unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTransactions.TransactionFactory)
		{
			return (org.omg.CosTransactions.TransactionFactory)obj;
		}
		else
		{
			org.omg.CosTransactions._TransactionFactoryStub stub;
			stub = new org.omg.CosTransactions._TransactionFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

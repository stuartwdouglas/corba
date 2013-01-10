package org.omg.CosCollection;


/**
 * Generated from IDL interface "OrderedIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class OrderedIteratorHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosCollection.OrderedIterator s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosCollection.OrderedIterator extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosCollection/OrderedIterator:1.0", "OrderedIterator");
	}
	public static String id()
	{
		return "IDL:omg.org/CosCollection/OrderedIterator:1.0";
	}
	public static OrderedIterator read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosCollection._OrderedIteratorStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosCollection.OrderedIterator s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosCollection.OrderedIterator narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosCollection.OrderedIterator)
		{
			return (org.omg.CosCollection.OrderedIterator)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosCollection/OrderedIterator:1.0"))
		{
			org.omg.CosCollection._OrderedIteratorStub stub;
			stub = new org.omg.CosCollection._OrderedIteratorStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosCollection.OrderedIterator unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosCollection.OrderedIterator)
		{
			return (org.omg.CosCollection.OrderedIterator)obj;
		}
		else
		{
			org.omg.CosCollection._OrderedIteratorStub stub;
			stub = new org.omg.CosCollection._OrderedIteratorStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

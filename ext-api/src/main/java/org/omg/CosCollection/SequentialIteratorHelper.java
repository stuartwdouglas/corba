package org.omg.CosCollection;


/**
 * Generated from IDL interface "SequentialIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class SequentialIteratorHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosCollection.SequentialIterator s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosCollection.SequentialIterator extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosCollection/SequentialIterator:1.0", "SequentialIterator");
	}
	public static String id()
	{
		return "IDL:omg.org/CosCollection/SequentialIterator:1.0";
	}
	public static SequentialIterator read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosCollection._SequentialIteratorStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosCollection.SequentialIterator s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosCollection.SequentialIterator narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosCollection.SequentialIterator)
		{
			return (org.omg.CosCollection.SequentialIterator)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosCollection/SequentialIterator:1.0"))
		{
			org.omg.CosCollection._SequentialIteratorStub stub;
			stub = new org.omg.CosCollection._SequentialIteratorStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosCollection.SequentialIterator unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosCollection.SequentialIterator)
		{
			return (org.omg.CosCollection.SequentialIterator)obj;
		}
		else
		{
			org.omg.CosCollection._SequentialIteratorStub stub;
			stub = new org.omg.CosCollection._SequentialIteratorStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

package org.omg.CosCollection;


/**
 * Generated from IDL interface "KeyIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class KeyIteratorHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosCollection.KeyIterator s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosCollection.KeyIterator extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosCollection/KeyIterator:1.0", "KeyIterator");
	}
	public static String id()
	{
		return "IDL:omg.org/CosCollection/KeyIterator:1.0";
	}
	public static KeyIterator read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosCollection._KeyIteratorStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosCollection.KeyIterator s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosCollection.KeyIterator narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosCollection.KeyIterator)
		{
			return (org.omg.CosCollection.KeyIterator)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosCollection/KeyIterator:1.0"))
		{
			org.omg.CosCollection._KeyIteratorStub stub;
			stub = new org.omg.CosCollection._KeyIteratorStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosCollection.KeyIterator unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosCollection.KeyIterator)
		{
			return (org.omg.CosCollection.KeyIterator)obj;
		}
		else
		{
			org.omg.CosCollection._KeyIteratorStub stub;
			stub = new org.omg.CosCollection._KeyIteratorStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

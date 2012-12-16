package org.omg.CosCollection;


/**
 * Generated from IDL interface "SortedMapFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class SortedMapFactoryHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosCollection.SortedMapFactory s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosCollection.SortedMapFactory extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosCollection/SortedMapFactory:1.0", "SortedMapFactory");
	}
	public static String id()
	{
		return "IDL:omg.org/CosCollection/SortedMapFactory:1.0";
	}
	public static SortedMapFactory read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosCollection._SortedMapFactoryStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosCollection.SortedMapFactory s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosCollection.SortedMapFactory narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosCollection.SortedMapFactory)
		{
			return (org.omg.CosCollection.SortedMapFactory)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosCollection/SortedMapFactory:1.0"))
		{
			org.omg.CosCollection._SortedMapFactoryStub stub;
			stub = new org.omg.CosCollection._SortedMapFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosCollection.SortedMapFactory unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosCollection.SortedMapFactory)
		{
			return (org.omg.CosCollection.SortedMapFactory)obj;
		}
		else
		{
			org.omg.CosCollection._SortedMapFactoryStub stub;
			stub = new org.omg.CosCollection._SortedMapFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

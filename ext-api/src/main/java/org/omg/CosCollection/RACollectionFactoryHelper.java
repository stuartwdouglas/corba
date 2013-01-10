package org.omg.CosCollection;


/**
 * Generated from IDL interface "RACollectionFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class RACollectionFactoryHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosCollection.RACollectionFactory s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosCollection.RACollectionFactory extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosCollection/RACollectionFactory:1.0", "RACollectionFactory");
	}
	public static String id()
	{
		return "IDL:omg.org/CosCollection/RACollectionFactory:1.0";
	}
	public static RACollectionFactory read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosCollection._RACollectionFactoryStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosCollection.RACollectionFactory s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosCollection.RACollectionFactory narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosCollection.RACollectionFactory)
		{
			return (org.omg.CosCollection.RACollectionFactory)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosCollection/RACollectionFactory:1.0"))
		{
			org.omg.CosCollection._RACollectionFactoryStub stub;
			stub = new org.omg.CosCollection._RACollectionFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosCollection.RACollectionFactory unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosCollection.RACollectionFactory)
		{
			return (org.omg.CosCollection.RACollectionFactory)obj;
		}
		else
		{
			org.omg.CosCollection._RACollectionFactoryStub stub;
			stub = new org.omg.CosCollection._RACollectionFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

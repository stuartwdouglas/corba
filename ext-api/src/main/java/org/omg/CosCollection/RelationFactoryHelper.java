package org.omg.CosCollection;


/**
 * Generated from IDL interface "RelationFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class RelationFactoryHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosCollection.RelationFactory s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosCollection.RelationFactory extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosCollection/RelationFactory:1.0", "RelationFactory");
	}
	public static String id()
	{
		return "IDL:omg.org/CosCollection/RelationFactory:1.0";
	}
	public static RelationFactory read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosCollection._RelationFactoryStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosCollection.RelationFactory s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosCollection.RelationFactory narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosCollection.RelationFactory)
		{
			return (org.omg.CosCollection.RelationFactory)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosCollection/RelationFactory:1.0"))
		{
			org.omg.CosCollection._RelationFactoryStub stub;
			stub = new org.omg.CosCollection._RelationFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosCollection.RelationFactory unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosCollection.RelationFactory)
		{
			return (org.omg.CosCollection.RelationFactory)obj;
		}
		else
		{
			org.omg.CosCollection._RelationFactoryStub stub;
			stub = new org.omg.CosCollection._RelationFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

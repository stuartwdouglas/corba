package org.omg.CosCollection;


/**
 * Generated from IDL interface "SetFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class SetFactoryHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosCollection.SetFactory s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosCollection.SetFactory extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosCollection/SetFactory:1.0", "SetFactory");
	}
	public static String id()
	{
		return "IDL:omg.org/CosCollection/SetFactory:1.0";
	}
	public static SetFactory read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosCollection._SetFactoryStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosCollection.SetFactory s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosCollection.SetFactory narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosCollection.SetFactory)
		{
			return (org.omg.CosCollection.SetFactory)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosCollection/SetFactory:1.0"))
		{
			org.omg.CosCollection._SetFactoryStub stub;
			stub = new org.omg.CosCollection._SetFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosCollection.SetFactory unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosCollection.SetFactory)
		{
			return (org.omg.CosCollection.SetFactory)obj;
		}
		else
		{
			org.omg.CosCollection._SetFactoryStub stub;
			stub = new org.omg.CosCollection._SetFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

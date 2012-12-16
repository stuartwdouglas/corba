package org.omg.CosCollection;


/**
 * Generated from IDL interface "Operations".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class OperationsHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosCollection.Operations s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosCollection.Operations extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosCollection/Operations:1.0", "Operations");
	}
	public static String id()
	{
		return "IDL:omg.org/CosCollection/Operations:1.0";
	}
	public static Operations read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosCollection._OperationsStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosCollection.Operations s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosCollection.Operations narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosCollection.Operations)
		{
			return (org.omg.CosCollection.Operations)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosCollection/Operations:1.0"))
		{
			org.omg.CosCollection._OperationsStub stub;
			stub = new org.omg.CosCollection._OperationsStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosCollection.Operations unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosCollection.Operations)
		{
			return (org.omg.CosCollection.Operations)obj;
		}
		else
		{
			org.omg.CosCollection._OperationsStub stub;
			stub = new org.omg.CosCollection._OperationsStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

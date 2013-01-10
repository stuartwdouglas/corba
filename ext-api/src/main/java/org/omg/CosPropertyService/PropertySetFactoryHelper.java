package org.omg.CosPropertyService;


/**
 * Generated from IDL interface "PropertySetFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public final class PropertySetFactoryHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosPropertyService.PropertySetFactory s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosPropertyService.PropertySetFactory extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosPropertyService/PropertySetFactory:1.0", "PropertySetFactory");
	}
	public static String id()
	{
		return "IDL:omg.org/CosPropertyService/PropertySetFactory:1.0";
	}
	public static PropertySetFactory read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosPropertyService._PropertySetFactoryStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosPropertyService.PropertySetFactory s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosPropertyService.PropertySetFactory narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosPropertyService.PropertySetFactory)
		{
			return (org.omg.CosPropertyService.PropertySetFactory)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosPropertyService/PropertySetFactory:1.0"))
		{
			org.omg.CosPropertyService._PropertySetFactoryStub stub;
			stub = new org.omg.CosPropertyService._PropertySetFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosPropertyService.PropertySetFactory unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosPropertyService.PropertySetFactory)
		{
			return (org.omg.CosPropertyService.PropertySetFactory)obj;
		}
		else
		{
			org.omg.CosPropertyService._PropertySetFactoryStub stub;
			stub = new org.omg.CosPropertyService._PropertySetFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

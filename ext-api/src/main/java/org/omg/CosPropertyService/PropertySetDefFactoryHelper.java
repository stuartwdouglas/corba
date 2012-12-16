package org.omg.CosPropertyService;


/**
 * Generated from IDL interface "PropertySetDefFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public final class PropertySetDefFactoryHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosPropertyService.PropertySetDefFactory s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosPropertyService.PropertySetDefFactory extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosPropertyService/PropertySetDefFactory:1.0", "PropertySetDefFactory");
	}
	public static String id()
	{
		return "IDL:omg.org/CosPropertyService/PropertySetDefFactory:1.0";
	}
	public static PropertySetDefFactory read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosPropertyService._PropertySetDefFactoryStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosPropertyService.PropertySetDefFactory s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosPropertyService.PropertySetDefFactory narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosPropertyService.PropertySetDefFactory)
		{
			return (org.omg.CosPropertyService.PropertySetDefFactory)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosPropertyService/PropertySetDefFactory:1.0"))
		{
			org.omg.CosPropertyService._PropertySetDefFactoryStub stub;
			stub = new org.omg.CosPropertyService._PropertySetDefFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosPropertyService.PropertySetDefFactory unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosPropertyService.PropertySetDefFactory)
		{
			return (org.omg.CosPropertyService.PropertySetDefFactory)obj;
		}
		else
		{
			org.omg.CosPropertyService._PropertySetDefFactoryStub stub;
			stub = new org.omg.CosPropertyService._PropertySetDefFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

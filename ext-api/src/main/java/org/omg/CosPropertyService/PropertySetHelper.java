package org.omg.CosPropertyService;


/**
 * Generated from IDL interface "PropertySet".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public final class PropertySetHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosPropertyService.PropertySet s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosPropertyService.PropertySet extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosPropertyService/PropertySet:1.0", "PropertySet");
	}
	public static String id()
	{
		return "IDL:omg.org/CosPropertyService/PropertySet:1.0";
	}
	public static PropertySet read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosPropertyService._PropertySetStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosPropertyService.PropertySet s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosPropertyService.PropertySet narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosPropertyService.PropertySet)
		{
			return (org.omg.CosPropertyService.PropertySet)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosPropertyService/PropertySet:1.0"))
		{
			org.omg.CosPropertyService._PropertySetStub stub;
			stub = new org.omg.CosPropertyService._PropertySetStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosPropertyService.PropertySet unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosPropertyService.PropertySet)
		{
			return (org.omg.CosPropertyService.PropertySet)obj;
		}
		else
		{
			org.omg.CosPropertyService._PropertySetStub stub;
			stub = new org.omg.CosPropertyService._PropertySetStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

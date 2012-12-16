package org.omg.CosPropertyService;

/**
 * Generated from IDL alias "PropertyTypes".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public final class PropertyTypesHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.TypeCode[] value;

	public PropertyTypesHolder ()
	{
	}
	public PropertyTypesHolder (final org.omg.CORBA.TypeCode[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PropertyTypesHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PropertyTypesHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PropertyTypesHelper.write (out,value);
	}
}

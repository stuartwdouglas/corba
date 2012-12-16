package org.omg.CosPropertyService;

/**
 * Generated from IDL alias "PropertyDefs".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public final class PropertyDefsHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosPropertyService.PropertyDef[] value;

	public PropertyDefsHolder ()
	{
	}
	public PropertyDefsHolder (final org.omg.CosPropertyService.PropertyDef[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PropertyDefsHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PropertyDefsHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PropertyDefsHelper.write (out,value);
	}
}

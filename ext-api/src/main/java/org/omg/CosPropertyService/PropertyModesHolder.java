package org.omg.CosPropertyService;

/**
 * Generated from IDL alias "PropertyModes".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public final class PropertyModesHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosPropertyService.PropertyMode[] value;

	public PropertyModesHolder ()
	{
	}
	public PropertyModesHolder (final org.omg.CosPropertyService.PropertyMode[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PropertyModesHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PropertyModesHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PropertyModesHelper.write (out,value);
	}
}

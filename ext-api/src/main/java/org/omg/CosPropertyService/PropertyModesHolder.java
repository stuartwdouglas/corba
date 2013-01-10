package org.omg.CosPropertyService;

/**
 * Generated from IDL alias "PropertyModes".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
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

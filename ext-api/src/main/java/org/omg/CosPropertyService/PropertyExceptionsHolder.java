package org.omg.CosPropertyService;

/**
 * Generated from IDL alias "PropertyExceptions".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public final class PropertyExceptionsHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosPropertyService.PropertyException[] value;

	public PropertyExceptionsHolder ()
	{
	}
	public PropertyExceptionsHolder (final org.omg.CosPropertyService.PropertyException[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PropertyExceptionsHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PropertyExceptionsHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PropertyExceptionsHelper.write (out,value);
	}
}

package org.omg.CosPropertyService;

/**
 * Generated from IDL alias "PropertyNames".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public final class PropertyNamesHolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public PropertyNamesHolder ()
	{
	}
	public PropertyNamesHolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PropertyNamesHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PropertyNamesHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PropertyNamesHelper.write (out,value);
	}
}

package org.omg.CosPropertyService;

/**
 * Generated from IDL alias "Properties".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public final class PropertiesHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosPropertyService.Property[] value;

	public PropertiesHolder ()
	{
	}
	public PropertiesHolder (final org.omg.CosPropertyService.Property[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PropertiesHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PropertiesHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PropertiesHelper.write (out,value);
	}
}

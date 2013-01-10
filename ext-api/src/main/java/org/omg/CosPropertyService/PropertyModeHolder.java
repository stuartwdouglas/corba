package org.omg.CosPropertyService;

/**
 * Generated from IDL struct "PropertyMode".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public final class PropertyModeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosPropertyService.PropertyMode value;

	public PropertyModeHolder ()
	{
	}
	public PropertyModeHolder(final org.omg.CosPropertyService.PropertyMode initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosPropertyService.PropertyModeHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosPropertyService.PropertyModeHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosPropertyService.PropertyModeHelper.write(_out, value);
	}
}

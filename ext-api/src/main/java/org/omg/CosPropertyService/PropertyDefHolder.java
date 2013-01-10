package org.omg.CosPropertyService;

/**
 * Generated from IDL struct "PropertyDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public final class PropertyDefHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosPropertyService.PropertyDef value;

	public PropertyDefHolder ()
	{
	}
	public PropertyDefHolder(final org.omg.CosPropertyService.PropertyDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosPropertyService.PropertyDefHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosPropertyService.PropertyDefHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosPropertyService.PropertyDefHelper.write(_out, value);
	}
}

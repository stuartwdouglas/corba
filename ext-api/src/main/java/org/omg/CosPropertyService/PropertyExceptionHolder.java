package org.omg.CosPropertyService;

/**
 * Generated from IDL struct "PropertyException".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public final class PropertyExceptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosPropertyService.PropertyException value;

	public PropertyExceptionHolder ()
	{
	}
	public PropertyExceptionHolder(final org.omg.CosPropertyService.PropertyException initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosPropertyService.PropertyExceptionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosPropertyService.PropertyExceptionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosPropertyService.PropertyExceptionHelper.write(_out, value);
	}
}

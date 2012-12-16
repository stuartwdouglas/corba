package org.omg.CosPropertyService;
/**
 * Generated from IDL enum "PropertyModeType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public final class PropertyModeTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public PropertyModeType value;

	public PropertyModeTypeHolder ()
	{
	}
	public PropertyModeTypeHolder (final PropertyModeType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PropertyModeTypeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PropertyModeTypeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PropertyModeTypeHelper.write (out,value);
	}
}

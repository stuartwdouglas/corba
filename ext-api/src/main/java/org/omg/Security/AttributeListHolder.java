package org.omg.Security;

/**
 * Generated from IDL alias "AttributeList".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class AttributeListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.Security.SecAttribute[] value;

	public AttributeListHolder ()
	{
	}
	public AttributeListHolder (final org.omg.Security.SecAttribute[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AttributeListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AttributeListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AttributeListHelper.write (out,value);
	}
}
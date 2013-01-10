package org.omg.Security;

/**
 * Generated from IDL alias "AttributeTypeList".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class AttributeTypeListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.Security.AttributeType[] value;

	public AttributeTypeListHolder ()
	{
	}
	public AttributeTypeListHolder (final org.omg.Security.AttributeType[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AttributeTypeListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AttributeTypeListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AttributeTypeListHelper.write (out,value);
	}
}

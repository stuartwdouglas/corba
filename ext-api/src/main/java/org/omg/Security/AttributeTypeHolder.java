package org.omg.Security;

/**
 * Generated from IDL struct "AttributeType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class AttributeTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.Security.AttributeType value;

	public AttributeTypeHolder ()
	{
	}
	public AttributeTypeHolder(final org.omg.Security.AttributeType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.Security.AttributeTypeHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.Security.AttributeTypeHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.Security.AttributeTypeHelper.write(_out, value);
	}
}

package org.omg.Security;
/**
 * Generated from IDL enum "InvocationCredentialsType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class InvocationCredentialsTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public InvocationCredentialsType value;

	public InvocationCredentialsTypeHolder ()
	{
	}
	public InvocationCredentialsTypeHolder (final InvocationCredentialsType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return InvocationCredentialsTypeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = InvocationCredentialsTypeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		InvocationCredentialsTypeHelper.write (out,value);
	}
}

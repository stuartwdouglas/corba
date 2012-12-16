package org.omg.Security;

/**
 * Generated from IDL alias "AuthenticationMethodList".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class AuthenticationMethodListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public AuthenticationMethodListHolder ()
	{
	}
	public AuthenticationMethodListHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AuthenticationMethodListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AuthenticationMethodListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AuthenticationMethodListHelper.write (out,value);
	}
}

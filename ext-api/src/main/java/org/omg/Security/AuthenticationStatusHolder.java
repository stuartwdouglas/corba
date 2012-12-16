package org.omg.Security;
/**
 * Generated from IDL enum "AuthenticationStatus".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class AuthenticationStatusHolder
	implements org.omg.CORBA.portable.Streamable
{
	public AuthenticationStatus value;

	public AuthenticationStatusHolder ()
	{
	}
	public AuthenticationStatusHolder (final AuthenticationStatus initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AuthenticationStatusHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AuthenticationStatusHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AuthenticationStatusHelper.write (out,value);
	}
}

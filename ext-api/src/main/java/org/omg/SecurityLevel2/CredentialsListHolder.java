package org.omg.SecurityLevel2;

/**
 * Generated from IDL alias "CredentialsList".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class CredentialsListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.SecurityLevel2.Credentials[] value;

	public CredentialsListHolder ()
	{
	}
	public CredentialsListHolder (final org.omg.SecurityLevel2.Credentials[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CredentialsListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CredentialsListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CredentialsListHelper.write (out,value);
	}
}

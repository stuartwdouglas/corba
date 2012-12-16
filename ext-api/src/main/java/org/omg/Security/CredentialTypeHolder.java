package org.omg.Security;
/**
 * Generated from IDL enum "CredentialType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class CredentialTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public CredentialType value;

	public CredentialTypeHolder ()
	{
	}
	public CredentialTypeHolder (final CredentialType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CredentialTypeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CredentialTypeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CredentialTypeHelper.write (out,value);
	}
}

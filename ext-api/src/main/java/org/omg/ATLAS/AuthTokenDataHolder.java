package org.omg.ATLAS;

/**
 * Generated from IDL struct "AuthTokenData".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class AuthTokenDataHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.ATLAS.AuthTokenData value;

	public AuthTokenDataHolder ()
	{
	}
	public AuthTokenDataHolder(final org.omg.ATLAS.AuthTokenData initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.ATLAS.AuthTokenDataHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.ATLAS.AuthTokenDataHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.ATLAS.AuthTokenDataHelper.write(_out, value);
	}
}

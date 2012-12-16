package org.omg.ATLAS;

/**
 * Generated from IDL interface "AuthTokenDispenser".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:41 PM
 */

public final class AuthTokenDispenserHolder	implements org.omg.CORBA.portable.Streamable{
	 public AuthTokenDispenser value;
	public AuthTokenDispenserHolder()
	{
	}
	public AuthTokenDispenserHolder (final AuthTokenDispenser initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return AuthTokenDispenserHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AuthTokenDispenserHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		AuthTokenDispenserHelper.write (_out,value);
	}
}

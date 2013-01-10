package org.omg.Security;
/**
 * Generated from IDL enum "CredentialType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class CredentialType
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _SecInvocationCredentials = 0;
	public static final CredentialType SecInvocationCredentials = new CredentialType(_SecInvocationCredentials);
	public static final int _SecNRCredentials = 1;
	public static final CredentialType SecNRCredentials = new CredentialType(_SecNRCredentials);
	public int value()
	{
		return value;
	}
	public static CredentialType from_int(int value)
	{
		switch (value) {
			case _SecInvocationCredentials: return SecInvocationCredentials;
			case _SecNRCredentials: return SecNRCredentials;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _SecInvocationCredentials: return "SecInvocationCredentials";
			case _SecNRCredentials: return "SecNRCredentials";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected CredentialType(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}

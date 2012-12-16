package org.omg.Security;
/**
 * Generated from IDL enum "AuthenticationStatus".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class AuthenticationStatus
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _SecAuthSuccess = 0;
	public static final AuthenticationStatus SecAuthSuccess = new AuthenticationStatus(_SecAuthSuccess);
	public static final int _SecAuthFailure = 1;
	public static final AuthenticationStatus SecAuthFailure = new AuthenticationStatus(_SecAuthFailure);
	public static final int _SecAuthContinue = 2;
	public static final AuthenticationStatus SecAuthContinue = new AuthenticationStatus(_SecAuthContinue);
	public static final int _SecAuthExpired = 3;
	public static final AuthenticationStatus SecAuthExpired = new AuthenticationStatus(_SecAuthExpired);
	public int value()
	{
		return value;
	}
	public static AuthenticationStatus from_int(int value)
	{
		switch (value) {
			case _SecAuthSuccess: return SecAuthSuccess;
			case _SecAuthFailure: return SecAuthFailure;
			case _SecAuthContinue: return SecAuthContinue;
			case _SecAuthExpired: return SecAuthExpired;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _SecAuthSuccess: return "SecAuthSuccess";
			case _SecAuthFailure: return "SecAuthFailure";
			case _SecAuthContinue: return "SecAuthContinue";
			case _SecAuthExpired: return "SecAuthExpired";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected AuthenticationStatus(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}

package org.omg.Security;
/**
 * Generated from IDL enum "InvocationCredentialsType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class InvocationCredentialsType
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _SecOwnCredentials = 0;
	public static final InvocationCredentialsType SecOwnCredentials = new InvocationCredentialsType(_SecOwnCredentials);
	public static final int _SecReceivedCredentials = 1;
	public static final InvocationCredentialsType SecReceivedCredentials = new InvocationCredentialsType(_SecReceivedCredentials);
	public int value()
	{
		return value;
	}
	public static InvocationCredentialsType from_int(int value)
	{
		switch (value) {
			case _SecOwnCredentials: return SecOwnCredentials;
			case _SecReceivedCredentials: return SecReceivedCredentials;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _SecOwnCredentials: return "SecOwnCredentials";
			case _SecReceivedCredentials: return "SecReceivedCredentials";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected InvocationCredentialsType(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}

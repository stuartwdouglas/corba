package org.omg.SecurityAdmin;

/**
 * Generated from IDL interface "SecureInvocationPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class SecureInvocationPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public SecureInvocationPolicy value;
	public SecureInvocationPolicyHolder()
	{
	}
	public SecureInvocationPolicyHolder (final SecureInvocationPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SecureInvocationPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SecureInvocationPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SecureInvocationPolicyHelper.write (_out,value);
	}
}

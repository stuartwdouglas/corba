package org.omg.Messaging;

/**
 * Generated from IDL interface "RelativeRequestTimeoutPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class RelativeRequestTimeoutPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public RelativeRequestTimeoutPolicy value;
	public RelativeRequestTimeoutPolicyHolder()
	{
	}
	public RelativeRequestTimeoutPolicyHolder (final RelativeRequestTimeoutPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RelativeRequestTimeoutPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RelativeRequestTimeoutPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RelativeRequestTimeoutPolicyHelper.write (_out,value);
	}
}

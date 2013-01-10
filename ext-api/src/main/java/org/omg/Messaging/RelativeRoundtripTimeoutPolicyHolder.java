package org.omg.Messaging;

/**
 * Generated from IDL interface "RelativeRoundtripTimeoutPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class RelativeRoundtripTimeoutPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public RelativeRoundtripTimeoutPolicy value;
	public RelativeRoundtripTimeoutPolicyHolder()
	{
	}
	public RelativeRoundtripTimeoutPolicyHolder (final RelativeRoundtripTimeoutPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RelativeRoundtripTimeoutPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RelativeRoundtripTimeoutPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RelativeRoundtripTimeoutPolicyHelper.write (_out,value);
	}
}

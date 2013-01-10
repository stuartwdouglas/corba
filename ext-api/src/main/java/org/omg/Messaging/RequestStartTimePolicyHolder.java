package org.omg.Messaging;

/**
 * Generated from IDL interface "RequestStartTimePolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class RequestStartTimePolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public RequestStartTimePolicy value;
	public RequestStartTimePolicyHolder()
	{
	}
	public RequestStartTimePolicyHolder (final RequestStartTimePolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RequestStartTimePolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RequestStartTimePolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RequestStartTimePolicyHelper.write (_out,value);
	}
}

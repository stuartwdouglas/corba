package org.omg.Messaging;

/**
 * Generated from IDL interface "RequestEndTimePolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class RequestEndTimePolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public RequestEndTimePolicy value;
	public RequestEndTimePolicyHolder()
	{
	}
	public RequestEndTimePolicyHolder (final RequestEndTimePolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RequestEndTimePolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RequestEndTimePolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RequestEndTimePolicyHelper.write (_out,value);
	}
}

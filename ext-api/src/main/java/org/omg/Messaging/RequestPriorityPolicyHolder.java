package org.omg.Messaging;

/**
 * Generated from IDL interface "RequestPriorityPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class RequestPriorityPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public RequestPriorityPolicy value;
	public RequestPriorityPolicyHolder()
	{
	}
	public RequestPriorityPolicyHolder (final RequestPriorityPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RequestPriorityPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RequestPriorityPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RequestPriorityPolicyHelper.write (_out,value);
	}
}

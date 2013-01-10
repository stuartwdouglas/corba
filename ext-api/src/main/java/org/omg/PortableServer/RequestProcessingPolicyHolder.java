package org.omg.PortableServer;

/**
 * Generated from IDL interface "RequestProcessingPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:11 AM
 */

public final class RequestProcessingPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public RequestProcessingPolicy value;
	public RequestProcessingPolicyHolder()
	{
	}
	public RequestProcessingPolicyHolder (final RequestProcessingPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RequestProcessingPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RequestProcessingPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RequestProcessingPolicyHelper.write (_out,value);
	}
}

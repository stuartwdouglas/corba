package org.omg.PortableServer;
/**
 * Generated from IDL enum "RequestProcessingPolicyValue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class RequestProcessingPolicyValueHolder
	implements org.omg.CORBA.portable.Streamable
{
	public RequestProcessingPolicyValue value;

	public RequestProcessingPolicyValueHolder ()
	{
	}
	public RequestProcessingPolicyValueHolder (final RequestProcessingPolicyValue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RequestProcessingPolicyValueHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RequestProcessingPolicyValueHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RequestProcessingPolicyValueHelper.write (out,value);
	}
}

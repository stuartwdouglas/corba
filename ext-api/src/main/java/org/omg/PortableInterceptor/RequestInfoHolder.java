package org.omg.PortableInterceptor;

/**
 * Generated from IDL interface "RequestInfo".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class RequestInfoHolder	implements org.omg.CORBA.portable.Streamable{
	 public RequestInfo value;
	public RequestInfoHolder()
	{
	}
	public RequestInfoHolder (final RequestInfo initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RequestInfoHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RequestInfoHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RequestInfoHelper.write (_out,value);
	}
}
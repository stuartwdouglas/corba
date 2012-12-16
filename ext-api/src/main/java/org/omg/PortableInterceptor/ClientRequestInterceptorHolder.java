package org.omg.PortableInterceptor;

/**
 * Generated from IDL interface "ClientRequestInterceptor".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class ClientRequestInterceptorHolder	implements org.omg.CORBA.portable.Streamable{
	 public ClientRequestInterceptor value;
	public ClientRequestInterceptorHolder()
	{
	}
	public ClientRequestInterceptorHolder (final ClientRequestInterceptor initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ClientRequestInterceptorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ClientRequestInterceptorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ClientRequestInterceptorHelper.write (_out,value);
	}
}

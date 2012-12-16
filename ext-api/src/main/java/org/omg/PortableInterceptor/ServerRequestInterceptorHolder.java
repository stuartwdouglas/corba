package org.omg.PortableInterceptor;

/**
 * Generated from IDL interface "ServerRequestInterceptor".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class ServerRequestInterceptorHolder	implements org.omg.CORBA.portable.Streamable{
	 public ServerRequestInterceptor value;
	public ServerRequestInterceptorHolder()
	{
	}
	public ServerRequestInterceptorHolder (final ServerRequestInterceptor initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ServerRequestInterceptorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServerRequestInterceptorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ServerRequestInterceptorHelper.write (_out,value);
	}
}

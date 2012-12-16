package org.omg.PortableInterceptor;

/**
 * Generated from IDL interface "Interceptor".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class InterceptorHolder	implements org.omg.CORBA.portable.Streamable{
	 public Interceptor value;
	public InterceptorHolder()
	{
	}
	public InterceptorHolder (final Interceptor initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return InterceptorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = InterceptorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		InterceptorHelper.write (_out,value);
	}
}

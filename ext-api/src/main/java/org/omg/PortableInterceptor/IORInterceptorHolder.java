package org.omg.PortableInterceptor;

/**
 * Generated from IDL interface "IORInterceptor".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class IORInterceptorHolder	implements org.omg.CORBA.portable.Streamable{
	 public IORInterceptor value;
	public IORInterceptorHolder()
	{
	}
	public IORInterceptorHolder (final IORInterceptor initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return IORInterceptorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IORInterceptorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		IORInterceptorHelper.write (_out,value);
	}
}

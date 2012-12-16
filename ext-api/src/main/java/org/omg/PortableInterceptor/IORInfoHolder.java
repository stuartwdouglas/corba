package org.omg.PortableInterceptor;

/**
 * Generated from IDL interface "IORInfo".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class IORInfoHolder	implements org.omg.CORBA.portable.Streamable{
	 public IORInfo value;
	public IORInfoHolder()
	{
	}
	public IORInfoHolder (final IORInfo initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return IORInfoHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IORInfoHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		IORInfoHelper.write (_out,value);
	}
}

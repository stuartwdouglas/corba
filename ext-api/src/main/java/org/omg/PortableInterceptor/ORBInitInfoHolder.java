package org.omg.PortableInterceptor;

/**
 * Generated from IDL interface "ORBInitInfo".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class ORBInitInfoHolder	implements org.omg.CORBA.portable.Streamable{
	 public ORBInitInfo value;
	public ORBInitInfoHolder()
	{
	}
	public ORBInitInfoHolder (final ORBInitInfo initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ORBInitInfoHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ORBInitInfoHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ORBInitInfoHelper.write (_out,value);
	}
}

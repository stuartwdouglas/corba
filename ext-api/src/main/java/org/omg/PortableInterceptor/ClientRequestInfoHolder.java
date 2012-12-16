package org.omg.PortableInterceptor;

/**
 * Generated from IDL interface "ClientRequestInfo".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class ClientRequestInfoHolder	implements org.omg.CORBA.portable.Streamable{
	 public ClientRequestInfo value;
	public ClientRequestInfoHolder()
	{
	}
	public ClientRequestInfoHolder (final ClientRequestInfo initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ClientRequestInfoHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ClientRequestInfoHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ClientRequestInfoHelper.write (_out,value);
	}
}

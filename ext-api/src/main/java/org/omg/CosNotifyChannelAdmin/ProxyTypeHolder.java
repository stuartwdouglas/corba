package org.omg.CosNotifyChannelAdmin;
/**
 * Generated from IDL enum "ProxyType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class ProxyTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ProxyType value;

	public ProxyTypeHolder ()
	{
	}
	public ProxyTypeHolder (final ProxyType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProxyTypeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProxyTypeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ProxyTypeHelper.write (out,value);
	}
}

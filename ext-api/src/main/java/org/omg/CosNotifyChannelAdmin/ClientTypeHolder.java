package org.omg.CosNotifyChannelAdmin;
/**
 * Generated from IDL enum "ClientType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class ClientTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ClientType value;

	public ClientTypeHolder ()
	{
	}
	public ClientTypeHolder (final ClientType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ClientTypeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ClientTypeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ClientTypeHelper.write (out,value);
	}
}

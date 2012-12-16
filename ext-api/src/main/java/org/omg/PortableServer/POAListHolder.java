package org.omg.PortableServer;

/**
 * Generated from IDL alias "POAList".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class POAListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.PortableServer.POA[] value;

	public POAListHolder ()
	{
	}
	public POAListHolder (final org.omg.PortableServer.POA[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return POAListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = POAListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		POAListHelper.write (out,value);
	}
}

package org.omg.IIOP;

/**
 * Generated from IDL alias "ListenPointList".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class ListenPointListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.IIOP.ListenPoint[] value;

	public ListenPointListHolder ()
	{
	}
	public ListenPointListHolder (final org.omg.IIOP.ListenPoint[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ListenPointListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ListenPointListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ListenPointListHelper.write (out,value);
	}
}

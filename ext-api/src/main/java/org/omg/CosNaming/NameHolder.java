package org.omg.CosNaming;

/**
 * Generated from IDL alias "Name".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:39 PM
 */

public final class NameHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNaming.NameComponent[] value;

	public NameHolder ()
	{
	}
	public NameHolder (final org.omg.CosNaming.NameComponent[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NameHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NameHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NameHelper.write (out,value);
	}
}

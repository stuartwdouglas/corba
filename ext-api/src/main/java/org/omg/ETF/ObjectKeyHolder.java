package org.omg.ETF;

/**
 * Generated from IDL alias "ObjectKey".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class ObjectKeyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public byte[] value;

	public ObjectKeyHolder ()
	{
	}
	public ObjectKeyHolder (final byte[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ObjectKeyHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ObjectKeyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ObjectKeyHelper.write (out,value);
	}
}

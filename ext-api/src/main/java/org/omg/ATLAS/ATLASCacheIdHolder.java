package org.omg.ATLAS;

/**
 * Generated from IDL alias "ATLASCacheId".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:41 PM
 */

public final class ATLASCacheIdHolder
	implements org.omg.CORBA.portable.Streamable
{
	public byte[] value;

	public ATLASCacheIdHolder ()
	{
	}
	public ATLASCacheIdHolder (final byte[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ATLASCacheIdHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ATLASCacheIdHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ATLASCacheIdHelper.write (out,value);
	}
}

package org.omg.CSI;

/**
 * Generated from IDL alias "X501DistinguishedName".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class X501DistinguishedNameHolder
	implements org.omg.CORBA.portable.Streamable
{
	public byte[] value;

	public X501DistinguishedNameHolder ()
	{
	}
	public X501DistinguishedNameHolder (final byte[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return X501DistinguishedNameHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = X501DistinguishedNameHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		X501DistinguishedNameHelper.write (out,value);
	}
}

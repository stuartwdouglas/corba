package org.omg.CSI;

/**
 * Generated from IDL alias "IdentityExtension".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class IdentityExtensionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public byte[] value;

	public IdentityExtensionHolder ()
	{
	}
	public IdentityExtensionHolder (final byte[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return IdentityExtensionHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IdentityExtensionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		IdentityExtensionHelper.write (out,value);
	}
}

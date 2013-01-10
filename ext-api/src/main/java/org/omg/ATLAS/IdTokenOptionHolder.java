package org.omg.ATLAS;

/**
 * Generated from IDL alias "IdTokenOption".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class IdTokenOptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CSI.IdentityToken[] value;

	public IdTokenOptionHolder ()
	{
	}
	public IdTokenOptionHolder (final org.omg.CSI.IdentityToken[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return IdTokenOptionHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IdTokenOptionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		IdTokenOptionHelper.write (out,value);
	}
}

package org.omg.GSSUP;

/**
 * Generated from IDL struct "InitialContextToken".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:41 PM
 */

public final class InitialContextTokenHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.GSSUP.InitialContextToken value;

	public InitialContextTokenHolder ()
	{
	}
	public InitialContextTokenHolder(final org.omg.GSSUP.InitialContextToken initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.GSSUP.InitialContextTokenHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.GSSUP.InitialContextTokenHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.GSSUP.InitialContextTokenHelper.write(_out, value);
	}
}

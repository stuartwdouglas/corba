package org.omg.CORBA;

/**
 * Generated from IDL alias "InitializerSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class InitializerSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.Initializer[] value;

	public InitializerSeqHolder ()
	{
	}
	public InitializerSeqHolder (final org.omg.CORBA.Initializer[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return InitializerSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = InitializerSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		InitializerSeqHelper.write (out,value);
	}
}

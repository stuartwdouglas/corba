package org.omg.CosCollection;

/**
 * Generated from IDL alias "AnySequence".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class AnySequenceHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.Any[] value;

	public AnySequenceHolder ()
	{
	}
	public AnySequenceHolder (final org.omg.CORBA.Any[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AnySequenceHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AnySequenceHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AnySequenceHelper.write (out,value);
	}
}

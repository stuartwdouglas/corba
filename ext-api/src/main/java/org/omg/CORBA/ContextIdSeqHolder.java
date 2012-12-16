package org.omg.CORBA;

/**
 * Generated from IDL alias "ContextIdSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class ContextIdSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public ContextIdSeqHolder ()
	{
	}
	public ContextIdSeqHolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ContextIdSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ContextIdSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ContextIdSeqHelper.write (out,value);
	}
}

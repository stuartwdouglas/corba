package org.omg.dds;

/**
 * Generated from IDL alias "ViewStateSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class ViewStateSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public ViewStateSeqHolder ()
	{
	}
	public ViewStateSeqHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ViewStateSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ViewStateSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ViewStateSeqHelper.write (out,value);
	}
}

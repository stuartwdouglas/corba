package org.omg.CosBridgeAdmin;

/**
 * Generated from IDL alias "BridgeIDSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public final class BridgeIDSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public BridgeIDSeqHolder ()
	{
	}
	public BridgeIDSeqHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return BridgeIDSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BridgeIDSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		BridgeIDSeqHelper.write (out,value);
	}
}
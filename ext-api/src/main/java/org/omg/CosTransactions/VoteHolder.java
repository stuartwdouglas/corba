package org.omg.CosTransactions;
/**
 * Generated from IDL enum "Vote".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public final class VoteHolder
	implements org.omg.CORBA.portable.Streamable
{
	public Vote value;

	public VoteHolder ()
	{
	}
	public VoteHolder (final Vote initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return VoteHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = VoteHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		VoteHelper.write (out,value);
	}
}

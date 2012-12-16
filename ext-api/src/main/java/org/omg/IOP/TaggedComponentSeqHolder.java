package org.omg.IOP;

/**
 * Generated from IDL alias "TaggedComponentSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class TaggedComponentSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.IOP.TaggedComponent[] value;

	public TaggedComponentSeqHolder ()
	{
	}
	public TaggedComponentSeqHolder (final org.omg.IOP.TaggedComponent[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TaggedComponentSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TaggedComponentSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TaggedComponentSeqHelper.write (out,value);
	}
}

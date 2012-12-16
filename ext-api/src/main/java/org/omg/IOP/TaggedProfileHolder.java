package org.omg.IOP;

/**
 * Generated from IDL struct "TaggedProfile".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class TaggedProfileHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.IOP.TaggedProfile value;

	public TaggedProfileHolder ()
	{
	}
	public TaggedProfileHolder(final org.omg.IOP.TaggedProfile initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.IOP.TaggedProfileHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.IOP.TaggedProfileHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.IOP.TaggedProfileHelper.write(_out, value);
	}
}

package org.omg.IOP;

/**
 * Generated from IDL struct "TaggedComponent".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class TaggedComponentHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.IOP.TaggedComponent value;

	public TaggedComponentHolder ()
	{
	}
	public TaggedComponentHolder(final org.omg.IOP.TaggedComponent initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.IOP.TaggedComponentHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.IOP.TaggedComponentHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.IOP.TaggedComponentHelper.write(_out, value);
	}
}

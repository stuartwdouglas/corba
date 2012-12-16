package org.omg.IOP;

/**
 * Generated from IDL alias "MultipleComponentProfile".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class MultipleComponentProfileHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.IOP.TaggedComponent[] value;

	public MultipleComponentProfileHolder ()
	{
	}
	public MultipleComponentProfileHolder (final org.omg.IOP.TaggedComponent[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MultipleComponentProfileHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MultipleComponentProfileHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MultipleComponentProfileHelper.write (out,value);
	}
}

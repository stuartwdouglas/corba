package org.omg.CosCollection;
/**
 * Generated from IDL enum "UpperBoundStyle".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class UpperBoundStyleHolder
	implements org.omg.CORBA.portable.Streamable
{
	public UpperBoundStyle value;

	public UpperBoundStyleHolder ()
	{
	}
	public UpperBoundStyleHolder (final UpperBoundStyle initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return UpperBoundStyleHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = UpperBoundStyleHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		UpperBoundStyleHelper.write (out,value);
	}
}

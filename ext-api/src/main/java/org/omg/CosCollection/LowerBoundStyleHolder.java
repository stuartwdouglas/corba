package org.omg.CosCollection;
/**
 * Generated from IDL enum "LowerBoundStyle".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class LowerBoundStyleHolder
	implements org.omg.CORBA.portable.Streamable
{
	public LowerBoundStyle value;

	public LowerBoundStyleHolder ()
	{
	}
	public LowerBoundStyleHolder (final LowerBoundStyle initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LowerBoundStyleHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LowerBoundStyleHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		LowerBoundStyleHelper.write (out,value);
	}
}

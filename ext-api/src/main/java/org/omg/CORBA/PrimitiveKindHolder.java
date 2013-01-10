package org.omg.CORBA;
/**
 * Generated from IDL enum "PrimitiveKind".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class PrimitiveKindHolder
	implements org.omg.CORBA.portable.Streamable
{
	public PrimitiveKind value;

	public PrimitiveKindHolder ()
	{
	}
	public PrimitiveKindHolder (final PrimitiveKind initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PrimitiveKindHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PrimitiveKindHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PrimitiveKindHelper.write (out,value);
	}
}

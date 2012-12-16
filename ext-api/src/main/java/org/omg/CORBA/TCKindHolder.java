package org.omg.CORBA;
/**
 * Generated from IDL enum "TCKind".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class TCKindHolder
	implements org.omg.CORBA.portable.Streamable
{
	public TCKind value;

	public TCKindHolder ()
	{
	}
	public TCKindHolder (final TCKind initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TCKindHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TCKindHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TCKindHelper.write (out,value);
	}
}

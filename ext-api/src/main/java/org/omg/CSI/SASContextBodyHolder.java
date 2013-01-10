package org.omg.CSI;
/**
 * Generated from IDL union "SASContextBody".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class SASContextBodyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public SASContextBody value;

	public SASContextBodyHolder ()
	{
	}
	public SASContextBodyHolder (final SASContextBody initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SASContextBodyHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SASContextBodyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SASContextBodyHelper.write (out, value);
	}
}

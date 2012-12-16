package org.omg.CosTransactions;
/**
 * Generated from IDL enum "Status".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public final class StatusHolder
	implements org.omg.CORBA.portable.Streamable
{
	public Status value;

	public StatusHolder ()
	{
	}
	public StatusHolder (final Status initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return StatusHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StatusHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		StatusHelper.write (out,value);
	}
}

package org.omg.GIOP;
/**
 * Generated from IDL union "TargetAddress".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class TargetAddressHolder
	implements org.omg.CORBA.portable.Streamable
{
	public TargetAddress value;

	public TargetAddressHolder ()
	{
	}
	public TargetAddressHolder (final TargetAddress initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TargetAddressHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TargetAddressHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TargetAddressHelper.write (out, value);
	}
}

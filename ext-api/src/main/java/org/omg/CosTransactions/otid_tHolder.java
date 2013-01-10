package org.omg.CosTransactions;

/**
 * Generated from IDL struct "otid_t".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public final class otid_tHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTransactions.otid_t value;

	public otid_tHolder ()
	{
	}
	public otid_tHolder(final org.omg.CosTransactions.otid_t initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTransactions.otid_tHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTransactions.otid_tHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTransactions.otid_tHelper.write(_out, value);
	}
}

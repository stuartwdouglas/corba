package org.omg.CosTransactions;

/**
 * Generated from IDL struct "TransIdentity".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public final class TransIdentityHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTransactions.TransIdentity value;

	public TransIdentityHolder ()
	{
	}
	public TransIdentityHolder(final org.omg.CosTransactions.TransIdentity initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTransactions.TransIdentityHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTransactions.TransIdentityHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTransactions.TransIdentityHelper.write(_out, value);
	}
}

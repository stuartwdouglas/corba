package org.omg.CosTransactions;

/**
 * Generated from IDL struct "PropagationContext".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public final class PropagationContextHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTransactions.PropagationContext value;

	public PropagationContextHolder ()
	{
	}
	public PropagationContextHolder(final org.omg.CosTransactions.PropagationContext initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTransactions.PropagationContextHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTransactions.PropagationContextHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTransactions.PropagationContextHelper.write(_out, value);
	}
}

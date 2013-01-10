package org.omg.CosTransactions;

/**
 * Generated from IDL interface "Terminator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public final class TerminatorHolder	implements org.omg.CORBA.portable.Streamable{
	 public Terminator value;
	public TerminatorHolder()
	{
	}
	public TerminatorHolder (final Terminator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TerminatorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TerminatorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TerminatorHelper.write (_out,value);
	}
}

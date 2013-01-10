package org.omg.CSIIOP;

/**
 * Generated from IDL struct "SAS_ContextSec".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class SAS_ContextSecHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CSIIOP.SAS_ContextSec value;

	public SAS_ContextSecHolder ()
	{
	}
	public SAS_ContextSecHolder(final org.omg.CSIIOP.SAS_ContextSec initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CSIIOP.SAS_ContextSecHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CSIIOP.SAS_ContextSecHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CSIIOP.SAS_ContextSecHelper.write(_out, value);
	}
}

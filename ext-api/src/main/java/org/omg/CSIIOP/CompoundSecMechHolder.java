package org.omg.CSIIOP;

/**
 * Generated from IDL struct "CompoundSecMech".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class CompoundSecMechHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CSIIOP.CompoundSecMech value;

	public CompoundSecMechHolder ()
	{
	}
	public CompoundSecMechHolder(final org.omg.CSIIOP.CompoundSecMech initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CSIIOP.CompoundSecMechHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CSIIOP.CompoundSecMechHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CSIIOP.CompoundSecMechHelper.write(_out, value);
	}
}

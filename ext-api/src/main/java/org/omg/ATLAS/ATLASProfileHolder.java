package org.omg.ATLAS;

/**
 * Generated from IDL struct "ATLASProfile".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class ATLASProfileHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.ATLAS.ATLASProfile value;

	public ATLASProfileHolder ()
	{
	}
	public ATLASProfileHolder(final org.omg.ATLAS.ATLASProfile initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.ATLAS.ATLASProfileHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.ATLAS.ATLASProfileHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.ATLAS.ATLASProfileHelper.write(_out, value);
	}
}

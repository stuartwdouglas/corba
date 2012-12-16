package org.omg.TimeBase;

/**
 * Generated from IDL struct "IntervalT".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class IntervalTHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.TimeBase.IntervalT value;

	public IntervalTHolder ()
	{
	}
	public IntervalTHolder(final org.omg.TimeBase.IntervalT initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.TimeBase.IntervalTHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.TimeBase.IntervalTHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.TimeBase.IntervalTHelper.write(_out, value);
	}
}

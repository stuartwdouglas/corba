package org.omg.CosNotifyFilter;

/**
 * Generated from IDL struct "ConstraintExp".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class ConstraintExpHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotifyFilter.ConstraintExp value;

	public ConstraintExpHolder ()
	{
	}
	public ConstraintExpHolder(final org.omg.CosNotifyFilter.ConstraintExp initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotifyFilter.ConstraintExpHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotifyFilter.ConstraintExpHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotifyFilter.ConstraintExpHelper.write(_out, value);
	}
}

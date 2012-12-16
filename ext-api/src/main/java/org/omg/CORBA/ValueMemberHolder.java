package org.omg.CORBA;

/**
 * Generated from IDL struct "ValueMember".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class ValueMemberHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ValueMember value;

	public ValueMemberHolder ()
	{
	}
	public ValueMemberHolder(final org.omg.CORBA.ValueMember initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CORBA.ValueMemberHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CORBA.ValueMemberHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CORBA.ValueMemberHelper.write(_out, value);
	}
}

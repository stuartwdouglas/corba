package org.omg.CORBA;

/**
 * Generated from IDL alias "ValueMemberSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class ValueMemberSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ValueMember[] value;

	public ValueMemberSeqHolder ()
	{
	}
	public ValueMemberSeqHolder (final org.omg.CORBA.ValueMember[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ValueMemberSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ValueMemberSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ValueMemberSeqHelper.write (out,value);
	}
}

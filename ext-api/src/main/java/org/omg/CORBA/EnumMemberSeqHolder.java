package org.omg.CORBA;

/**
 * Generated from IDL alias "EnumMemberSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class EnumMemberSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public EnumMemberSeqHolder ()
	{
	}
	public EnumMemberSeqHolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EnumMemberSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EnumMemberSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EnumMemberSeqHelper.write (out,value);
	}
}

package org.omg.CORBA;

/**
 * Generated from IDL alias "StructMemberSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class StructMemberSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.StructMember[] value;

	public StructMemberSeqHolder ()
	{
	}
	public StructMemberSeqHolder (final org.omg.CORBA.StructMember[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return StructMemberSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StructMemberSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		StructMemberSeqHelper.write (out,value);
	}
}

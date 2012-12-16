package org.omg.CORBA;

/**
 * Generated from IDL alias "RepositoryIdSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class RepositoryIdSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public RepositoryIdSeqHolder ()
	{
	}
	public RepositoryIdSeqHolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RepositoryIdSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RepositoryIdSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RepositoryIdSeqHelper.write (out,value);
	}
}

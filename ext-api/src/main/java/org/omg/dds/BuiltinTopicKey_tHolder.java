package org.omg.dds;

public final class BuiltinTopicKey_tHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;
	public BuiltinTopicKey_tHolder ()
	{
	}
	public BuiltinTopicKey_tHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return BuiltinTopicKey_tHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = BuiltinTopicKey_tHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		BuiltinTopicKey_tHelper.write (_out,value);
	}
}

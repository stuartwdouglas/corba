package org.omg.CosCollection;

/**
 * Generated from IDL interface "CSequence".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class CSequenceHolder	implements org.omg.CORBA.portable.Streamable{
	 public CSequence value;
	public CSequenceHolder()
	{
	}
	public CSequenceHolder (final CSequence initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CSequenceHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CSequenceHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CSequenceHelper.write (_out,value);
	}
}

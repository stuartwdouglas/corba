package org.omg.CosCollection;

/**
 * Generated from IDL interface "EqualitySequence".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class EqualitySequenceHolder	implements org.omg.CORBA.portable.Streamable{
	 public EqualitySequence value;
	public EqualitySequenceHolder()
	{
	}
	public EqualitySequenceHolder (final EqualitySequence initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EqualitySequenceHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EqualitySequenceHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EqualitySequenceHelper.write (_out,value);
	}
}

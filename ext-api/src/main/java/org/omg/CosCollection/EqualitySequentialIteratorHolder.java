package org.omg.CosCollection;

/**
 * Generated from IDL interface "EqualitySequentialIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class EqualitySequentialIteratorHolder	implements org.omg.CORBA.portable.Streamable{
	 public EqualitySequentialIterator value;
	public EqualitySequentialIteratorHolder()
	{
	}
	public EqualitySequentialIteratorHolder (final EqualitySequentialIterator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EqualitySequentialIteratorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EqualitySequentialIteratorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EqualitySequentialIteratorHelper.write (_out,value);
	}
}

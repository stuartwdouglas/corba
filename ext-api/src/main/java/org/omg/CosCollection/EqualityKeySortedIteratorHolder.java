package org.omg.CosCollection;

/**
 * Generated from IDL interface "EqualityKeySortedIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class EqualityKeySortedIteratorHolder	implements org.omg.CORBA.portable.Streamable{
	 public EqualityKeySortedIterator value;
	public EqualityKeySortedIteratorHolder()
	{
	}
	public EqualityKeySortedIteratorHolder (final EqualityKeySortedIterator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EqualityKeySortedIteratorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EqualityKeySortedIteratorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EqualityKeySortedIteratorHelper.write (_out,value);
	}
}
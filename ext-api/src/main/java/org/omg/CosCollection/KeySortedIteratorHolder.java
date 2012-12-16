package org.omg.CosCollection;

/**
 * Generated from IDL interface "KeySortedIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class KeySortedIteratorHolder	implements org.omg.CORBA.portable.Streamable{
	 public KeySortedIterator value;
	public KeySortedIteratorHolder()
	{
	}
	public KeySortedIteratorHolder (final KeySortedIterator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return KeySortedIteratorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = KeySortedIteratorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		KeySortedIteratorHelper.write (_out,value);
	}
}

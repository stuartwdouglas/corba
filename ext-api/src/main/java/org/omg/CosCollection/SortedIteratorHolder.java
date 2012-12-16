package org.omg.CosCollection;

/**
 * Generated from IDL interface "SortedIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class SortedIteratorHolder	implements org.omg.CORBA.portable.Streamable{
	 public SortedIterator value;
	public SortedIteratorHolder()
	{
	}
	public SortedIteratorHolder (final SortedIterator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SortedIteratorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SortedIteratorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SortedIteratorHelper.write (_out,value);
	}
}

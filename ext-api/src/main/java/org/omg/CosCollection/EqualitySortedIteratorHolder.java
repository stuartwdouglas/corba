package org.omg.CosCollection;

/**
 * Generated from IDL interface "EqualitySortedIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class EqualitySortedIteratorHolder	implements org.omg.CORBA.portable.Streamable{
	 public EqualitySortedIterator value;
	public EqualitySortedIteratorHolder()
	{
	}
	public EqualitySortedIteratorHolder (final EqualitySortedIterator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EqualitySortedIteratorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EqualitySortedIteratorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EqualitySortedIteratorHelper.write (_out,value);
	}
}

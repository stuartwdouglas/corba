package org.omg.CosCollection;

/**
 * Generated from IDL interface "OrderedIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class OrderedIteratorHolder	implements org.omg.CORBA.portable.Streamable{
	 public OrderedIterator value;
	public OrderedIteratorHolder()
	{
	}
	public OrderedIteratorHolder (final OrderedIterator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return OrderedIteratorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = OrderedIteratorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		OrderedIteratorHelper.write (_out,value);
	}
}

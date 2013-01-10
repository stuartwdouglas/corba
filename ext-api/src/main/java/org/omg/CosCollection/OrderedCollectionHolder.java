package org.omg.CosCollection;

/**
 * Generated from IDL interface "OrderedCollection".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class OrderedCollectionHolder	implements org.omg.CORBA.portable.Streamable{
	 public OrderedCollection value;
	public OrderedCollectionHolder()
	{
	}
	public OrderedCollectionHolder (final OrderedCollection initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return OrderedCollectionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = OrderedCollectionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		OrderedCollectionHelper.write (_out,value);
	}
}

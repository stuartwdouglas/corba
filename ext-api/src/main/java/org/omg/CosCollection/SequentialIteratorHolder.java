package org.omg.CosCollection;

/**
 * Generated from IDL interface "SequentialIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class SequentialIteratorHolder	implements org.omg.CORBA.portable.Streamable{
	 public SequentialIterator value;
	public SequentialIteratorHolder()
	{
	}
	public SequentialIteratorHolder (final SequentialIterator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SequentialIteratorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequentialIteratorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SequentialIteratorHelper.write (_out,value);
	}
}

package org.omg.CosCollection;

/**
 * Generated from IDL interface "EqualityKeyIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class EqualityKeyIteratorHolder	implements org.omg.CORBA.portable.Streamable{
	 public EqualityKeyIterator value;
	public EqualityKeyIteratorHolder()
	{
	}
	public EqualityKeyIteratorHolder (final EqualityKeyIterator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EqualityKeyIteratorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EqualityKeyIteratorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EqualityKeyIteratorHelper.write (_out,value);
	}
}

package org.omg.CosCollection;

/**
 * Generated from IDL interface "EqualityIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class EqualityIteratorHolder	implements org.omg.CORBA.portable.Streamable{
	 public EqualityIterator value;
	public EqualityIteratorHolder()
	{
	}
	public EqualityIteratorHolder (final EqualityIterator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EqualityIteratorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EqualityIteratorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EqualityIteratorHelper.write (_out,value);
	}
}

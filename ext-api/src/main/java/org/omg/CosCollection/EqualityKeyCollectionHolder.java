package org.omg.CosCollection;

/**
 * Generated from IDL interface "EqualityKeyCollection".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class EqualityKeyCollectionHolder	implements org.omg.CORBA.portable.Streamable{
	 public EqualityKeyCollection value;
	public EqualityKeyCollectionHolder()
	{
	}
	public EqualityKeyCollectionHolder (final EqualityKeyCollection initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EqualityKeyCollectionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EqualityKeyCollectionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EqualityKeyCollectionHelper.write (_out,value);
	}
}

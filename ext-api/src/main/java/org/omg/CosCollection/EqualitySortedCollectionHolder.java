package org.omg.CosCollection;

/**
 * Generated from IDL interface "EqualitySortedCollection".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class EqualitySortedCollectionHolder	implements org.omg.CORBA.portable.Streamable{
	 public EqualitySortedCollection value;
	public EqualitySortedCollectionHolder()
	{
	}
	public EqualitySortedCollectionHolder (final EqualitySortedCollection initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EqualitySortedCollectionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EqualitySortedCollectionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EqualitySortedCollectionHelper.write (_out,value);
	}
}

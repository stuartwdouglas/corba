package org.omg.CosCollection;

/**
 * Generated from IDL interface "KeySortedCollection".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class KeySortedCollectionHolder	implements org.omg.CORBA.portable.Streamable{
	 public KeySortedCollection value;
	public KeySortedCollectionHolder()
	{
	}
	public KeySortedCollectionHolder (final KeySortedCollection initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return KeySortedCollectionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = KeySortedCollectionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		KeySortedCollectionHelper.write (_out,value);
	}
}

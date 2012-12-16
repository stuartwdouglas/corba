package org.omg.CosCollection;

/**
 * Generated from IDL interface "KeySortedSetFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class KeySortedSetFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public KeySortedSetFactory value;
	public KeySortedSetFactoryHolder()
	{
	}
	public KeySortedSetFactoryHolder (final KeySortedSetFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return KeySortedSetFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = KeySortedSetFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		KeySortedSetFactoryHelper.write (_out,value);
	}
}

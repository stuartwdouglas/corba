package org.omg.CosCollection;

/**
 * Generated from IDL interface "KeySortedSet".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class KeySortedSetHolder	implements org.omg.CORBA.portable.Streamable{
	 public KeySortedSet value;
	public KeySortedSetHolder()
	{
	}
	public KeySortedSetHolder (final KeySortedSet initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return KeySortedSetHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = KeySortedSetHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		KeySortedSetHelper.write (_out,value);
	}
}

package org.omg.CosCollection;

/**
 * Generated from IDL interface "KeySetFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class KeySetFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public KeySetFactory value;
	public KeySetFactoryHolder()
	{
	}
	public KeySetFactoryHolder (final KeySetFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return KeySetFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = KeySetFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		KeySetFactoryHelper.write (_out,value);
	}
}

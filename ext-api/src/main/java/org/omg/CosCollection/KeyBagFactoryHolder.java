package org.omg.CosCollection;

/**
 * Generated from IDL interface "KeyBagFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class KeyBagFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public KeyBagFactory value;
	public KeyBagFactoryHolder()
	{
	}
	public KeyBagFactoryHolder (final KeyBagFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return KeyBagFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = KeyBagFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		KeyBagFactoryHelper.write (_out,value);
	}
}

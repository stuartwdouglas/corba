package org.omg.CosCollection;

/**
 * Generated from IDL interface "KeyBag".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class KeyBagHolder	implements org.omg.CORBA.portable.Streamable{
	 public KeyBag value;
	public KeyBagHolder()
	{
	}
	public KeyBagHolder (final KeyBag initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return KeyBagHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = KeyBagHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		KeyBagHelper.write (_out,value);
	}
}

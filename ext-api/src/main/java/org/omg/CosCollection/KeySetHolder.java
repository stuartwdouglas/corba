package org.omg.CosCollection;

/**
 * Generated from IDL interface "KeySet".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class KeySetHolder	implements org.omg.CORBA.portable.Streamable{
	 public KeySet value;
	public KeySetHolder()
	{
	}
	public KeySetHolder (final KeySet initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return KeySetHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = KeySetHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		KeySetHelper.write (_out,value);
	}
}

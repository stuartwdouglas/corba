package org.omg.CosCollection;

/**
 * Generated from IDL interface "Deque".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class DequeHolder	implements org.omg.CORBA.portable.Streamable{
	 public Deque value;
	public DequeHolder()
	{
	}
	public DequeHolder (final Deque initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DequeHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DequeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DequeHelper.write (_out,value);
	}
}

package org.omg.CosCollection;

/**
 * Generated from IDL interface "DequeFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class DequeFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public DequeFactory value;
	public DequeFactoryHolder()
	{
	}
	public DequeFactoryHolder (final DequeFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DequeFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DequeFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DequeFactoryHelper.write (_out,value);
	}
}

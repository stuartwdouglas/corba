package org.omg.CosCollection;

/**
 * Generated from IDL interface "EqualitySequentialCollection".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class EqualitySequentialCollectionHolder	implements org.omg.CORBA.portable.Streamable{
	 public EqualitySequentialCollection value;
	public EqualitySequentialCollectionHolder()
	{
	}
	public EqualitySequentialCollectionHolder (final EqualitySequentialCollection initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EqualitySequentialCollectionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EqualitySequentialCollectionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EqualitySequentialCollectionHelper.write (_out,value);
	}
}
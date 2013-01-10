package org.omg.CosCollection;

/**
 * Generated from IDL interface "SequentialCollection".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class SequentialCollectionHolder	implements org.omg.CORBA.portable.Streamable{
	 public SequentialCollection value;
	public SequentialCollectionHolder()
	{
	}
	public SequentialCollectionHolder (final SequentialCollection initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SequentialCollectionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequentialCollectionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SequentialCollectionHelper.write (_out,value);
	}
}

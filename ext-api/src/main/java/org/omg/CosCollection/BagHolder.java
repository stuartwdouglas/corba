package org.omg.CosCollection;

/**
 * Generated from IDL interface "Bag".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class BagHolder	implements org.omg.CORBA.portable.Streamable{
	 public Bag value;
	public BagHolder()
	{
	}
	public BagHolder (final Bag initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return BagHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BagHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		BagHelper.write (_out,value);
	}
}

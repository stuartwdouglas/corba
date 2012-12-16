package org.omg.CosCollection;

/**
 * Generated from IDL interface "SortedBag".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class SortedBagHolder	implements org.omg.CORBA.portable.Streamable{
	 public SortedBag value;
	public SortedBagHolder()
	{
	}
	public SortedBagHolder (final SortedBag initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SortedBagHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SortedBagHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SortedBagHelper.write (_out,value);
	}
}

package org.omg.CosCollection;

/**
 * Generated from IDL interface "SortedMapFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class SortedMapFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public SortedMapFactory value;
	public SortedMapFactoryHolder()
	{
	}
	public SortedMapFactoryHolder (final SortedMapFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SortedMapFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SortedMapFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SortedMapFactoryHelper.write (_out,value);
	}
}

package org.omg.CosCollection;

/**
 * Generated from IDL interface "SortedMap".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class SortedMapHolder	implements org.omg.CORBA.portable.Streamable{
	 public SortedMap value;
	public SortedMapHolder()
	{
	}
	public SortedMapHolder (final SortedMap initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SortedMapHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SortedMapHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SortedMapHelper.write (_out,value);
	}
}

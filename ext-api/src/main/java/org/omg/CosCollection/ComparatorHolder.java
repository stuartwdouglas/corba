package org.omg.CosCollection;

/**
 * Generated from IDL interface "Comparator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class ComparatorHolder	implements org.omg.CORBA.portable.Streamable{
	 public Comparator value;
	public ComparatorHolder()
	{
	}
	public ComparatorHolder (final Comparator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ComparatorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ComparatorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ComparatorHelper.write (_out,value);
	}
}

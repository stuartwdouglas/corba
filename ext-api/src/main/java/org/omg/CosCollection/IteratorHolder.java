package org.omg.CosCollection;

/**
 * Generated from IDL interface "Iterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class IteratorHolder	implements org.omg.CORBA.portable.Streamable{
	 public Iterator value;
	public IteratorHolder()
	{
	}
	public IteratorHolder (final Iterator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return IteratorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IteratorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		IteratorHelper.write (_out,value);
	}
}

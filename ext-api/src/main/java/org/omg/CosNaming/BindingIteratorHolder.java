package org.omg.CosNaming;

/**
 * Generated from IDL interface "BindingIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:39 PM
 */

public final class BindingIteratorHolder	implements org.omg.CORBA.portable.Streamable{
	 public BindingIterator value;
	public BindingIteratorHolder()
	{
	}
	public BindingIteratorHolder (final BindingIterator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return BindingIteratorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BindingIteratorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		BindingIteratorHelper.write (_out,value);
	}
}

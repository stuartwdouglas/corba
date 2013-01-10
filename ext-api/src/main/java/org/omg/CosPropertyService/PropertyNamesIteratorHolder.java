package org.omg.CosPropertyService;

/**
 * Generated from IDL interface "PropertyNamesIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public final class PropertyNamesIteratorHolder	implements org.omg.CORBA.portable.Streamable{
	 public PropertyNamesIterator value;
	public PropertyNamesIteratorHolder()
	{
	}
	public PropertyNamesIteratorHolder (final PropertyNamesIterator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PropertyNamesIteratorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PropertyNamesIteratorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PropertyNamesIteratorHelper.write (_out,value);
	}
}

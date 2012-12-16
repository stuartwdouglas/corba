package org.omg.CosPropertyService;

/**
 * Generated from IDL interface "PropertiesIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public final class PropertiesIteratorHolder	implements org.omg.CORBA.portable.Streamable{
	 public PropertiesIterator value;
	public PropertiesIteratorHolder()
	{
	}
	public PropertiesIteratorHolder (final PropertiesIterator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PropertiesIteratorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PropertiesIteratorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PropertiesIteratorHelper.write (_out,value);
	}
}

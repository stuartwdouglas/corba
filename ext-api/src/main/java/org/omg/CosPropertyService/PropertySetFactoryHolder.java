package org.omg.CosPropertyService;

/**
 * Generated from IDL interface "PropertySetFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public final class PropertySetFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public PropertySetFactory value;
	public PropertySetFactoryHolder()
	{
	}
	public PropertySetFactoryHolder (final PropertySetFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PropertySetFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PropertySetFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PropertySetFactoryHelper.write (_out,value);
	}
}

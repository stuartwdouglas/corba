package org.omg.CosPropertyService;

/**
 * Generated from IDL interface "PropertySetFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
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

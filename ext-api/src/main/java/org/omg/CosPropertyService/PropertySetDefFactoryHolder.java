package org.omg.CosPropertyService;

/**
 * Generated from IDL interface "PropertySetDefFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public final class PropertySetDefFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public PropertySetDefFactory value;
	public PropertySetDefFactoryHolder()
	{
	}
	public PropertySetDefFactoryHolder (final PropertySetDefFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PropertySetDefFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PropertySetDefFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PropertySetDefFactoryHelper.write (_out,value);
	}
}

package org.omg.CosPropertyService;

/**
 * Generated from IDL interface "PropertySet".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public final class PropertySetHolder	implements org.omg.CORBA.portable.Streamable{
	 public PropertySet value;
	public PropertySetHolder()
	{
	}
	public PropertySetHolder (final PropertySet initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PropertySetHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PropertySetHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PropertySetHelper.write (_out,value);
	}
}

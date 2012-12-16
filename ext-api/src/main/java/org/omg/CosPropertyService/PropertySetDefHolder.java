package org.omg.CosPropertyService;

/**
 * Generated from IDL interface "PropertySetDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public final class PropertySetDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public PropertySetDef value;
	public PropertySetDefHolder()
	{
	}
	public PropertySetDefHolder (final PropertySetDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PropertySetDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PropertySetDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PropertySetDefHelper.write (_out,value);
	}
}

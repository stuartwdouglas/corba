package org.omg.CosNotifyFilter;

/**
 * Generated from IDL interface "FilterFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class FilterFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public FilterFactory value;
	public FilterFactoryHolder()
	{
	}
	public FilterFactoryHolder (final FilterFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return FilterFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FilterFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FilterFactoryHelper.write (_out,value);
	}
}

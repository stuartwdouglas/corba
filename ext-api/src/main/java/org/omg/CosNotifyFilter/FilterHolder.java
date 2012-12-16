package org.omg.CosNotifyFilter;

/**
 * Generated from IDL interface "Filter".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class FilterHolder	implements org.omg.CORBA.portable.Streamable{
	 public Filter value;
	public FilterHolder()
	{
	}
	public FilterHolder (final Filter initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return FilterHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FilterHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FilterHelper.write (_out,value);
	}
}

package org.omg.CosNotifyFilter;

/**
 * Generated from IDL interface "FilterAdmin".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class FilterAdminHolder	implements org.omg.CORBA.portable.Streamable{
	 public FilterAdmin value;
	public FilterAdminHolder()
	{
	}
	public FilterAdminHolder (final FilterAdmin initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return FilterAdminHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FilterAdminHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FilterAdminHelper.write (_out,value);
	}
}

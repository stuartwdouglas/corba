package org.omg.CORBA;

/**
 * Generated from IDL interface "WstringDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class WstringDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public WstringDef value;
	public WstringDefHolder()
	{
	}
	public WstringDefHolder (final WstringDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return WstringDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = WstringDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		WstringDefHelper.write (_out,value);
	}
}

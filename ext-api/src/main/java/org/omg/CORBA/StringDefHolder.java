package org.omg.CORBA;

/**
 * Generated from IDL interface "StringDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class StringDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public StringDef value;
	public StringDefHolder()
	{
	}
	public StringDefHolder (final StringDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return StringDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StringDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		StringDefHelper.write (_out,value);
	}
}

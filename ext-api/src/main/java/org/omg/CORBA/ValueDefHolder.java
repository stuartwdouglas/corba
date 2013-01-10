package org.omg.CORBA;

/**
 * Generated from IDL interface "ValueDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class ValueDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public ValueDef value;
	public ValueDefHolder()
	{
	}
	public ValueDefHolder (final ValueDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ValueDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ValueDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ValueDefHelper.write (_out,value);
	}
}

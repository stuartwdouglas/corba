package org.omg.CORBA;

/**
 * Generated from IDL interface "ValueBoxDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class ValueBoxDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public ValueBoxDef value;
	public ValueBoxDefHolder()
	{
	}
	public ValueBoxDefHolder (final ValueBoxDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ValueBoxDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ValueBoxDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ValueBoxDefHelper.write (_out,value);
	}
}

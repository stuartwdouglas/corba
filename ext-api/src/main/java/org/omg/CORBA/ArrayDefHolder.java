package org.omg.CORBA;

/**
 * Generated from IDL interface "ArrayDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class ArrayDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public ArrayDef value;
	public ArrayDefHolder()
	{
	}
	public ArrayDefHolder (final ArrayDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ArrayDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ArrayDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ArrayDefHelper.write (_out,value);
	}
}

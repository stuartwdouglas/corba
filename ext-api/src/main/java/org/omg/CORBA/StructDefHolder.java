package org.omg.CORBA;

/**
 * Generated from IDL interface "StructDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class StructDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public StructDef value;
	public StructDefHolder()
	{
	}
	public StructDefHolder (final StructDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return StructDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StructDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		StructDefHelper.write (_out,value);
	}
}

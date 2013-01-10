package org.omg.CORBA;

/**
 * Generated from IDL interface "EnumDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class EnumDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public EnumDef value;
	public EnumDefHolder()
	{
	}
	public EnumDefHolder (final EnumDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EnumDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EnumDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EnumDefHelper.write (_out,value);
	}
}

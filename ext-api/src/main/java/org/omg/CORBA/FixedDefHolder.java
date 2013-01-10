package org.omg.CORBA;

/**
 * Generated from IDL interface "FixedDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class FixedDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public FixedDef value;
	public FixedDefHolder()
	{
	}
	public FixedDefHolder (final FixedDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return FixedDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FixedDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FixedDefHelper.write (_out,value);
	}
}

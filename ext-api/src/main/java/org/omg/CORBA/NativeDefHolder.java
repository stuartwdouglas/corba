package org.omg.CORBA;

/**
 * Generated from IDL interface "NativeDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class NativeDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public NativeDef value;
	public NativeDefHolder()
	{
	}
	public NativeDefHolder (final NativeDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return NativeDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NativeDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		NativeDefHelper.write (_out,value);
	}
}

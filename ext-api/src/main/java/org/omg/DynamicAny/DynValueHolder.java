package org.omg.DynamicAny;

/**
 * Generated from IDL interface "DynValue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public final class DynValueHolder	implements org.omg.CORBA.portable.Streamable{
	 public DynValue value;
	public DynValueHolder()
	{
	}
	public DynValueHolder (final DynValue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DynValueHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DynValueHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DynValueHelper.write (_out,value);
	}
}

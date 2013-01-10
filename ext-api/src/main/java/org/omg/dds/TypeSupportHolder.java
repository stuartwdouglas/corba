package org.omg.dds;

/**
 * Generated from IDL interface "TypeSupport".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class TypeSupportHolder	implements org.omg.CORBA.portable.Streamable{
	 public TypeSupport value;
	public TypeSupportHolder()
	{
	}
	public TypeSupportHolder (final TypeSupport initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TypeSupportHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TypeSupportHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TypeSupportHelper.write (_out,value);
	}
}

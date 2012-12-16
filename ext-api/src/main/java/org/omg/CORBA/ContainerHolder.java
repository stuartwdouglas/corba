package org.omg.CORBA;

/**
 * Generated from IDL interface "Container".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class ContainerHolder	implements org.omg.CORBA.portable.Streamable{
	 public Container value;
	public ContainerHolder()
	{
	}
	public ContainerHolder (final Container initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ContainerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ContainerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ContainerHelper.write (_out,value);
	}
}

package org.omg.CORBA;

/**
 * Generated from IDL interface "IDLType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class IDLTypeHolder	implements org.omg.CORBA.portable.Streamable{
	 public IDLType value;
	public IDLTypeHolder()
	{
	}
	public IDLTypeHolder (final IDLType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return IDLTypeHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IDLTypeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		IDLTypeHelper.write (_out,value);
	}
}

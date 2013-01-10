package org.omg.CosCollection;

/**
 * Generated from IDL interface "Stack".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class StackHolder	implements org.omg.CORBA.portable.Streamable{
	 public Stack value;
	public StackHolder()
	{
	}
	public StackHolder (final Stack initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return StackHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StackHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		StackHelper.write (_out,value);
	}
}

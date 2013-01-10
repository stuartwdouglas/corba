package org.omg.CORBA;

/**
 * Generated from IDL interface "OperationDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class OperationDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public OperationDef value;
	public OperationDefHolder()
	{
	}
	public OperationDefHolder (final OperationDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return OperationDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = OperationDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		OperationDefHelper.write (_out,value);
	}
}

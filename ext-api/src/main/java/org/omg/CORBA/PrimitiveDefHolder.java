package org.omg.CORBA;

/**
 * Generated from IDL interface "PrimitiveDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class PrimitiveDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public PrimitiveDef value;
	public PrimitiveDefHolder()
	{
	}
	public PrimitiveDefHolder (final PrimitiveDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PrimitiveDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PrimitiveDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PrimitiveDefHelper.write (_out,value);
	}
}

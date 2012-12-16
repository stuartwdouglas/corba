package org.omg.CORBA;

/**
 * Generated from IDL interface "PrimitiveDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
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

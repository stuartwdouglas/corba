package org.omg.CosCollection;

/**
 * Generated from IDL interface "Heap".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class HeapHolder	implements org.omg.CORBA.portable.Streamable{
	 public Heap value;
	public HeapHolder()
	{
	}
	public HeapHolder (final Heap initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HeapHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HeapHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HeapHelper.write (_out,value);
	}
}

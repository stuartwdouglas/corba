package org.omg.CosCollection;

/**
 * Generated from IDL interface "PriorityQueue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class PriorityQueueHolder	implements org.omg.CORBA.portable.Streamable{
	 public PriorityQueue value;
	public PriorityQueueHolder()
	{
	}
	public PriorityQueueHolder (final PriorityQueue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PriorityQueueHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PriorityQueueHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PriorityQueueHelper.write (_out,value);
	}
}

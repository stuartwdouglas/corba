package org.omg.CosCollection;

/**
 * Generated from IDL interface "Queue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class QueueHolder	implements org.omg.CORBA.portable.Streamable{
	 public Queue value;
	public QueueHolder()
	{
	}
	public QueueHolder (final Queue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return QueueHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = QueueHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		QueueHelper.write (_out,value);
	}
}

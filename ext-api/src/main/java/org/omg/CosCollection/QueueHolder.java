package org.omg.CosCollection;

/**
 * Generated from IDL interface "Queue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
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

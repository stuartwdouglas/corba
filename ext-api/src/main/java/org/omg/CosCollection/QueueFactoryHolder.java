package org.omg.CosCollection;

/**
 * Generated from IDL interface "QueueFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class QueueFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public QueueFactory value;
	public QueueFactoryHolder()
	{
	}
	public QueueFactoryHolder (final QueueFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return QueueFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = QueueFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		QueueFactoryHelper.write (_out,value);
	}
}

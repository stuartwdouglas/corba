package org.omg.Messaging;

/**
 * Generated from IDL interface "QueueOrderPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class QueueOrderPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public QueueOrderPolicy value;
	public QueueOrderPolicyHolder()
	{
	}
	public QueueOrderPolicyHolder (final QueueOrderPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return QueueOrderPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = QueueOrderPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		QueueOrderPolicyHelper.write (_out,value);
	}
}

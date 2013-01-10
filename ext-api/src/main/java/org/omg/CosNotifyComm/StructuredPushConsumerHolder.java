package org.omg.CosNotifyComm;

/**
 * Generated from IDL interface "StructuredPushConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class StructuredPushConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public StructuredPushConsumer value;
	public StructuredPushConsumerHolder()
	{
	}
	public StructuredPushConsumerHolder (final StructuredPushConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return StructuredPushConsumerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StructuredPushConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		StructuredPushConsumerHelper.write (_out,value);
	}
}

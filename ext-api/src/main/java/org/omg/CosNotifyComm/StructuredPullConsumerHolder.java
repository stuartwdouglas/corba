package org.omg.CosNotifyComm;

/**
 * Generated from IDL interface "StructuredPullConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class StructuredPullConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public StructuredPullConsumer value;
	public StructuredPullConsumerHolder()
	{
	}
	public StructuredPullConsumerHolder (final StructuredPullConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return StructuredPullConsumerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StructuredPullConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		StructuredPullConsumerHelper.write (_out,value);
	}
}

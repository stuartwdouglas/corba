package org.omg.CosNotifyComm;

/**
 * Generated from IDL interface "PullConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class PullConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public PullConsumer value;
	public PullConsumerHolder()
	{
	}
	public PullConsumerHolder (final PullConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PullConsumerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PullConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PullConsumerHelper.write (_out,value);
	}
}

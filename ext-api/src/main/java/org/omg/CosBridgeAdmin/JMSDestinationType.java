package org.omg.CosBridgeAdmin;
/**
 * Generated from IDL enum "JMSDestinationType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class JMSDestinationType
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _QUEUE = 0;
	public static final JMSDestinationType QUEUE = new JMSDestinationType(_QUEUE);
	public static final int _TOPIC = 1;
	public static final JMSDestinationType TOPIC = new JMSDestinationType(_TOPIC);
	public int value()
	{
		return value;
	}
	public static JMSDestinationType from_int(int value)
	{
		switch (value) {
			case _QUEUE: return QUEUE;
			case _TOPIC: return TOPIC;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _QUEUE: return "QUEUE";
			case _TOPIC: return "TOPIC";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected JMSDestinationType(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}

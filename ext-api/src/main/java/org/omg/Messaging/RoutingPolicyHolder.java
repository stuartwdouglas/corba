package org.omg.Messaging;

/**
 * Generated from IDL interface "RoutingPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class RoutingPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public RoutingPolicy value;
	public RoutingPolicyHolder()
	{
	}
	public RoutingPolicyHolder (final RoutingPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RoutingPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RoutingPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RoutingPolicyHelper.write (_out,value);
	}
}

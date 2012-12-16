package org.omg.Messaging;

/**
 * Generated from IDL interface "RebindPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class RebindPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public RebindPolicy value;
	public RebindPolicyHolder()
	{
	}
	public RebindPolicyHolder (final RebindPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RebindPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RebindPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RebindPolicyHelper.write (_out,value);
	}
}

package org.omg.PortableServer;

/**
 * Generated from IDL interface "LifespanPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class LifespanPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public LifespanPolicy value;
	public LifespanPolicyHolder()
	{
	}
	public LifespanPolicyHolder (final LifespanPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return LifespanPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LifespanPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		LifespanPolicyHelper.write (_out,value);
	}
}

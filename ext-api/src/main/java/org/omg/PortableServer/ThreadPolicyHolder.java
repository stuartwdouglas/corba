package org.omg.PortableServer;

/**
 * Generated from IDL interface "ThreadPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class ThreadPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public ThreadPolicy value;
	public ThreadPolicyHolder()
	{
	}
	public ThreadPolicyHolder (final ThreadPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ThreadPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ThreadPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ThreadPolicyHelper.write (_out,value);
	}
}

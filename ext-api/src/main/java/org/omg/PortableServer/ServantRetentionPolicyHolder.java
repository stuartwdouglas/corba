package org.omg.PortableServer;

/**
 * Generated from IDL interface "ServantRetentionPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class ServantRetentionPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public ServantRetentionPolicy value;
	public ServantRetentionPolicyHolder()
	{
	}
	public ServantRetentionPolicyHolder (final ServantRetentionPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ServantRetentionPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServantRetentionPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ServantRetentionPolicyHelper.write (_out,value);
	}
}

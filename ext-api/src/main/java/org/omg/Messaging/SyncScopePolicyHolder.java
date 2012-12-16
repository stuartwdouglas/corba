package org.omg.Messaging;

/**
 * Generated from IDL interface "SyncScopePolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class SyncScopePolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public SyncScopePolicy value;
	public SyncScopePolicyHolder()
	{
	}
	public SyncScopePolicyHolder (final SyncScopePolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SyncScopePolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SyncScopePolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SyncScopePolicyHelper.write (_out,value);
	}
}

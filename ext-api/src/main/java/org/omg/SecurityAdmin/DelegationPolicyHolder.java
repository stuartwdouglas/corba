package org.omg.SecurityAdmin;

/**
 * Generated from IDL interface "DelegationPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class DelegationPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public DelegationPolicy value;
	public DelegationPolicyHolder()
	{
	}
	public DelegationPolicyHolder (final DelegationPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DelegationPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DelegationPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DelegationPolicyHelper.write (_out,value);
	}
}

package org.omg.SecurityAdmin;

/**
 * Generated from IDL interface "AuditPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class AuditPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public AuditPolicy value;
	public AuditPolicyHolder()
	{
	}
	public AuditPolicyHolder (final AuditPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return AuditPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AuditPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		AuditPolicyHelper.write (_out,value);
	}
}

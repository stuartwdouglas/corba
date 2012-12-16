package org.omg.SecurityLevel2;

/**
 * Generated from IDL interface "AuditDecision".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class AuditDecisionHolder	implements org.omg.CORBA.portable.Streamable{
	 public AuditDecision value;
	public AuditDecisionHolder()
	{
	}
	public AuditDecisionHolder (final AuditDecision initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return AuditDecisionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AuditDecisionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		AuditDecisionHelper.write (_out,value);
	}
}

package org.omg.Security;

/**
 * Generated from IDL struct "AuditEventType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class AuditEventTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.Security.AuditEventType value;

	public AuditEventTypeHolder ()
	{
	}
	public AuditEventTypeHolder(final org.omg.Security.AuditEventType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.Security.AuditEventTypeHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.Security.AuditEventTypeHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.Security.AuditEventTypeHelper.write(_out, value);
	}
}

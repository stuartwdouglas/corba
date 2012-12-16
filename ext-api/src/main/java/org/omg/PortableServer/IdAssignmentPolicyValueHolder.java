package org.omg.PortableServer;
/**
 * Generated from IDL enum "IdAssignmentPolicyValue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class IdAssignmentPolicyValueHolder
	implements org.omg.CORBA.portable.Streamable
{
	public IdAssignmentPolicyValue value;

	public IdAssignmentPolicyValueHolder ()
	{
	}
	public IdAssignmentPolicyValueHolder (final IdAssignmentPolicyValue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return IdAssignmentPolicyValueHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IdAssignmentPolicyValueHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		IdAssignmentPolicyValueHelper.write (out,value);
	}
}

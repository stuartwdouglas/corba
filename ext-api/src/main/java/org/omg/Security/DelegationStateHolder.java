package org.omg.Security;
/**
 * Generated from IDL enum "DelegationState".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class DelegationStateHolder
	implements org.omg.CORBA.portable.Streamable
{
	public DelegationState value;

	public DelegationStateHolder ()
	{
	}
	public DelegationStateHolder (final DelegationState initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return DelegationStateHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DelegationStateHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		DelegationStateHelper.write (out,value);
	}
}

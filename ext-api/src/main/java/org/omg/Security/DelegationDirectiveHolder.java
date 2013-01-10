package org.omg.Security;
/**
 * Generated from IDL enum "DelegationDirective".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class DelegationDirectiveHolder
	implements org.omg.CORBA.portable.Streamable
{
	public DelegationDirective value;

	public DelegationDirectiveHolder ()
	{
	}
	public DelegationDirectiveHolder (final DelegationDirective initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return DelegationDirectiveHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DelegationDirectiveHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		DelegationDirectiveHelper.write (out,value);
	}
}

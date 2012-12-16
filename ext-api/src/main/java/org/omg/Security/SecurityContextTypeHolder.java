package org.omg.Security;
/**
 * Generated from IDL enum "SecurityContextType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class SecurityContextTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public SecurityContextType value;

	public SecurityContextTypeHolder ()
	{
	}
	public SecurityContextTypeHolder (final SecurityContextType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SecurityContextTypeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SecurityContextTypeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SecurityContextTypeHelper.write (out,value);
	}
}

package org.omg.PortableServer;
/**
 * Generated from IDL enum "LifespanPolicyValue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class LifespanPolicyValueHolder
	implements org.omg.CORBA.portable.Streamable
{
	public LifespanPolicyValue value;

	public LifespanPolicyValueHolder ()
	{
	}
	public LifespanPolicyValueHolder (final LifespanPolicyValue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LifespanPolicyValueHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LifespanPolicyValueHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		LifespanPolicyValueHelper.write (out,value);
	}
}

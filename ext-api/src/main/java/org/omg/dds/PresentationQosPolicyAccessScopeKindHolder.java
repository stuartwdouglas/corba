package org.omg.dds;
/**
 * Generated from IDL enum "PresentationQosPolicyAccessScopeKind".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class PresentationQosPolicyAccessScopeKindHolder
	implements org.omg.CORBA.portable.Streamable
{
	public PresentationQosPolicyAccessScopeKind value;

	public PresentationQosPolicyAccessScopeKindHolder ()
	{
	}
	public PresentationQosPolicyAccessScopeKindHolder (final PresentationQosPolicyAccessScopeKind initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PresentationQosPolicyAccessScopeKindHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PresentationQosPolicyAccessScopeKindHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PresentationQosPolicyAccessScopeKindHelper.write (out,value);
	}
}

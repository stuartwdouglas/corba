package org.omg.dds;
/**
 * Generated from IDL enum "ReliabilityQosPolicyKind".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class ReliabilityQosPolicyKindHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ReliabilityQosPolicyKind value;

	public ReliabilityQosPolicyKindHolder ()
	{
	}
	public ReliabilityQosPolicyKindHolder (final ReliabilityQosPolicyKind initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ReliabilityQosPolicyKindHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ReliabilityQosPolicyKindHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ReliabilityQosPolicyKindHelper.write (out,value);
	}
}

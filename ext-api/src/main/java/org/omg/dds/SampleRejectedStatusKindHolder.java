package org.omg.dds;
/**
 * Generated from IDL enum "SampleRejectedStatusKind".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class SampleRejectedStatusKindHolder
	implements org.omg.CORBA.portable.Streamable
{
	public SampleRejectedStatusKind value;

	public SampleRejectedStatusKindHolder ()
	{
	}
	public SampleRejectedStatusKindHolder (final SampleRejectedStatusKind initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SampleRejectedStatusKindHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SampleRejectedStatusKindHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SampleRejectedStatusKindHelper.write (out,value);
	}
}

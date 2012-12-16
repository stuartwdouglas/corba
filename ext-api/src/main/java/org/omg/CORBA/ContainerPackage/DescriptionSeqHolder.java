package org.omg.CORBA.ContainerPackage;

/**
 * Generated from IDL alias "DescriptionSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class DescriptionSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ContainerPackage.Description[] value;

	public DescriptionSeqHolder ()
	{
	}
	public DescriptionSeqHolder (final org.omg.CORBA.ContainerPackage.Description[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return DescriptionSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DescriptionSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		DescriptionSeqHelper.write (out,value);
	}
}

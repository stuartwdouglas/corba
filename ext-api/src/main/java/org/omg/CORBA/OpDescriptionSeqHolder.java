package org.omg.CORBA;

/**
 * Generated from IDL alias "OpDescriptionSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class OpDescriptionSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.OperationDescription[] value;

	public OpDescriptionSeqHolder ()
	{
	}
	public OpDescriptionSeqHolder (final org.omg.CORBA.OperationDescription[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return OpDescriptionSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = OpDescriptionSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		OpDescriptionSeqHelper.write (out,value);
	}
}

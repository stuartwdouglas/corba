package org.omg.CORBA;

/**
 * Generated from IDL alias "ParDescriptionSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class ParDescriptionSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ParameterDescription[] value;

	public ParDescriptionSeqHolder ()
	{
	}
	public ParDescriptionSeqHolder (final org.omg.CORBA.ParameterDescription[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ParDescriptionSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ParDescriptionSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ParDescriptionSeqHelper.write (out,value);
	}
}

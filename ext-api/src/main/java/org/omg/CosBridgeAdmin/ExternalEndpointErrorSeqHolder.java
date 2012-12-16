package org.omg.CosBridgeAdmin;

/**
 * Generated from IDL alias "ExternalEndpointErrorSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public final class ExternalEndpointErrorSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosBridgeAdmin.ExternalEndpointError[] value;

	public ExternalEndpointErrorSeqHolder ()
	{
	}
	public ExternalEndpointErrorSeqHolder (final org.omg.CosBridgeAdmin.ExternalEndpointError[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExternalEndpointErrorSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExternalEndpointErrorSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ExternalEndpointErrorSeqHelper.write (out,value);
	}
}

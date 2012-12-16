package org.omg.CosBridgeAdmin;
/**
 * Generated from IDL enum "ExternalEndpointErrorCode".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public final class ExternalEndpointErrorCodeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ExternalEndpointErrorCode value;

	public ExternalEndpointErrorCodeHolder ()
	{
	}
	public ExternalEndpointErrorCodeHolder (final ExternalEndpointErrorCode initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExternalEndpointErrorCodeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExternalEndpointErrorCodeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ExternalEndpointErrorCodeHelper.write (out,value);
	}
}

package org.omg.Security;
/**
 * Generated from IDL enum "CommunicationDirection".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class CommunicationDirectionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public CommunicationDirection value;

	public CommunicationDirectionHolder ()
	{
	}
	public CommunicationDirectionHolder (final CommunicationDirection initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CommunicationDirectionHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CommunicationDirectionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CommunicationDirectionHelper.write (out,value);
	}
}

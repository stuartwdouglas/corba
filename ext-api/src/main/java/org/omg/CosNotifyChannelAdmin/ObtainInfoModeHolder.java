package org.omg.CosNotifyChannelAdmin;
/**
 * Generated from IDL enum "ObtainInfoMode".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class ObtainInfoModeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ObtainInfoMode value;

	public ObtainInfoModeHolder ()
	{
	}
	public ObtainInfoModeHolder (final ObtainInfoMode initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ObtainInfoModeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ObtainInfoModeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ObtainInfoModeHelper.write (out,value);
	}
}

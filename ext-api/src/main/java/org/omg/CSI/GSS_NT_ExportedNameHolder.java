package org.omg.CSI;

/**
 * Generated from IDL alias "GSS_NT_ExportedName".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class GSS_NT_ExportedNameHolder
	implements org.omg.CORBA.portable.Streamable
{
	public byte[] value;

	public GSS_NT_ExportedNameHolder ()
	{
	}
	public GSS_NT_ExportedNameHolder (final byte[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return GSS_NT_ExportedNameHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = GSS_NT_ExportedNameHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		GSS_NT_ExportedNameHelper.write (out,value);
	}
}

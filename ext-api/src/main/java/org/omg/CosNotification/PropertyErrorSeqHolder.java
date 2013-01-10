package org.omg.CosNotification;

/**
 * Generated from IDL alias "PropertyErrorSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class PropertyErrorSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotification.PropertyError[] value;

	public PropertyErrorSeqHolder ()
	{
	}
	public PropertyErrorSeqHolder (final org.omg.CosNotification.PropertyError[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PropertyErrorSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PropertyErrorSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PropertyErrorSeqHelper.write (out,value);
	}
}

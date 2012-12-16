package org.omg.CosNaming.NamingContextPackage;
/**
 * Generated from IDL enum "NotFoundReason".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:39 PM
 */

public final class NotFoundReasonHolder
	implements org.omg.CORBA.portable.Streamable
{
	public NotFoundReason value;

	public NotFoundReasonHolder ()
	{
	}
	public NotFoundReasonHolder (final NotFoundReason initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NotFoundReasonHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NotFoundReasonHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NotFoundReasonHelper.write (out,value);
	}
}

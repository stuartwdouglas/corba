package org.omg.CosCollection;
/**
 * Generated from IDL enum "ElementInvalidReason".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class ElementInvalidReasonHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ElementInvalidReason value;

	public ElementInvalidReasonHolder ()
	{
	}
	public ElementInvalidReasonHolder (final ElementInvalidReason initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ElementInvalidReasonHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ElementInvalidReasonHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ElementInvalidReasonHelper.write (out,value);
	}
}

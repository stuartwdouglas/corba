package org.omg.dds;

/**
 * Generated from IDL struct "PresentationQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class PresentationQosPolicyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.PresentationQosPolicy value;

	public PresentationQosPolicyHolder ()
	{
	}
	public PresentationQosPolicyHolder(final org.omg.dds.PresentationQosPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.PresentationQosPolicyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.PresentationQosPolicyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.PresentationQosPolicyHelper.write(_out, value);
	}
}

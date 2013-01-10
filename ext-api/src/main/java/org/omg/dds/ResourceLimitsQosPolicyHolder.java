package org.omg.dds;

/**
 * Generated from IDL struct "ResourceLimitsQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class ResourceLimitsQosPolicyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.ResourceLimitsQosPolicy value;

	public ResourceLimitsQosPolicyHolder ()
	{
	}
	public ResourceLimitsQosPolicyHolder(final org.omg.dds.ResourceLimitsQosPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.ResourceLimitsQosPolicyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.ResourceLimitsQosPolicyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.ResourceLimitsQosPolicyHelper.write(_out, value);
	}
}

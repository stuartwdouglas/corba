package org.omg.dds;

/**
 * Generated from IDL struct "DestinationOrderQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class DestinationOrderQosPolicyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.DestinationOrderQosPolicy value;

	public DestinationOrderQosPolicyHolder ()
	{
	}
	public DestinationOrderQosPolicyHolder(final org.omg.dds.DestinationOrderQosPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.DestinationOrderQosPolicyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.DestinationOrderQosPolicyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.DestinationOrderQosPolicyHelper.write(_out, value);
	}
}

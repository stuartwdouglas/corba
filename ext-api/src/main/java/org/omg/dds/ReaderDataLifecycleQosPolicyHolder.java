package org.omg.dds;

/**
 * Generated from IDL struct "ReaderDataLifecycleQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class ReaderDataLifecycleQosPolicyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.ReaderDataLifecycleQosPolicy value;

	public ReaderDataLifecycleQosPolicyHolder ()
	{
	}
	public ReaderDataLifecycleQosPolicyHolder(final org.omg.dds.ReaderDataLifecycleQosPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.ReaderDataLifecycleQosPolicyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.ReaderDataLifecycleQosPolicyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.ReaderDataLifecycleQosPolicyHelper.write(_out, value);
	}
}

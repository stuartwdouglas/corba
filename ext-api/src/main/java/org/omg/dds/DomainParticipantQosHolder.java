package org.omg.dds;

/**
 * Generated from IDL struct "DomainParticipantQos".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class DomainParticipantQosHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.DomainParticipantQos value;

	public DomainParticipantQosHolder ()
	{
	}
	public DomainParticipantQosHolder(final org.omg.dds.DomainParticipantQos initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.DomainParticipantQosHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.DomainParticipantQosHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.DomainParticipantQosHelper.write(_out, value);
	}
}

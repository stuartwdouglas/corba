package org.omg.dds;

/**
 * Generated from IDL interface "DomainParticipantListener".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class DomainParticipantListenerHolder	implements org.omg.CORBA.portable.Streamable{
	 public DomainParticipantListener value;
	public DomainParticipantListenerHolder()
	{
	}
	public DomainParticipantListenerHolder (final DomainParticipantListener initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DomainParticipantListenerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DomainParticipantListenerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DomainParticipantListenerHelper.write (_out,value);
	}
}

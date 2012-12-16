package org.omg.dds;

/**
 * Generated from IDL interface "DomainParticipantListener".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
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

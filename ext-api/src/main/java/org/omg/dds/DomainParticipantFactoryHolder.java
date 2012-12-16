package org.omg.dds;

/**
 * Generated from IDL interface "DomainParticipantFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class DomainParticipantFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public DomainParticipantFactory value;
	public DomainParticipantFactoryHolder()
	{
	}
	public DomainParticipantFactoryHolder (final DomainParticipantFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DomainParticipantFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DomainParticipantFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DomainParticipantFactoryHelper.write (_out,value);
	}
}

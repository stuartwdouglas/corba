package org.omg.dds;

/**
 * Generated from IDL interface "DomainParticipant".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class DomainParticipantHolder	implements org.omg.CORBA.portable.Streamable{
	 public DomainParticipant value;
	public DomainParticipantHolder()
	{
	}
	public DomainParticipantHolder (final DomainParticipant initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DomainParticipantHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DomainParticipantHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DomainParticipantHelper.write (_out,value);
	}
}

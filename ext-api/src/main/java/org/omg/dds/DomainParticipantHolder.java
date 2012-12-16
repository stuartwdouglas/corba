package org.omg.dds;

/**
 * Generated from IDL interface "DomainParticipant".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
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

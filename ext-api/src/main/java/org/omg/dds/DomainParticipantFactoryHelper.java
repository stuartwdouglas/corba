package org.omg.dds;


/**
 * Generated from IDL interface "DomainParticipantFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class DomainParticipantFactoryHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.DomainParticipantFactory s)
	{
			any.insert_Object(s);
	}
	public static org.omg.dds.DomainParticipantFactory extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/dds/DomainParticipantFactory:1.0", "DomainParticipantFactory");
	}
	public static String id()
	{
		return "IDL:omg.org/dds/DomainParticipantFactory:1.0";
	}
	public static DomainParticipantFactory read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.dds._DomainParticipantFactoryStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.dds.DomainParticipantFactory s)
	{
		_out.write_Object(s);
	}
	public static org.omg.dds.DomainParticipantFactory narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.dds.DomainParticipantFactory)
		{
			return (org.omg.dds.DomainParticipantFactory)obj;
		}
		else if (obj._is_a("IDL:omg.org/dds/DomainParticipantFactory:1.0"))
		{
			org.omg.dds._DomainParticipantFactoryStub stub;
			stub = new org.omg.dds._DomainParticipantFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.dds.DomainParticipantFactory unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.dds.DomainParticipantFactory)
		{
			return (org.omg.dds.DomainParticipantFactory)obj;
		}
		else
		{
			org.omg.dds._DomainParticipantFactoryStub stub;
			stub = new org.omg.dds._DomainParticipantFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}

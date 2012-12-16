package org.omg.dds;


/**
 * Generated from IDL struct "DomainParticipantQos".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class DomainParticipantQosHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.DomainParticipantQosHelper.id(),"DomainParticipantQos",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("user_data", org.omg.dds.UserDataQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("entity_factory", org.omg.dds.EntityFactoryQosPolicyHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.DomainParticipantQos s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.DomainParticipantQos extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/DomainParticipantQos:1.0";
	}
	public static org.omg.dds.DomainParticipantQos read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.dds.DomainParticipantQos result = new org.omg.dds.DomainParticipantQos();
		result.user_data=org.omg.dds.UserDataQosPolicyHelper.read(in);
		result.entity_factory=org.omg.dds.EntityFactoryQosPolicyHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.dds.DomainParticipantQos s)
	{
		org.omg.dds.UserDataQosPolicyHelper.write(out,s.user_data);
		org.omg.dds.EntityFactoryQosPolicyHelper.write(out,s.entity_factory);
	}
}

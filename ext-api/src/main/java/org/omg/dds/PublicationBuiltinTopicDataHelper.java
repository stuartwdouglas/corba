package org.omg.dds;


/**
 * Generated from IDL struct "PublicationBuiltinTopicData".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class PublicationBuiltinTopicDataHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.PublicationBuiltinTopicDataHelper.id(),"PublicationBuiltinTopicData",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("key", org.omg.dds.BuiltinTopicKey_tHelper.type(), null),new org.omg.CORBA.StructMember("participant_key", org.omg.dds.BuiltinTopicKey_tHelper.type(), null),new org.omg.CORBA.StructMember("topic_name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("type_name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("durability", org.omg.dds.DurabilityQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("deadline", org.omg.dds.DeadlineQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("latency_budget", org.omg.dds.LatencyBudgetQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("liveliness", org.omg.dds.LivelinessQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("reliability", org.omg.dds.ReliabilityQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("lifespan", org.omg.dds.LifespanQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("user_data", org.omg.dds.UserDataQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("ownership_strength", org.omg.dds.OwnershipStrengthQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("presentation", org.omg.dds.PresentationQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("partition", org.omg.dds.PartitionQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("topic_data", org.omg.dds.TopicDataQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("group_data", org.omg.dds.GroupDataQosPolicyHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.PublicationBuiltinTopicData s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.PublicationBuiltinTopicData extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/PublicationBuiltinTopicData:1.0";
	}
	public static org.omg.dds.PublicationBuiltinTopicData read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.dds.PublicationBuiltinTopicData result = new org.omg.dds.PublicationBuiltinTopicData();
		result.key = org.omg.dds.BuiltinTopicKey_tHelper.read(in);
		result.participant_key = org.omg.dds.BuiltinTopicKey_tHelper.read(in);
		result.topic_name=in.read_string();
		result.type_name=in.read_string();
		result.durability=org.omg.dds.DurabilityQosPolicyHelper.read(in);
		result.deadline=org.omg.dds.DeadlineQosPolicyHelper.read(in);
		result.latency_budget=org.omg.dds.LatencyBudgetQosPolicyHelper.read(in);
		result.liveliness=org.omg.dds.LivelinessQosPolicyHelper.read(in);
		result.reliability=org.omg.dds.ReliabilityQosPolicyHelper.read(in);
		result.lifespan=org.omg.dds.LifespanQosPolicyHelper.read(in);
		result.user_data=org.omg.dds.UserDataQosPolicyHelper.read(in);
		result.ownership_strength=org.omg.dds.OwnershipStrengthQosPolicyHelper.read(in);
		result.presentation=org.omg.dds.PresentationQosPolicyHelper.read(in);
		result.partition=org.omg.dds.PartitionQosPolicyHelper.read(in);
		result.topic_data=org.omg.dds.TopicDataQosPolicyHelper.read(in);
		result.group_data=org.omg.dds.GroupDataQosPolicyHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.dds.PublicationBuiltinTopicData s)
	{
		org.omg.dds.BuiltinTopicKey_tHelper.write(out,s.key);
		org.omg.dds.BuiltinTopicKey_tHelper.write(out,s.participant_key);
		out.write_string(s.topic_name);
		out.write_string(s.type_name);
		org.omg.dds.DurabilityQosPolicyHelper.write(out,s.durability);
		org.omg.dds.DeadlineQosPolicyHelper.write(out,s.deadline);
		org.omg.dds.LatencyBudgetQosPolicyHelper.write(out,s.latency_budget);
		org.omg.dds.LivelinessQosPolicyHelper.write(out,s.liveliness);
		org.omg.dds.ReliabilityQosPolicyHelper.write(out,s.reliability);
		org.omg.dds.LifespanQosPolicyHelper.write(out,s.lifespan);
		org.omg.dds.UserDataQosPolicyHelper.write(out,s.user_data);
		org.omg.dds.OwnershipStrengthQosPolicyHelper.write(out,s.ownership_strength);
		org.omg.dds.PresentationQosPolicyHelper.write(out,s.presentation);
		org.omg.dds.PartitionQosPolicyHelper.write(out,s.partition);
		org.omg.dds.TopicDataQosPolicyHelper.write(out,s.topic_data);
		org.omg.dds.GroupDataQosPolicyHelper.write(out,s.group_data);
	}
}

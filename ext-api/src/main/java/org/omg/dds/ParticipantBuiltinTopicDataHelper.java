package org.omg.dds;


/**
 * Generated from IDL struct "ParticipantBuiltinTopicData".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class ParticipantBuiltinTopicDataHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.ParticipantBuiltinTopicDataHelper.id(),"ParticipantBuiltinTopicData",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("key", org.omg.dds.BuiltinTopicKey_tHelper.type(), null),new org.omg.CORBA.StructMember("user_data", org.omg.dds.UserDataQosPolicyHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.ParticipantBuiltinTopicData s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.ParticipantBuiltinTopicData extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/ParticipantBuiltinTopicData:1.0";
	}
	public static org.omg.dds.ParticipantBuiltinTopicData read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.dds.ParticipantBuiltinTopicData result = new org.omg.dds.ParticipantBuiltinTopicData();
		result.key = org.omg.dds.BuiltinTopicKey_tHelper.read(in);
		result.user_data=org.omg.dds.UserDataQosPolicyHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.dds.ParticipantBuiltinTopicData s)
	{
		org.omg.dds.BuiltinTopicKey_tHelper.write(out,s.key);
		org.omg.dds.UserDataQosPolicyHelper.write(out,s.user_data);
	}
}

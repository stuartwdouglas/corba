package org.omg.dds;

/**
 * Generated from IDL struct "ParticipantBuiltinTopicData".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class ParticipantBuiltinTopicData
	implements org.omg.CORBA.portable.IDLEntity
{
	public ParticipantBuiltinTopicData(){}
	public int[] key;
	public org.omg.dds.UserDataQosPolicy user_data;
	public ParticipantBuiltinTopicData(int[] key, org.omg.dds.UserDataQosPolicy user_data)
	{
		this.key = key;
		this.user_data = user_data;
	}
}

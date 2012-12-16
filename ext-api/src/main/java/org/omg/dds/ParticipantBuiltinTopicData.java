package org.omg.dds;

/**
 * Generated from IDL struct "ParticipantBuiltinTopicData".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
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

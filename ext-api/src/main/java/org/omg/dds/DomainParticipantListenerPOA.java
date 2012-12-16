package org.omg.dds;


/**
 * Generated from IDL interface "DomainParticipantListener".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public abstract class DomainParticipantListenerPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.dds.DomainParticipantListenerOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "on_requested_incompatible_qos", new java.lang.Integer(0));
		m_opsHash.put ( "on_offered_deadline_missed", new java.lang.Integer(1));
		m_opsHash.put ( "on_offered_incompatible_qos", new java.lang.Integer(2));
		m_opsHash.put ( "on_data_on_readers", new java.lang.Integer(3));
		m_opsHash.put ( "on_liveliness_changed", new java.lang.Integer(4));
		m_opsHash.put ( "on_sample_rejected", new java.lang.Integer(5));
		m_opsHash.put ( "on_subscription_match", new java.lang.Integer(6));
		m_opsHash.put ( "on_requested_deadline_missed", new java.lang.Integer(7));
		m_opsHash.put ( "on_data_available", new java.lang.Integer(8));
		m_opsHash.put ( "on_sample_lost", new java.lang.Integer(9));
		m_opsHash.put ( "on_liveliness_lost", new java.lang.Integer(10));
		m_opsHash.put ( "on_publication_match", new java.lang.Integer(11));
		m_opsHash.put ( "on_inconsistent_topic", new java.lang.Integer(12));
	}
	private String[] ids = {"IDL:omg.org/dds/DomainParticipantListener:1.0","IDL:omg.org/dds/SubscriberListener:1.0","IDL:omg.org/dds/TopicListener:1.0","IDL:omg.org/dds/DataWriterListener:1.0","IDL:omg.org/dds/PublisherListener:1.0","IDL:omg.org/dds/DataReaderListener:1.0","IDL:omg.org/dds/Listener:1.0"};
	public org.omg.dds.DomainParticipantListener _this()
	{
		return org.omg.dds.DomainParticipantListenerHelper.narrow(_this_object());
	}
	public org.omg.dds.DomainParticipantListener _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.DomainParticipantListenerHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // on_requested_incompatible_qos
			{
				org.omg.dds.DataReader _arg0=org.omg.dds.DataReaderHelper.read(_input);
				org.omg.dds.RequestedIncompatibleQosStatus _arg1=org.omg.dds.RequestedIncompatibleQosStatusHelper.read(_input);
				_out = handler.createReply();
				on_requested_incompatible_qos(_arg0,_arg1);
				break;
			}
			case 1: // on_offered_deadline_missed
			{
				org.omg.dds.DataWriter _arg0=org.omg.dds.DataWriterHelper.read(_input);
				org.omg.dds.OfferedDeadlineMissedStatus _arg1=org.omg.dds.OfferedDeadlineMissedStatusHelper.read(_input);
				_out = handler.createReply();
				on_offered_deadline_missed(_arg0,_arg1);
				break;
			}
			case 2: // on_offered_incompatible_qos
			{
				org.omg.dds.DataWriter _arg0=org.omg.dds.DataWriterHelper.read(_input);
				org.omg.dds.OfferedIncompatibleQosStatus _arg1=org.omg.dds.OfferedIncompatibleQosStatusHelper.read(_input);
				_out = handler.createReply();
				on_offered_incompatible_qos(_arg0,_arg1);
				break;
			}
			case 3: // on_data_on_readers
			{
				org.omg.dds.Subscriber _arg0=org.omg.dds.SubscriberHelper.read(_input);
				_out = handler.createReply();
				on_data_on_readers(_arg0);
				break;
			}
			case 4: // on_liveliness_changed
			{
				org.omg.dds.DataReader _arg0=org.omg.dds.DataReaderHelper.read(_input);
				org.omg.dds.LivelinessChangedStatus _arg1=org.omg.dds.LivelinessChangedStatusHelper.read(_input);
				_out = handler.createReply();
				on_liveliness_changed(_arg0,_arg1);
				break;
			}
			case 5: // on_sample_rejected
			{
				org.omg.dds.DataReader _arg0=org.omg.dds.DataReaderHelper.read(_input);
				org.omg.dds.SampleRejectedStatus _arg1=org.omg.dds.SampleRejectedStatusHelper.read(_input);
				_out = handler.createReply();
				on_sample_rejected(_arg0,_arg1);
				break;
			}
			case 6: // on_subscription_match
			{
				org.omg.dds.DataReader _arg0=org.omg.dds.DataReaderHelper.read(_input);
				org.omg.dds.SubscriptionMatchStatus _arg1=org.omg.dds.SubscriptionMatchStatusHelper.read(_input);
				_out = handler.createReply();
				on_subscription_match(_arg0,_arg1);
				break;
			}
			case 7: // on_requested_deadline_missed
			{
				org.omg.dds.DataReader _arg0=org.omg.dds.DataReaderHelper.read(_input);
				org.omg.dds.RequestedDeadlineMissedStatus _arg1=org.omg.dds.RequestedDeadlineMissedStatusHelper.read(_input);
				_out = handler.createReply();
				on_requested_deadline_missed(_arg0,_arg1);
				break;
			}
			case 8: // on_data_available
			{
				org.omg.dds.DataReader _arg0=org.omg.dds.DataReaderHelper.read(_input);
				_out = handler.createReply();
				on_data_available(_arg0);
				break;
			}
			case 9: // on_sample_lost
			{
				org.omg.dds.DataReader _arg0=org.omg.dds.DataReaderHelper.read(_input);
				org.omg.dds.SampleLostStatus _arg1=org.omg.dds.SampleLostStatusHelper.read(_input);
				_out = handler.createReply();
				on_sample_lost(_arg0,_arg1);
				break;
			}
			case 10: // on_liveliness_lost
			{
				org.omg.dds.DataWriter _arg0=org.omg.dds.DataWriterHelper.read(_input);
				org.omg.dds.LivelinessLostStatus _arg1=org.omg.dds.LivelinessLostStatusHelper.read(_input);
				_out = handler.createReply();
				on_liveliness_lost(_arg0,_arg1);
				break;
			}
			case 11: // on_publication_match
			{
				org.omg.dds.DataWriter _arg0=org.omg.dds.DataWriterHelper.read(_input);
				org.omg.dds.PublicationMatchStatus _arg1=org.omg.dds.PublicationMatchStatusHelper.read(_input);
				_out = handler.createReply();
				on_publication_match(_arg0,_arg1);
				break;
			}
			case 12: // on_inconsistent_topic
			{
				org.omg.dds.Topic _arg0=org.omg.dds.TopicHelper.read(_input);
				org.omg.dds.InconsistentTopicStatus _arg1=org.omg.dds.InconsistentTopicStatusHelper.read(_input);
				_out = handler.createReply();
				on_inconsistent_topic(_arg0,_arg1);
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}

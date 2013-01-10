package org.omg.dds;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "DomainParticipantListener".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public class DomainParticipantListenerPOATie
	extends DomainParticipantListenerPOA
{
	private DomainParticipantListenerOperations _delegate;

	private POA _poa;
	public DomainParticipantListenerPOATie(DomainParticipantListenerOperations delegate)
	{
		_delegate = delegate;
	}
	public DomainParticipantListenerPOATie(DomainParticipantListenerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.dds.DomainParticipantListener _this()
	{
		return org.omg.dds.DomainParticipantListenerHelper.narrow(_this_object());
	}
	public org.omg.dds.DomainParticipantListener _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.DomainParticipantListenerHelper.narrow(_this_object(orb));
	}
	public DomainParticipantListenerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(DomainParticipantListenerOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public void on_requested_incompatible_qos(org.omg.dds.DataReader reader, org.omg.dds.RequestedIncompatibleQosStatus status)
	{
_delegate.on_requested_incompatible_qos(reader,status);
	}

	public void on_offered_deadline_missed(org.omg.dds.DataWriter writer, org.omg.dds.OfferedDeadlineMissedStatus status)
	{
_delegate.on_offered_deadline_missed(writer,status);
	}

	public void on_offered_incompatible_qos(org.omg.dds.DataWriter writer, org.omg.dds.OfferedIncompatibleQosStatus status)
	{
_delegate.on_offered_incompatible_qos(writer,status);
	}

	public void on_data_on_readers(org.omg.dds.Subscriber subs)
	{
_delegate.on_data_on_readers(subs);
	}

	public void on_liveliness_changed(org.omg.dds.DataReader reader, org.omg.dds.LivelinessChangedStatus status)
	{
_delegate.on_liveliness_changed(reader,status);
	}

	public void on_sample_rejected(org.omg.dds.DataReader reader, org.omg.dds.SampleRejectedStatus status)
	{
_delegate.on_sample_rejected(reader,status);
	}

	public void on_subscription_match(org.omg.dds.DataReader reader, org.omg.dds.SubscriptionMatchStatus status)
	{
_delegate.on_subscription_match(reader,status);
	}

	public void on_requested_deadline_missed(org.omg.dds.DataReader reader, org.omg.dds.RequestedDeadlineMissedStatus status)
	{
_delegate.on_requested_deadline_missed(reader,status);
	}

	public void on_data_available(org.omg.dds.DataReader reader)
	{
_delegate.on_data_available(reader);
	}

	public void on_sample_lost(org.omg.dds.DataReader reader, org.omg.dds.SampleLostStatus status)
	{
_delegate.on_sample_lost(reader,status);
	}

	public void on_liveliness_lost(org.omg.dds.DataWriter writer, org.omg.dds.LivelinessLostStatus status)
	{
_delegate.on_liveliness_lost(writer,status);
	}

	public void on_publication_match(org.omg.dds.DataWriter writer, org.omg.dds.PublicationMatchStatus status)
	{
_delegate.on_publication_match(writer,status);
	}

	public void on_inconsistent_topic(org.omg.dds.Topic the_topic, org.omg.dds.InconsistentTopicStatus status)
	{
_delegate.on_inconsistent_topic(the_topic,status);
	}

}

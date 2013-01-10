package org.omg.dds;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "DomainParticipantFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public class DomainParticipantFactoryPOATie
	extends DomainParticipantFactoryPOA
{
	private DomainParticipantFactoryOperations _delegate;

	private POA _poa;
	public DomainParticipantFactoryPOATie(DomainParticipantFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public DomainParticipantFactoryPOATie(DomainParticipantFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.dds.DomainParticipantFactory _this()
	{
		return org.omg.dds.DomainParticipantFactoryHelper.narrow(_this_object());
	}
	public org.omg.dds.DomainParticipantFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.DomainParticipantFactoryHelper.narrow(_this_object(orb));
	}
	public DomainParticipantFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(DomainParticipantFactoryOperations delegate)
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
	public org.omg.dds.DomainParticipant lookup_participant(int domainId)
	{
		return _delegate.lookup_participant(domainId);
	}

	public org.omg.dds.DomainParticipant create_participant(int domainId, org.omg.dds.DomainParticipantQos qos, org.omg.dds.DomainParticipantListener a_listener)
	{
		return _delegate.create_participant(domainId,qos,a_listener);
	}

	public void get_default_participant_qos(org.omg.dds.DomainParticipantQosHolder qos)
	{
_delegate.get_default_participant_qos(qos);
	}

	public int delete_participant(org.omg.dds.DomainParticipant a_participant)
	{
		return _delegate.delete_participant(a_participant);
	}

	public int set_default_participant_qos(org.omg.dds.DomainParticipantQos qos)
	{
		return _delegate.set_default_participant_qos(qos);
	}

}

package org.omg.dds;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TopicDescription".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public class TopicDescriptionPOATie
	extends TopicDescriptionPOA
{
	private TopicDescriptionOperations _delegate;

	private POA _poa;
	public TopicDescriptionPOATie(TopicDescriptionOperations delegate)
	{
		_delegate = delegate;
	}
	public TopicDescriptionPOATie(TopicDescriptionOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.dds.TopicDescription _this()
	{
		return org.omg.dds.TopicDescriptionHelper.narrow(_this_object());
	}
	public org.omg.dds.TopicDescription _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.TopicDescriptionHelper.narrow(_this_object(orb));
	}
	public TopicDescriptionOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TopicDescriptionOperations delegate)
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
	public org.omg.dds.DomainParticipant get_participant()
	{
		return _delegate.get_participant();
	}

	public java.lang.String get_type_name()
	{
		return _delegate.get_type_name();
	}

	public java.lang.String get_name()
	{
		return _delegate.get_name();
	}

}

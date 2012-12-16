package org.omg.dds;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "MultiTopic".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public class MultiTopicPOATie
	extends MultiTopicPOA
{
	private MultiTopicOperations _delegate;

	private POA _poa;
	public MultiTopicPOATie(MultiTopicOperations delegate)
	{
		_delegate = delegate;
	}
	public MultiTopicPOATie(MultiTopicOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.dds.MultiTopic _this()
	{
		return org.omg.dds.MultiTopicHelper.narrow(_this_object());
	}
	public org.omg.dds.MultiTopic _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.MultiTopicHelper.narrow(_this_object(orb));
	}
	public MultiTopicOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MultiTopicOperations delegate)
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

	public java.lang.String[] get_expression_parameters()
	{
		return _delegate.get_expression_parameters();
	}

	public java.lang.String get_subscription_expression()
	{
		return _delegate.get_subscription_expression();
	}

	public int set_expression_parameters(java.lang.String[] expression_parameters)
	{
		return _delegate.set_expression_parameters(expression_parameters);
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

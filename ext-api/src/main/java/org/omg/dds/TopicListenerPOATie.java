package org.omg.dds;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TopicListener".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public class TopicListenerPOATie
	extends TopicListenerPOA
{
	private TopicListenerOperations _delegate;

	private POA _poa;
	public TopicListenerPOATie(TopicListenerOperations delegate)
	{
		_delegate = delegate;
	}
	public TopicListenerPOATie(TopicListenerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.dds.TopicListener _this()
	{
		return org.omg.dds.TopicListenerHelper.narrow(_this_object());
	}
	public org.omg.dds.TopicListener _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.TopicListenerHelper.narrow(_this_object(orb));
	}
	public TopicListenerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TopicListenerOperations delegate)
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
	public void on_inconsistent_topic(org.omg.dds.Topic the_topic, org.omg.dds.InconsistentTopicStatus status)
	{
_delegate.on_inconsistent_topic(the_topic,status);
	}

}

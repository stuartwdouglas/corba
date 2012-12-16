package org.omg.CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "NotifySubscribe".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public class NotifySubscribePOATie
	extends NotifySubscribePOA
{
	private NotifySubscribeOperations _delegate;

	private POA _poa;
	public NotifySubscribePOATie(NotifySubscribeOperations delegate)
	{
		_delegate = delegate;
	}
	public NotifySubscribePOATie(NotifySubscribeOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyComm.NotifySubscribe _this()
	{
		return org.omg.CosNotifyComm.NotifySubscribeHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyComm.NotifySubscribe _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyComm.NotifySubscribeHelper.narrow(_this_object(orb));
	}
	public NotifySubscribeOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(NotifySubscribeOperations delegate)
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
	public void subscription_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.subscription_change(added,removed);
	}

}

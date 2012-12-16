package org.omg.PortableServer;


/**
 * Generated from IDL interface "POAManager".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public class POAManagerLocalTie
	extends _POAManagerLocalBase
{
	private POAManagerOperations _delegate;

	public POAManagerLocalTie(POAManagerOperations delegate)
	{
		_delegate = delegate;
	}
	public POAManagerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(POAManagerOperations delegate)
	{
		_delegate = delegate;
	}
	public void hold_requests(boolean wait_for_completion) throws org.omg.PortableServer.POAManagerPackage.AdapterInactive
	{
_delegate.hold_requests(wait_for_completion);
	}

	public void discard_requests(boolean wait_for_completion) throws org.omg.PortableServer.POAManagerPackage.AdapterInactive
	{
_delegate.discard_requests(wait_for_completion);
	}

	public org.omg.PortableServer.POAManagerPackage.State get_state()
	{
		return _delegate.get_state();
	}

	public void activate() throws org.omg.PortableServer.POAManagerPackage.AdapterInactive
	{
_delegate.activate();
	}

	public void deactivate(boolean etherealize_objects, boolean wait_for_completion) throws org.omg.PortableServer.POAManagerPackage.AdapterInactive
	{
_delegate.deactivate(etherealize_objects,wait_for_completion);
	}

}

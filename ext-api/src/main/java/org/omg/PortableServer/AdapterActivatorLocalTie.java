package org.omg.PortableServer;


/**
 * Generated from IDL interface "AdapterActivator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public class AdapterActivatorLocalTie
	extends _AdapterActivatorLocalBase
{
	private AdapterActivatorOperations _delegate;

	public AdapterActivatorLocalTie(AdapterActivatorOperations delegate)
	{
		_delegate = delegate;
	}
	public AdapterActivatorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(AdapterActivatorOperations delegate)
	{
		_delegate = delegate;
	}
	public boolean unknown_adapter(org.omg.PortableServer.POA parent, java.lang.String name)
	{
		return _delegate.unknown_adapter(parent,name);
	}

}

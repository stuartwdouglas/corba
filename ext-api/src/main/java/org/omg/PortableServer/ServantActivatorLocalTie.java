package org.omg.PortableServer;


/**
 * Generated from IDL interface "ServantActivator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public class ServantActivatorLocalTie
	extends _ServantActivatorLocalBase
{
	private ServantActivatorOperations _delegate;

	public ServantActivatorLocalTie(ServantActivatorOperations delegate)
	{
		_delegate = delegate;
	}
	public ServantActivatorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ServantActivatorOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.PortableServer.Servant incarnate(byte[] oid, org.omg.PortableServer.POA adapter) throws org.omg.PortableServer.ForwardRequest
	{
		return _delegate.incarnate(oid,adapter);
	}

	public void etherealize(byte[] oid, org.omg.PortableServer.POA adapter, org.omg.PortableServer.Servant serv, boolean cleanup_in_progress, boolean remaining_activations)
	{
_delegate.etherealize(oid,adapter,serv,cleanup_in_progress,remaining_activations);
	}

}

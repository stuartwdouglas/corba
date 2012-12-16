package org.omg.PortableServer;


/**
 * Generated from IDL interface "ServantManager".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public class ServantManagerLocalTie
	extends _ServantManagerLocalBase
{
	private ServantManagerOperations _delegate;

	public ServantManagerLocalTie(ServantManagerOperations delegate)
	{
		_delegate = delegate;
	}
	public ServantManagerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ServantManagerOperations delegate)
	{
		_delegate = delegate;
	}
}

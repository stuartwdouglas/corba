package org.omg.PortableServer;


/**
 * Generated from IDL interface "Current".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public class CurrentLocalTie
	extends _CurrentLocalBase
{
	private CurrentOperations _delegate;

	public CurrentLocalTie(CurrentOperations delegate)
	{
		_delegate = delegate;
	}
	public CurrentOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CurrentOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.PortableServer.Servant get_servant() throws org.omg.PortableServer.CurrentPackage.NoContext
	{
		return _delegate.get_servant();
	}

	public org.omg.PortableServer.POA get_POA() throws org.omg.PortableServer.CurrentPackage.NoContext
	{
		return _delegate.get_POA();
	}

	public byte[] get_object_id() throws org.omg.PortableServer.CurrentPackage.NoContext
	{
		return _delegate.get_object_id();
	}

	public org.omg.CORBA.Object get_reference() throws org.omg.PortableServer.CurrentPackage.NoContext
	{
		return _delegate.get_reference();
	}

}

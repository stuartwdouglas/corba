package org.omg.CosBridgeAdmin;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "BridgeFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public class BridgeFactoryPOATie
	extends BridgeFactoryPOA
{
	private BridgeFactoryOperations _delegate;

	private POA _poa;
	public BridgeFactoryPOATie(BridgeFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public BridgeFactoryPOATie(BridgeFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosBridgeAdmin.BridgeFactory _this()
	{
		return org.omg.CosBridgeAdmin.BridgeFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosBridgeAdmin.BridgeFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosBridgeAdmin.BridgeFactoryHelper.narrow(_this_object(orb));
	}
	public BridgeFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(BridgeFactoryOperations delegate)
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
	public org.omg.CosBridgeAdmin.Bridge create_bridge(org.omg.CosBridgeAdmin.ExternalEndpoint source, org.omg.CosBridgeAdmin.ExternalEndpoint sink, org.omg.CORBA.IntHolder id) throws org.omg.CosBridgeAdmin.InvalidExternalEndPoints
	{
		return _delegate.create_bridge(source,sink,id);
	}

	public org.omg.CosBridgeAdmin.Bridge get_bridge_with_id(int id) throws org.omg.CosBridgeAdmin.BridgeNotFound
	{
		return _delegate.get_bridge_with_id(id);
	}

	public int[] get_all_bridges()
	{
		return _delegate.get_all_bridges();
	}

}

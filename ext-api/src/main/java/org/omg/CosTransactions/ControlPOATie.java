package org.omg.CosTransactions;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Control".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public class ControlPOATie
	extends ControlPOA
{
	private ControlOperations _delegate;

	private POA _poa;
	public ControlPOATie(ControlOperations delegate)
	{
		_delegate = delegate;
	}
	public ControlPOATie(ControlOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTransactions.Control _this()
	{
		return org.omg.CosTransactions.ControlHelper.narrow(_this_object());
	}
	public org.omg.CosTransactions.Control _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTransactions.ControlHelper.narrow(_this_object(orb));
	}
	public ControlOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ControlOperations delegate)
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
	public org.omg.CosTransactions.Terminator get_terminator() throws org.omg.CosTransactions.Unavailable
	{
		return _delegate.get_terminator();
	}

	public org.omg.CosTransactions.Coordinator get_coordinator() throws org.omg.CosTransactions.Unavailable
	{
		return _delegate.get_coordinator();
	}

}

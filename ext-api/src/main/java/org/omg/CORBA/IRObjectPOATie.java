package org.omg.CORBA;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "IRObject".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public class IRObjectPOATie
	extends IRObjectPOA
{
	private IRObjectOperations _delegate;

	private POA _poa;
	public IRObjectPOATie(IRObjectOperations delegate)
	{
		_delegate = delegate;
	}
	public IRObjectPOATie(IRObjectOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CORBA.IRObject _this()
	{
		return org.omg.CORBA.IRObjectHelper.narrow(_this_object());
	}
	public org.omg.CORBA.IRObject _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CORBA.IRObjectHelper.narrow(_this_object(orb));
	}
	public IRObjectOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(IRObjectOperations delegate)
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
	public void destroy()
	{
_delegate.destroy();
	}

	public org.omg.CORBA.DefinitionKind def_kind()
	{
		return _delegate.def_kind();
	}

}

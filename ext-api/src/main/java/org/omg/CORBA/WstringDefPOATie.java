package org.omg.CORBA;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "WstringDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public class WstringDefPOATie
	extends WstringDefPOA
{
	private WstringDefOperations _delegate;

	private POA _poa;
	public WstringDefPOATie(WstringDefOperations delegate)
	{
		_delegate = delegate;
	}
	public WstringDefPOATie(WstringDefOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CORBA.WstringDef _this()
	{
		return org.omg.CORBA.WstringDefHelper.narrow(_this_object());
	}
	public org.omg.CORBA.WstringDef _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CORBA.WstringDefHelper.narrow(_this_object(orb));
	}
	public WstringDefOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(WstringDefOperations delegate)
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
	public void bound(int a)
	{
		_delegate.bound(a);
	}

	public int bound()
	{
		return _delegate.bound();
	}

	public org.omg.CORBA.TypeCode type()
	{
		return _delegate.type();
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

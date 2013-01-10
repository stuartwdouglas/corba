package org.omg.CORBA;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "PrimitiveDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public class PrimitiveDefPOATie
	extends PrimitiveDefPOA
{
	private PrimitiveDefOperations _delegate;

	private POA _poa;
	public PrimitiveDefPOATie(PrimitiveDefOperations delegate)
	{
		_delegate = delegate;
	}
	public PrimitiveDefPOATie(PrimitiveDefOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CORBA.PrimitiveDef _this()
	{
		return org.omg.CORBA.PrimitiveDefHelper.narrow(_this_object());
	}
	public org.omg.CORBA.PrimitiveDef _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CORBA.PrimitiveDefHelper.narrow(_this_object(orb));
	}
	public PrimitiveDefOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PrimitiveDefOperations delegate)
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
	public org.omg.CORBA.TypeCode type()
	{
		return _delegate.type();
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public org.omg.CORBA.PrimitiveKind kind()
	{
		return _delegate.kind();
	}

	public org.omg.CORBA.DefinitionKind def_kind()
	{
		return _delegate.def_kind();
	}

}

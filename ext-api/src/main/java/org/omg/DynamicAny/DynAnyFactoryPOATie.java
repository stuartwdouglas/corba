package org.omg.DynamicAny;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "DynAnyFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public class DynAnyFactoryPOATie
	extends DynAnyFactoryPOA
{
	private DynAnyFactoryOperations _delegate;

	private POA _poa;
	public DynAnyFactoryPOATie(DynAnyFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public DynAnyFactoryPOATie(DynAnyFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.DynamicAny.DynAnyFactory _this()
	{
		return org.omg.DynamicAny.DynAnyFactoryHelper.narrow(_this_object());
	}
	public org.omg.DynamicAny.DynAnyFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.DynamicAny.DynAnyFactoryHelper.narrow(_this_object(orb));
	}
	public DynAnyFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(DynAnyFactoryOperations delegate)
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
	public org.omg.DynamicAny.DynAny create_dyn_any(org.omg.CORBA.Any value) throws org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode
	{
		return _delegate.create_dyn_any(value);
	}

	public org.omg.DynamicAny.DynAny create_dyn_any_from_type_code(org.omg.CORBA.TypeCode type) throws org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode
	{
		return _delegate.create_dyn_any_from_type_code(type);
	}

}

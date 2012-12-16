package org.omg.CORBA;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ArrayDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public class ArrayDefPOATie
	extends ArrayDefPOA
{
	private ArrayDefOperations _delegate;

	private POA _poa;
	public ArrayDefPOATie(ArrayDefOperations delegate)
	{
		_delegate = delegate;
	}
	public ArrayDefPOATie(ArrayDefOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CORBA.ArrayDef _this()
	{
		return org.omg.CORBA.ArrayDefHelper.narrow(_this_object());
	}
	public org.omg.CORBA.ArrayDef _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CORBA.ArrayDefHelper.narrow(_this_object(orb));
	}
	public ArrayDefOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ArrayDefOperations delegate)
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
	public org.omg.CORBA.TypeCode element_type()
	{
		return _delegate.element_type();
	}

	public int length()
	{
		return _delegate.length();
	}

	public org.omg.CORBA.IDLType element_type_def()
	{
		return _delegate.element_type_def();
	}

	public void length(int a)
	{
		_delegate.length(a);
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

	public void element_type_def(org.omg.CORBA.IDLType a)
	{
		_delegate.element_type_def(a);
	}

}

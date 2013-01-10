package org.omg.dds;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TypeSupport".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public class TypeSupportPOATie
	extends TypeSupportPOA
{
	private TypeSupportOperations _delegate;

	private POA _poa;
	public TypeSupportPOATie(TypeSupportOperations delegate)
	{
		_delegate = delegate;
	}
	public TypeSupportPOATie(TypeSupportOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.dds.TypeSupport _this()
	{
		return org.omg.dds.TypeSupportHelper.narrow(_this_object());
	}
	public org.omg.dds.TypeSupport _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.TypeSupportHelper.narrow(_this_object(orb));
	}
	public TypeSupportOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TypeSupportOperations delegate)
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
}

package org.omg.CORBA;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Contained".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public class ContainedPOATie
	extends ContainedPOA
{
	private ContainedOperations _delegate;

	private POA _poa;
	public ContainedPOATie(ContainedOperations delegate)
	{
		_delegate = delegate;
	}
	public ContainedPOATie(ContainedOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CORBA.Contained _this()
	{
		return org.omg.CORBA.ContainedHelper.narrow(_this_object());
	}
	public org.omg.CORBA.Contained _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CORBA.ContainedHelper.narrow(_this_object(orb));
	}
	public ContainedOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ContainedOperations delegate)
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
	public org.omg.CORBA.DefinitionKind def_kind()
	{
		return _delegate.def_kind();
	}

	public java.lang.String absolute_name()
	{
		return _delegate.absolute_name();
	}

	public void id(java.lang.String a)
	{
		_delegate.id(a);
	}

	public java.lang.String name()
	{
		return _delegate.name();
	}

	public java.lang.String version()
	{
		return _delegate.version();
	}

	public org.omg.CORBA.ContainedPackage.Description describe()
	{
		return _delegate.describe();
	}

	public void version(java.lang.String a)
	{
		_delegate.version(a);
	}

	public java.lang.String id()
	{
		return _delegate.id();
	}

	public org.omg.CORBA.Repository containing_repository()
	{
		return _delegate.containing_repository();
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public org.omg.CORBA.Container defined_in()
	{
		return _delegate.defined_in();
	}

	public void move(org.omg.CORBA.Container new_container, java.lang.String new_name, java.lang.String new_version)
	{
_delegate.move(new_container,new_name,new_version);
	}

	public void name(java.lang.String a)
	{
		_delegate.name(a);
	}

}

package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Operations".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public class OperationsPOATie
	extends OperationsPOA
{
	private OperationsOperations _delegate;

	private POA _poa;
	public OperationsPOATie(OperationsOperations delegate)
	{
		_delegate = delegate;
	}
	public OperationsPOATie(OperationsOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.Operations _this()
	{
		return org.omg.CosCollection.OperationsHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.Operations _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.OperationsHelper.narrow(_this_object(orb));
	}
	public OperationsOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(OperationsOperations delegate)
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
	public int compare(org.omg.CORBA.Any element1, org.omg.CORBA.Any element2)
	{
		return _delegate.compare(element1,element2);
	}

	public int key_hash(org.omg.CORBA.Any thisKey, int value)
	{
		return _delegate.key_hash(thisKey,value);
	}

	public int hash(org.omg.CORBA.Any element, int value)
	{
		return _delegate.hash(element,value);
	}

	public boolean key_equal(org.omg.CORBA.Any key1, org.omg.CORBA.Any key2)
	{
		return _delegate.key_equal(key1,key2);
	}

	public org.omg.CORBA.Any key(org.omg.CORBA.Any element)
	{
		return _delegate.key(element);
	}

	public org.omg.CORBA.TypeCode element_type()
	{
		return _delegate.element_type();
	}

	public boolean equal(org.omg.CORBA.Any element1, org.omg.CORBA.Any element2)
	{
		return _delegate.equal(element1,element2);
	}

	public boolean check_element_type(org.omg.CORBA.Any element)
	{
		return _delegate.check_element_type(element);
	}

	public org.omg.CORBA.TypeCode key_type()
	{
		return _delegate.key_type();
	}

	public int key_compare(org.omg.CORBA.Any key1, org.omg.CORBA.Any key2)
	{
		return _delegate.key_compare(key1,key2);
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public boolean check_key_type(org.omg.CORBA.Any key)
	{
		return _delegate.check_key_type(key);
	}

}

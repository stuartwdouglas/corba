package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "RestrictedAccessCollection".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public class RestrictedAccessCollectionPOATie
	extends RestrictedAccessCollectionPOA
{
	private RestrictedAccessCollectionOperations _delegate;

	private POA _poa;
	public RestrictedAccessCollectionPOATie(RestrictedAccessCollectionOperations delegate)
	{
		_delegate = delegate;
	}
	public RestrictedAccessCollectionPOATie(RestrictedAccessCollectionOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.RestrictedAccessCollection _this()
	{
		return org.omg.CosCollection.RestrictedAccessCollectionHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.RestrictedAccessCollection _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.RestrictedAccessCollectionHelper.narrow(_this_object(orb));
	}
	public RestrictedAccessCollectionOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RestrictedAccessCollectionOperations delegate)
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
	public void purge()
	{
_delegate.purge();
	}

	public boolean unfilled()
	{
		return _delegate.unfilled();
	}

	public int size()
	{
		return _delegate.size();
	}

}

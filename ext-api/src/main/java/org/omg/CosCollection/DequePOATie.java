package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Deque".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public class DequePOATie
	extends DequePOA
{
	private DequeOperations _delegate;

	private POA _poa;
	public DequePOATie(DequeOperations delegate)
	{
		_delegate = delegate;
	}
	public DequePOATie(DequeOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.Deque _this()
	{
		return org.omg.CosCollection.DequeHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.Deque _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.DequeHelper.narrow(_this_object(orb));
	}
	public DequeOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(DequeOperations delegate)
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

	public void enqueue_as_last(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid
	{
_delegate.enqueue_as_last(element);
	}

	public boolean element_dequeue_first(org.omg.CORBA.AnyHolder element) throws org.omg.CosCollection.EmptyCollection
	{
		return _delegate.element_dequeue_first(element);
	}

	public int size()
	{
		return _delegate.size();
	}

	public void dequeue_first() throws org.omg.CosCollection.EmptyCollection
	{
_delegate.dequeue_first();
	}

	public boolean element_dequeue_last(org.omg.CORBA.AnyHolder element) throws org.omg.CosCollection.EmptyCollection
	{
		return _delegate.element_dequeue_last(element);
	}

	public boolean unfilled()
	{
		return _delegate.unfilled();
	}

	public void enqueue_as_first(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid
	{
_delegate.enqueue_as_first(element);
	}

	public void dequeue_last() throws org.omg.CosCollection.EmptyCollection
	{
_delegate.dequeue_last();
	}

}

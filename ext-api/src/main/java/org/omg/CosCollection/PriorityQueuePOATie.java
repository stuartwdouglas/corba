package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "PriorityQueue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public class PriorityQueuePOATie
	extends PriorityQueuePOA
{
	private PriorityQueueOperations _delegate;

	private POA _poa;
	public PriorityQueuePOATie(PriorityQueueOperations delegate)
	{
		_delegate = delegate;
	}
	public PriorityQueuePOATie(PriorityQueueOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.PriorityQueue _this()
	{
		return org.omg.CosCollection.PriorityQueueHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.PriorityQueue _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.PriorityQueueHelper.narrow(_this_object(orb));
	}
	public PriorityQueueOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PriorityQueueOperations delegate)
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

	public boolean element_dequeue(org.omg.CORBA.AnyHolder element) throws org.omg.CosCollection.EmptyCollection
	{
		return _delegate.element_dequeue(element);
	}

	public void dequeue() throws org.omg.CosCollection.EmptyCollection
	{
_delegate.dequeue();
	}

	public void enqueue(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid
	{
_delegate.enqueue(element);
	}

}

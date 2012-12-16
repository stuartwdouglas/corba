package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Queue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public class QueuePOATie
	extends QueuePOA
{
	private QueueOperations _delegate;

	private POA _poa;
	public QueuePOATie(QueueOperations delegate)
	{
		_delegate = delegate;
	}
	public QueuePOATie(QueueOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.Queue _this()
	{
		return org.omg.CosCollection.QueueHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.Queue _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.QueueHelper.narrow(_this_object(orb));
	}
	public QueueOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(QueueOperations delegate)
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

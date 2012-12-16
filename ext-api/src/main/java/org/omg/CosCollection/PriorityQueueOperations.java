package org.omg.CosCollection;


/**
 * Generated from IDL interface "PriorityQueue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public interface PriorityQueueOperations
	extends org.omg.CosCollection.RestrictedAccessCollectionOperations
{
	/* constants */
	/* operations  */
	void enqueue(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid;
	void dequeue() throws org.omg.CosCollection.EmptyCollection;
	boolean element_dequeue(org.omg.CORBA.AnyHolder element) throws org.omg.CosCollection.EmptyCollection;
}

package org.omg.CosCollection;


/**
 * Generated from IDL interface "Queue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public interface QueueOperations
	extends org.omg.CosCollection.RestrictedAccessCollectionOperations
{
	/* constants */
	/* operations  */
	void enqueue(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid;
	void dequeue() throws org.omg.CosCollection.EmptyCollection;
	boolean element_dequeue(org.omg.CORBA.AnyHolder element) throws org.omg.CosCollection.EmptyCollection;
}

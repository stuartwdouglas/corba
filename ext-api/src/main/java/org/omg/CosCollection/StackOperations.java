package org.omg.CosCollection;


/**
 * Generated from IDL interface "Stack".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public interface StackOperations
	extends org.omg.CosCollection.RestrictedAccessCollectionOperations
{
	/* constants */
	/* operations  */
	void push(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid;
	void pop() throws org.omg.CosCollection.EmptyCollection;
	boolean element_pop(org.omg.CORBA.AnyHolder element) throws org.omg.CosCollection.EmptyCollection;
	boolean top(org.omg.CORBA.AnyHolder element) throws org.omg.CosCollection.EmptyCollection;
}

package org.omg.CosCollection;


/**
 * Generated from IDL interface "EqualityIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public interface EqualityIteratorOperations
	extends org.omg.CosCollection.IteratorOperations
{
	/* constants */
	/* operations  */
	boolean set_to_element_with_value(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid;
	boolean set_to_next_element_with_value(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid;
	boolean set_to_next_element_with_different_value() throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween;
}

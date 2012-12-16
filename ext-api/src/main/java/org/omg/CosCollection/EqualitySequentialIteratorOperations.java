package org.omg.CosCollection;


/**
 * Generated from IDL interface "EqualitySequentialIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public interface EqualitySequentialIteratorOperations
	extends org.omg.CosCollection.EqualityIteratorOperations , org.omg.CosCollection.SequentialIteratorOperations
{
	/* constants */
	/* operations  */
	boolean set_to_first_element_with_value(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid;
	boolean set_to_last_element_with_value(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid;
	boolean set_to_previous_element_with_value(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid;
}

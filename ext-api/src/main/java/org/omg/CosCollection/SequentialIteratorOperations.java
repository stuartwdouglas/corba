package org.omg.CosCollection;


/**
 * Generated from IDL interface "SequentialIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public interface SequentialIteratorOperations
	extends org.omg.CosCollection.OrderedIteratorOperations
{
	/* constants */
	/* operations  */
	boolean add_element_as_next_set_iterator(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid;
	void add_n_elements_as_next_set_iterator(org.omg.CORBA.Any[] elements) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid;
	boolean add_element_as_previous_set_iterator(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid;
	void add_n_elements_as_previous_set_iterator(org.omg.CORBA.Any[] elements) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid;
}

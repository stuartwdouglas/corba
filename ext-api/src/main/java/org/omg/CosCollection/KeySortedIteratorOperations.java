package org.omg.CosCollection;


/**
 * Generated from IDL interface "KeySortedIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public interface KeySortedIteratorOperations
	extends org.omg.CosCollection.KeyIteratorOperations , org.omg.CosCollection.SortedIteratorOperations
{
	/* constants */
	/* operations  */
	boolean set_to_first_element_with_key(org.omg.CORBA.Any key, org.omg.CosCollection.LowerBoundStyle style) throws org.omg.CosCollection.KeyInvalid;
	boolean set_to_last_element_with_key(org.omg.CORBA.Any key, org.omg.CosCollection.UpperBoundStyle style) throws org.omg.CosCollection.KeyInvalid;
	boolean set_to_previous_element_with_key(org.omg.CORBA.Any key) throws org.omg.CosCollection.KeyInvalid,org.omg.CosCollection.IteratorInvalid;
	boolean set_to_previous_element_with_different_key() throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween;
	boolean retrieve_previous_n_keys(org.omg.CosCollection.AnySequenceHolder keys) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween;
}

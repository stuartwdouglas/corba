package org.omg.CosCollection;


/**
 * Generated from IDL interface "EqualitySequence".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public interface EqualitySequenceOperations
	extends org.omg.CosCollection.EqualitySequentialCollectionOperations
{
	/* constants */
	/* operations  */
	boolean equal(org.omg.CosCollection.EqualitySequence collector);
	boolean not_equal(org.omg.CosCollection.EqualitySequence collector);
	int compare(org.omg.CosCollection.EqualitySequence collector, org.omg.CosCollection.Comparator comparison);
}

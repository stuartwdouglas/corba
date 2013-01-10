package org.omg.CosCollection;


/**
 * Generated from IDL interface "Map".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public interface MapOperations
	extends org.omg.CosCollection.EqualityKeyCollectionOperations
{
	/* constants */
	/* operations  */
	void difference_with(org.omg.CosCollection.Map collector) throws org.omg.CosCollection.ElementInvalid;
	void add_difference(org.omg.CosCollection.Map collector1, org.omg.CosCollection.Map collector2) throws org.omg.CosCollection.ElementInvalid;
	void intersection_with(org.omg.CosCollection.Map collector) throws org.omg.CosCollection.ElementInvalid;
	void add_intersection(org.omg.CosCollection.Map collector1, org.omg.CosCollection.Map collector2) throws org.omg.CosCollection.ElementInvalid;
	void union_with(org.omg.CosCollection.Map collector) throws org.omg.CosCollection.ElementInvalid;
	void add_union(org.omg.CosCollection.Map collector1, org.omg.CosCollection.Map collector2) throws org.omg.CosCollection.ElementInvalid;
	boolean equal(org.omg.CosCollection.Map collector) throws org.omg.CosCollection.ElementInvalid;
	boolean not_equal(org.omg.CosCollection.Map collector) throws org.omg.CosCollection.ElementInvalid;
}

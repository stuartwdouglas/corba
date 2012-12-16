package org.omg.CosCollection;


/**
 * Generated from IDL interface "RACollectionFactories".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public interface RACollectionFactoriesOperations
	extends org.omg.CosCollection.RACollectionFactoryOperations
{
	/* constants */
	/* operations  */
	boolean add_factory(java.lang.String collection_interface, java.lang.String impl_category, java.lang.String impl_interface, org.omg.CosCollection.RACollectionFactory factory);
	boolean remove_factory(java.lang.String collection_interface, java.lang.String impl_category, java.lang.String impl_interface);
	org.omg.CosCollection.Collection create(org.omg.CosCollection.NVPair[] parameters) throws org.omg.CosCollection.ParameterInvalid;
}

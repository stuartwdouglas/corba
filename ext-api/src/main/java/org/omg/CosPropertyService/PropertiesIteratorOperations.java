package org.omg.CosPropertyService;


/**
 * Generated from IDL interface "PropertiesIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public interface PropertiesIteratorOperations
{
	/* constants */
	/* operations  */
	void reset();
	boolean next_one(org.omg.CosPropertyService.PropertyHolder aproperty);
	boolean next_n(int how_many, org.omg.CosPropertyService.PropertiesHolder nproperties);
	void destroy();
}

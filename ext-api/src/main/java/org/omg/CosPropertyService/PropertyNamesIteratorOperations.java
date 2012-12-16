package org.omg.CosPropertyService;


/**
 * Generated from IDL interface "PropertyNamesIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public interface PropertyNamesIteratorOperations
{
	/* constants */
	/* operations  */
	void reset();
	boolean next_one(org.omg.CORBA.StringHolder property_name);
	boolean next_n(int how_many, org.omg.CosPropertyService.PropertyNamesHolder property_names);
	void destroy();
}

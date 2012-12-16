package org.omg.CosNaming;


/**
 * Generated from IDL interface "BindingIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:39 PM
 */

public interface BindingIteratorOperations
{
	/* constants */
	/* operations  */
	boolean next_one(org.omg.CosNaming.BindingHolder b);
	boolean next_n(int how_many, org.omg.CosNaming.BindingListHolder bl);
	void destroy();
}

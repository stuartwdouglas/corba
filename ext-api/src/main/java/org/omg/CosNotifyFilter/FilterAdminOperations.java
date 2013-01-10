package org.omg.CosNotifyFilter;


/**
 * Generated from IDL interface "FilterAdmin".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public interface FilterAdminOperations
{
	/* constants */
	/* operations  */
	int add_filter(org.omg.CosNotifyFilter.Filter new_filter);
	void remove_filter(int filter) throws org.omg.CosNotifyFilter.FilterNotFound;
	org.omg.CosNotifyFilter.Filter get_filter(int filter) throws org.omg.CosNotifyFilter.FilterNotFound;
	int[] get_all_filters();
	void remove_all_filters();
}

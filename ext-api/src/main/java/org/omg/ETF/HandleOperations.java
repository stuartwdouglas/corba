package org.omg.ETF;


/**
 * Generated from IDL interface "Handle".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public interface HandleOperations
{
	/* constants */
	/* operations  */
	boolean add_input(org.omg.ETF.Connection conn);
	void signal_data_available(org.omg.ETF.Connection conn);
	void closed_by_peer(org.omg.ETF.Connection conn);
}

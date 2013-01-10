package org.omg.ETF;


/**
 * Generated from IDL interface "Listener".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public interface ListenerOperations
{
	/* constants */
	/* operations  */
	void set_handle(org.omg.ETF.Handle up);
	org.omg.ETF.Connection accept();
	void listen();
	void destroy();
	void completed_data(org.omg.ETF.Connection conn);
	org.omg.ETF.Profile endpoint();
}

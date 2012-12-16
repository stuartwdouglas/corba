package org.omg.ETF;


/**
 * Generated from IDL interface "Listener".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
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

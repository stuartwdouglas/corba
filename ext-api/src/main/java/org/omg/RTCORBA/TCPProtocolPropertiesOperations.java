package org.omg.RTCORBA;


/**
 * Generated from IDL interface "TCPProtocolProperties".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public interface TCPProtocolPropertiesOperations
	extends org.omg.RTCORBA.ProtocolPropertiesOperations
{
	/* constants */
	/* operations  */
	int send_buffer_size();
	void send_buffer_size(int arg);
	int recv_buffer_size();
	void recv_buffer_size(int arg);
	boolean keep_alive();
	void keep_alive(boolean arg);
	boolean dont_route();
	void dont_route(boolean arg);
	boolean no_delay();
	void no_delay(boolean arg);
}

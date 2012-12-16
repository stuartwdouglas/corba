package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "ClientRequestInterceptor".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public interface ClientRequestInterceptorOperations
	extends org.omg.PortableInterceptor.InterceptorOperations
{
	/* constants */
	/* operations  */
	void send_request(org.omg.PortableInterceptor.ClientRequestInfo ri) throws org.omg.PortableInterceptor.ForwardRequest;
	void send_poll(org.omg.PortableInterceptor.ClientRequestInfo ri);
	void receive_reply(org.omg.PortableInterceptor.ClientRequestInfo ri);
	void receive_exception(org.omg.PortableInterceptor.ClientRequestInfo ri) throws org.omg.PortableInterceptor.ForwardRequest;
	void receive_other(org.omg.PortableInterceptor.ClientRequestInfo ri) throws org.omg.PortableInterceptor.ForwardRequest;
}

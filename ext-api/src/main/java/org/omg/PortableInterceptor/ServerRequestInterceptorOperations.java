package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "ServerRequestInterceptor".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public interface ServerRequestInterceptorOperations
	extends org.omg.PortableInterceptor.InterceptorOperations
{
	/* constants */
	/* operations  */
	void receive_request_service_contexts(org.omg.PortableInterceptor.ServerRequestInfo ri) throws org.omg.PortableInterceptor.ForwardRequest;
	void receive_request(org.omg.PortableInterceptor.ServerRequestInfo ri) throws org.omg.PortableInterceptor.ForwardRequest;
	void send_reply(org.omg.PortableInterceptor.ServerRequestInfo ri);
	void send_exception(org.omg.PortableInterceptor.ServerRequestInfo ri) throws org.omg.PortableInterceptor.ForwardRequest;
	void send_other(org.omg.PortableInterceptor.ServerRequestInfo ri) throws org.omg.PortableInterceptor.ForwardRequest;
}

package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "ClientRequestInfo".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public interface ClientRequestInfoOperations
	extends org.omg.PortableInterceptor.RequestInfoOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.Object target();
	org.omg.CORBA.Object effective_target();
	org.omg.IOP.TaggedProfile effective_profile();
	org.omg.CORBA.Any received_exception();
	java.lang.String received_exception_id();
	org.omg.IOP.TaggedComponent get_effective_component(int id);
	org.omg.IOP.TaggedComponent[] get_effective_components(int id);
	org.omg.CORBA.Policy get_request_policy(int type);
	void add_request_service_context(org.omg.IOP.ServiceContext service_context, boolean replace);
}

package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "ORBInitInfo".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public interface ORBInitInfoOperations
{
	/* constants */
	/* operations  */
	java.lang.String[] arguments();
	java.lang.String orb_id();
	org.omg.IOP.CodecFactory codec_factory();
	void register_initial_reference(java.lang.String id, org.omg.CORBA.Object obj) throws org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidName;
	org.omg.CORBA.Object resolve_initial_references(java.lang.String id) throws org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidName;
	void add_client_request_interceptor(org.omg.PortableInterceptor.ClientRequestInterceptor interceptor) throws org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;
	void add_server_request_interceptor(org.omg.PortableInterceptor.ServerRequestInterceptor interceptor) throws org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;
	void add_ior_interceptor(org.omg.PortableInterceptor.IORInterceptor interceptor) throws org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;
	int allocate_slot_id();
	void register_policy_factory(int type, org.omg.PortableInterceptor.PolicyFactory policy_factory);
}

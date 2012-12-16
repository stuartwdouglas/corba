package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "IORInfo".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public interface IORInfoOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.Policy get_effective_policy(int type);
	void add_ior_component(org.omg.IOP.TaggedComponent component);
	void add_ior_component_to_profile(org.omg.IOP.TaggedComponent component, int profile_id);
}

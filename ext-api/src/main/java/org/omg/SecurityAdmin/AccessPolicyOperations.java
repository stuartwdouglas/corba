package org.omg.SecurityAdmin;


/**
 * Generated from IDL interface "AccessPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public interface AccessPolicyOperations
	extends org.omg.CORBA.PolicyOperations
{
	/* constants */
	/* operations  */
	org.omg.Security.Right[] get_effective_rights(org.omg.Security.SecAttribute[] attrib_list, org.omg.Security.ExtensibleFamily rights_family);
	org.omg.Security.Right[] get_all_effective_rights(org.omg.Security.SecAttribute[] attrib_list);
}

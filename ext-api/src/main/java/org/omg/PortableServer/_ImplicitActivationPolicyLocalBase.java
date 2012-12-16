package org.omg.PortableServer;


/**
 * Abstract base class for implementations of local interface ImplicitActivationPolicy
 * @author JacORB IDL compiler.
 */

public abstract class _ImplicitActivationPolicyLocalBase
	extends org.omg.CORBA.LocalObject
	implements ImplicitActivationPolicy
{
	private String[] _type_ids = {"IDL:omg.org/PortableServer/ImplicitActivationPolicy:1.0","IDL:omg.org/CORBA/Policy:1.0"};
	public String[] _ids()	{
		return(String[])_type_ids.clone();
	}
}

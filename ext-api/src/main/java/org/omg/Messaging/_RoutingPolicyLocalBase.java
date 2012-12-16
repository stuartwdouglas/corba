package org.omg.Messaging;


/**
 * Abstract base class for implementations of local interface RoutingPolicy
 * @author JacORB IDL compiler.
 */

public abstract class _RoutingPolicyLocalBase
	extends org.omg.CORBA.LocalObject
	implements RoutingPolicy
{
	private String[] _type_ids = {"IDL:omg.org/Messaging/RoutingPolicy:1.0","IDL:omg.org/CORBA/Policy:1.0"};
	public String[] _ids()	{
		return(String[])_type_ids.clone();
	}
}

package org.omg.Messaging;


/**
 * Abstract base class for implementations of local interface RequestPriorityPolicy
 * @author JacORB IDL compiler.
 */

public abstract class _RequestPriorityPolicyLocalBase
	extends org.omg.CORBA.LocalObject
	implements RequestPriorityPolicy
{
	private String[] _type_ids = {"IDL:omg.org/Messaging/RequestPriorityPolicy:1.0","IDL:omg.org/CORBA/Policy:1.0"};
	public String[] _ids()	{
		return(String[])_type_ids.clone();
	}
}

package org.omg.PortableServer;


/**
 * Abstract base class for implementations of local interface RequestProcessingPolicy
 * @author JacORB IDL compiler.
 */

public abstract class _RequestProcessingPolicyLocalBase
	extends org.omg.CORBA.LocalObject
	implements RequestProcessingPolicy
{
	private String[] _type_ids = {"IDL:omg.org/PortableServer/RequestProcessingPolicy:1.0","IDL:omg.org/CORBA/Policy:1.0"};
	public String[] _ids()	{
		return(String[])_type_ids.clone();
	}
}

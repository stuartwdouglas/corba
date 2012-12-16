package org.omg.PortableServer;


/**
 * Abstract base class for implementations of local interface ThreadPolicy
 * @author JacORB IDL compiler.
 */

public abstract class _ThreadPolicyLocalBase
	extends org.omg.CORBA.LocalObject
	implements ThreadPolicy
{
	private String[] _type_ids = {"IDL:omg.org/PortableServer/ThreadPolicy:1.0","IDL:omg.org/CORBA/Policy:1.0"};
	public String[] _ids()	{
		return(String[])_type_ids.clone();
	}
}

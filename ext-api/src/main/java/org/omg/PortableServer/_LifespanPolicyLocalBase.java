package org.omg.PortableServer;


/**
 * Abstract base class for implementations of local interface LifespanPolicy
 * @author JacORB IDL compiler.
 */

public abstract class _LifespanPolicyLocalBase
	extends org.omg.CORBA.LocalObject
	implements LifespanPolicy
{
	private String[] _type_ids = {"IDL:omg.org/PortableServer/LifespanPolicy:1.0","IDL:omg.org/CORBA/Policy:1.0"};
	public String[] _ids()	{
		return(String[])_type_ids.clone();
	}
}

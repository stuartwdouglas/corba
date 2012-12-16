package org.omg.Messaging;


/**
 * Abstract base class for implementations of local interface SyncScopePolicy
 * @author JacORB IDL compiler.
 */

public abstract class _SyncScopePolicyLocalBase
	extends org.omg.CORBA.LocalObject
	implements SyncScopePolicy
{
	private String[] _type_ids = {"IDL:omg.org/Messaging/SyncScopePolicy:1.0","IDL:omg.org/CORBA/Policy:1.0"};
	public String[] _ids()	{
		return(String[])_type_ids.clone();
	}
}

package org.omg.Messaging;


/**
 * Abstract base class for implementations of local interface RequestStartTimePolicy
 * @author JacORB IDL compiler.
 */

public abstract class _RequestStartTimePolicyLocalBase
	extends org.omg.CORBA.LocalObject
	implements RequestStartTimePolicy
{
	private String[] _type_ids = {"IDL:omg.org/Messaging/RequestStartTimePolicy:1.0","IDL:omg.org/CORBA/Policy:1.0"};
	public String[] _ids()	{
		return(String[])_type_ids.clone();
	}
}

package org.omg.CORBA;


/**
 * Abstract base class for implementations of local interface DomainManager
 * @author JacORB IDL compiler.
 */

public abstract class _DomainManagerLocalBase
	extends org.omg.CORBA.LocalObject
	implements DomainManager
{
	private String[] _type_ids = {"IDL:omg.org/CORBA/DomainManager:1.0"};
	public String[] _ids()	{
		return(String[])_type_ids.clone();
	}
}

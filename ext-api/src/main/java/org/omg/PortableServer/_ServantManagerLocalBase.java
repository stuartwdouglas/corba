package org.omg.PortableServer;


/**
 * Abstract base class for implementations of local interface ServantManager
 * @author JacORB IDL compiler.
 */

public abstract class _ServantManagerLocalBase
	extends org.omg.CORBA.LocalObject
	implements ServantManager
{
	private String[] _type_ids = {"IDL:omg.org/PortableServer/ServantManager:1.0"};
	public String[] _ids()	{
		return(String[])_type_ids.clone();
	}
}

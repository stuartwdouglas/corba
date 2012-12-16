package org.omg.PortableServer;


/**
 * Abstract base class for implementations of local interface ServantActivator
 * @author JacORB IDL compiler.
 */

public abstract class _ServantActivatorLocalBase
	extends org.omg.CORBA.LocalObject
	implements ServantActivator
{
	private String[] _type_ids = {"IDL:omg.org/PortableServer/ServantActivator:1.0","IDL:omg.org/PortableServer/ServantManager:1.0"};
	public String[] _ids()	{
		return(String[])_type_ids.clone();
	}
}

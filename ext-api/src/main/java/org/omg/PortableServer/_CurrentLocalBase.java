package org.omg.PortableServer;


/**
 * Abstract base class for implementations of local interface Current
 * @author JacORB IDL compiler.
 */

public abstract class _CurrentLocalBase
	extends org.omg.CORBA.LocalObject
	implements Current
{
	private String[] _type_ids = {"IDL:omg.org/PortableServer/Current:1.0","IDL:omg.org/CORBA/Current:1.0"};
	public String[] _ids()	{
		return(String[])_type_ids.clone();
	}
}

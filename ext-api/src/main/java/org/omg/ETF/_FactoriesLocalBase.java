package org.omg.ETF;


/**
 * Abstract base class for implementations of local interface Factories
 * @author JacORB IDL compiler.
 */

public abstract class _FactoriesLocalBase
	extends org.omg.CORBA.LocalObject
	implements Factories
{
	private String[] _type_ids = {"IDL:omg.org/ETF/Factories:1.0"};
	public String[] _ids()	{
		return(String[])_type_ids.clone();
	}
}

package org.omg.CosTransactions;

/**
 * Generated from IDL struct "PropagationContext".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public final class PropagationContext
	implements org.omg.CORBA.portable.IDLEntity
{
	public PropagationContext(){}
	public int timeout;
	public org.omg.CosTransactions.TransIdentity current;
	public org.omg.CosTransactions.TransIdentity[] parents;
	public org.omg.CORBA.Any implementation_specific_data;
	public PropagationContext(int timeout, org.omg.CosTransactions.TransIdentity current, org.omg.CosTransactions.TransIdentity[] parents, org.omg.CORBA.Any implementation_specific_data)
	{
		this.timeout = timeout;
		this.current = current;
		this.parents = parents;
		this.implementation_specific_data = implementation_specific_data;
	}
}

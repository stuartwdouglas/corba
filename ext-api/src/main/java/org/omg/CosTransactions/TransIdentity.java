package org.omg.CosTransactions;

/**
 * Generated from IDL struct "TransIdentity".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public final class TransIdentity
	implements org.omg.CORBA.portable.IDLEntity
{
	public TransIdentity(){}
	public org.omg.CosTransactions.Coordinator coord;
	public org.omg.CosTransactions.Terminator term;
	public org.omg.CosTransactions.otid_t otid;
	public TransIdentity(org.omg.CosTransactions.Coordinator coord, org.omg.CosTransactions.Terminator term, org.omg.CosTransactions.otid_t otid)
	{
		this.coord = coord;
		this.term = term;
		this.otid = otid;
	}
}

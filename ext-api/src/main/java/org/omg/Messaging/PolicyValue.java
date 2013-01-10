package org.omg.Messaging;

/**
 * Generated from IDL struct "PolicyValue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class PolicyValue
	implements org.omg.CORBA.portable.IDLEntity
{
	public PolicyValue(){}
	public int ptype;
	public byte[] pvalue;
	public PolicyValue(int ptype, byte[] pvalue)
	{
		this.ptype = ptype;
		this.pvalue = pvalue;
	}
}

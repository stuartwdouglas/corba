package org.omg.Security;

/**
 * Generated from IDL struct "EstablishTrust".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class EstablishTrust
	implements org.omg.CORBA.portable.IDLEntity
{
	public EstablishTrust(){}
	public boolean trust_in_client;
	public boolean trust_in_target;
	public EstablishTrust(boolean trust_in_client, boolean trust_in_target)
	{
		this.trust_in_client = trust_in_client;
		this.trust_in_target = trust_in_target;
	}
}

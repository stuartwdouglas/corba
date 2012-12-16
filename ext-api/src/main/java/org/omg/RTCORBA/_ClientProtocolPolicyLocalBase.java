package org.omg.RTCORBA;


/**
 * Abstract base class for implementations of local interface ClientProtocolPolicy
 * @author JacORB IDL compiler.
 */

public abstract class _ClientProtocolPolicyLocalBase
	extends org.omg.CORBA.LocalObject
	implements ClientProtocolPolicy
{
	private String[] _type_ids = {"IDL:omg.org/RTCORBA/ClientProtocolPolicy:1.0","IDL:omg.org/CORBA/Policy:1.0"};
	public String[] _ids()	{
		return(String[])_type_ids.clone();
	}
}

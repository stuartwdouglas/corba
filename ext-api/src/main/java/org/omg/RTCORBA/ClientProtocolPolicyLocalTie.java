package org.omg.RTCORBA;


/**
 * Generated from IDL interface "ClientProtocolPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public class ClientProtocolPolicyLocalTie
	extends _ClientProtocolPolicyLocalBase
{
	private ClientProtocolPolicyOperations _delegate;

	public ClientProtocolPolicyLocalTie(ClientProtocolPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public ClientProtocolPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ClientProtocolPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public int policy_type()
	{
		return _delegate.policy_type();
	}

	public org.omg.CORBA.Policy copy()
	{
		return _delegate.copy();
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public org.omg.RTCORBA.Protocol[] protocols()
	{
		return _delegate.protocols();
	}

}

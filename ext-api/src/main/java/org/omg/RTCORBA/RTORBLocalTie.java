package org.omg.RTCORBA;


/**
 * Generated from IDL interface "RTORB".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public class RTORBLocalTie
	extends _RTORBLocalBase
{
	private RTORBOperations _delegate;

	public RTORBLocalTie(RTORBOperations delegate)
	{
		_delegate = delegate;
	}
	public RTORBOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RTORBOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.RTCORBA.ClientProtocolPolicy create_client_protocol_policy(org.omg.RTCORBA.Protocol[] protocols)
	{
		return _delegate.create_client_protocol_policy(protocols);
	}

}

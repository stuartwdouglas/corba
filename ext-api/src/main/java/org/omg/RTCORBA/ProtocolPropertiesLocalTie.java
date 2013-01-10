package org.omg.RTCORBA;


/**
 * Generated from IDL interface "ProtocolProperties".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public class ProtocolPropertiesLocalTie
	extends _ProtocolPropertiesLocalBase
{
	private ProtocolPropertiesOperations _delegate;

	public ProtocolPropertiesLocalTie(ProtocolPropertiesOperations delegate)
	{
		_delegate = delegate;
	}
	public ProtocolPropertiesOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProtocolPropertiesOperations delegate)
	{
		_delegate = delegate;
	}
}

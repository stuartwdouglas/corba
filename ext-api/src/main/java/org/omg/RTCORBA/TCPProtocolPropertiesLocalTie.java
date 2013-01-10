package org.omg.RTCORBA;


/**
 * Generated from IDL interface "TCPProtocolProperties".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public class TCPProtocolPropertiesLocalTie
	extends _TCPProtocolPropertiesLocalBase
{
	private TCPProtocolPropertiesOperations _delegate;

	public TCPProtocolPropertiesLocalTie(TCPProtocolPropertiesOperations delegate)
	{
		_delegate = delegate;
	}
	public TCPProtocolPropertiesOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TCPProtocolPropertiesOperations delegate)
	{
		_delegate = delegate;
	}
	public boolean no_delay()
	{
		return _delegate.no_delay();
	}

	public int recv_buffer_size()
	{
		return _delegate.recv_buffer_size();
	}

	public void recv_buffer_size(int a)
	{
		_delegate.recv_buffer_size(a);
	}

	public boolean keep_alive()
	{
		return _delegate.keep_alive();
	}

	public void keep_alive(boolean a)
	{
		_delegate.keep_alive(a);
	}

	public int send_buffer_size()
	{
		return _delegate.send_buffer_size();
	}

	public boolean dont_route()
	{
		return _delegate.dont_route();
	}

	public void dont_route(boolean a)
	{
		_delegate.dont_route(a);
	}

	public void no_delay(boolean a)
	{
		_delegate.no_delay(a);
	}

	public void send_buffer_size(int a)
	{
		_delegate.send_buffer_size(a);
	}

}

package org.omg.ETF;


/**
 * Generated from IDL interface "Listener".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public class ListenerLocalTie
	extends _ListenerLocalBase
{
	private ListenerOperations _delegate;

	public ListenerLocalTie(ListenerOperations delegate)
	{
		_delegate = delegate;
	}
	public ListenerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ListenerOperations delegate)
	{
		_delegate = delegate;
	}
	public void listen()
	{
_delegate.listen();
	}

	public org.omg.ETF.Connection accept()
	{
		return _delegate.accept();
	}

	public void completed_data(org.omg.ETF.Connection conn)
	{
_delegate.completed_data(conn);
	}

	public org.omg.ETF.Profile endpoint()
	{
		return _delegate.endpoint();
	}

	public void set_handle(org.omg.ETF.Handle up)
	{
_delegate.set_handle(up);
	}

	public void destroy()
	{
_delegate.destroy();
	}

}

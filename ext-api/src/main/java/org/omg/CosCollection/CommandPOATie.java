package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Command".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public class CommandPOATie
	extends CommandPOA
{
	private CommandOperations _delegate;

	private POA _poa;
	public CommandPOATie(CommandOperations delegate)
	{
		_delegate = delegate;
	}
	public CommandPOATie(CommandOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.Command _this()
	{
		return org.omg.CosCollection.CommandHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.Command _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.CommandHelper.narrow(_this_object(orb));
	}
	public CommandOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CommandOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public boolean do_on(org.omg.CORBA.Any element)
	{
		return _delegate.do_on(element);
	}

}

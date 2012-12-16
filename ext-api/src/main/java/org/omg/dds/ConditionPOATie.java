package org.omg.dds;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Condition".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public class ConditionPOATie
	extends ConditionPOA
{
	private ConditionOperations _delegate;

	private POA _poa;
	public ConditionPOATie(ConditionOperations delegate)
	{
		_delegate = delegate;
	}
	public ConditionPOATie(ConditionOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.dds.Condition _this()
	{
		return org.omg.dds.ConditionHelper.narrow(_this_object());
	}
	public org.omg.dds.Condition _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.ConditionHelper.narrow(_this_object(orb));
	}
	public ConditionOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ConditionOperations delegate)
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
	public boolean get_trigger_value()
	{
		return _delegate.get_trigger_value();
	}

}

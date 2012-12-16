package org.omg.dds;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "GuardCondition".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public class GuardConditionPOATie
	extends GuardConditionPOA
{
	private GuardConditionOperations _delegate;

	private POA _poa;
	public GuardConditionPOATie(GuardConditionOperations delegate)
	{
		_delegate = delegate;
	}
	public GuardConditionPOATie(GuardConditionOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.dds.GuardCondition _this()
	{
		return org.omg.dds.GuardConditionHelper.narrow(_this_object());
	}
	public org.omg.dds.GuardCondition _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.GuardConditionHelper.narrow(_this_object(orb));
	}
	public GuardConditionOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(GuardConditionOperations delegate)
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
	public void set_trigger_value(boolean value)
	{
_delegate.set_trigger_value(value);
	}

	public boolean get_trigger_value()
	{
		return _delegate.get_trigger_value();
	}

}

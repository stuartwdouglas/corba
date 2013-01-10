package org.omg.dds;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "StatusCondition".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public class StatusConditionPOATie
	extends StatusConditionPOA
{
	private StatusConditionOperations _delegate;

	private POA _poa;
	public StatusConditionPOATie(StatusConditionOperations delegate)
	{
		_delegate = delegate;
	}
	public StatusConditionPOATie(StatusConditionOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.dds.StatusCondition _this()
	{
		return org.omg.dds.StatusConditionHelper.narrow(_this_object());
	}
	public org.omg.dds.StatusCondition _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.StatusConditionHelper.narrow(_this_object(orb));
	}
	public StatusConditionOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(StatusConditionOperations delegate)
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
	public int set_enabled_statuses(int mask)
	{
		return _delegate.set_enabled_statuses(mask);
	}

	public boolean get_trigger_value()
	{
		return _delegate.get_trigger_value();
	}

	public org.omg.dds.Entity get_entity()
	{
		return _delegate.get_entity();
	}

	public int get_enabled_statuses()
	{
		return _delegate.get_enabled_statuses();
	}

}

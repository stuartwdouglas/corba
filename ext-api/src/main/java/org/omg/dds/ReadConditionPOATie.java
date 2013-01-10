package org.omg.dds;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ReadCondition".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public class ReadConditionPOATie
	extends ReadConditionPOA
{
	private ReadConditionOperations _delegate;

	private POA _poa;
	public ReadConditionPOATie(ReadConditionOperations delegate)
	{
		_delegate = delegate;
	}
	public ReadConditionPOATie(ReadConditionOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.dds.ReadCondition _this()
	{
		return org.omg.dds.ReadConditionHelper.narrow(_this_object());
	}
	public org.omg.dds.ReadCondition _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.ReadConditionHelper.narrow(_this_object(orb));
	}
	public ReadConditionOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ReadConditionOperations delegate)
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
	public org.omg.dds.DataReader get_datareader()
	{
		return _delegate.get_datareader();
	}

	public int get_instance_state_mask()
	{
		return _delegate.get_instance_state_mask();
	}

	public int get_view_state_mask()
	{
		return _delegate.get_view_state_mask();
	}

	public int get_sample_state_mask()
	{
		return _delegate.get_sample_state_mask();
	}

	public boolean get_trigger_value()
	{
		return _delegate.get_trigger_value();
	}

}

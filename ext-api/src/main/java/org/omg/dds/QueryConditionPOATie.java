package org.omg.dds;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "QueryCondition".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public class QueryConditionPOATie
	extends QueryConditionPOA
{
	private QueryConditionOperations _delegate;

	private POA _poa;
	public QueryConditionPOATie(QueryConditionOperations delegate)
	{
		_delegate = delegate;
	}
	public QueryConditionPOATie(QueryConditionOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.dds.QueryCondition _this()
	{
		return org.omg.dds.QueryConditionHelper.narrow(_this_object());
	}
	public org.omg.dds.QueryCondition _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.QueryConditionHelper.narrow(_this_object(orb));
	}
	public QueryConditionOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(QueryConditionOperations delegate)
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

	public java.lang.String[] get_query_arguments()
	{
		return _delegate.get_query_arguments();
	}

	public java.lang.String get_query_expression()
	{
		return _delegate.get_query_expression();
	}

	public int get_sample_state_mask()
	{
		return _delegate.get_sample_state_mask();
	}

	public int get_view_state_mask()
	{
		return _delegate.get_view_state_mask();
	}

	public int get_instance_state_mask()
	{
		return _delegate.get_instance_state_mask();
	}

	public boolean get_trigger_value()
	{
		return _delegate.get_trigger_value();
	}

	public int set_query_arguments(java.lang.String[] query_arguments)
	{
		return _delegate.set_query_arguments(query_arguments);
	}

}

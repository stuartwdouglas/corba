package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "SortedIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public class SortedIteratorPOATie
	extends SortedIteratorPOA
{
	private SortedIteratorOperations _delegate;

	private POA _poa;
	public SortedIteratorPOATie(SortedIteratorOperations delegate)
	{
		_delegate = delegate;
	}
	public SortedIteratorPOATie(SortedIteratorOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.SortedIterator _this()
	{
		return org.omg.CosCollection.SortedIteratorHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.SortedIterator _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.SortedIteratorHelper.narrow(_this_object(orb));
	}
	public SortedIteratorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SortedIteratorOperations delegate)
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
	public org.omg.CosCollection.Iterator _clone()
	{
		return _delegate._clone();
	}

	public boolean add_n_elements_set_iterator(org.omg.CORBA.Any[] elements, org.omg.CORBA.IntHolder actual_number) throws org.omg.CosCollection.ElementInvalid
	{
		return _delegate.add_n_elements_set_iterator(elements,actual_number);
	}

	public boolean replace_element_set_to_previous(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.replace_element_set_to_previous(element);
	}

	public boolean is_valid()
	{
		return _delegate.is_valid();
	}

	public boolean remove_next_n_elements(int n, org.omg.CORBA.IntHolder actual_number) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.remove_next_n_elements(n,actual_number);
	}

	public boolean set_to_next_nth_element(int n) throws org.omg.CosCollection.IteratorInvalid
	{
		return _delegate.set_to_next_nth_element(n);
	}

	public void replace_element(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
_delegate.replace_element(element);
	}

	public boolean is_for_same(org.omg.CosCollection.Iterator test)
	{
		return _delegate.is_for_same(test);
	}

	public boolean is_reverse()
	{
		return _delegate.is_reverse();
	}

	public void assign(org.omg.CosCollection.Iterator from_where) throws org.omg.CosCollection.IteratorInvalid
	{
_delegate.assign(from_where);
	}

	public int position() throws org.omg.CosCollection.IteratorInvalid
	{
		return _delegate.position();
	}

	public boolean retrieve_element(org.omg.CORBA.AnyHolder element) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.retrieve_element(element);
	}

	public boolean set_to_first_element()
	{
		return _delegate.set_to_first_element();
	}

	public boolean retrieve_next_n_elements(int n, org.omg.CosCollection.AnySequenceHolder result, org.omg.CORBA.BooleanHolder more) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.retrieve_next_n_elements(n,result,more);
	}

	public boolean replace_previous_n_elements(org.omg.CORBA.Any[] elements, org.omg.CORBA.IntHolder actual_number) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.replace_previous_n_elements(elements,actual_number);
	}

	public boolean set_to_previous_element() throws org.omg.CosCollection.IteratorInvalid
	{
		return _delegate.set_to_previous_element();
	}

	public boolean is_last()
	{
		return _delegate.is_last();
	}

	public boolean set_to_next_element() throws org.omg.CosCollection.IteratorInvalid
	{
		return _delegate.set_to_next_element();
	}

	public boolean set_to_nth_previous_element(int n) throws org.omg.CosCollection.IteratorInvalid
	{
		return _delegate.set_to_nth_previous_element(n);
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public boolean set_to_last_element()
	{
		return _delegate.set_to_last_element();
	}

	public boolean not_equal_retrieve_element_set_to_next(org.omg.CosCollection.Iterator test, org.omg.CORBA.AnyHolder element) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.not_equal_retrieve_element_set_to_next(test,element);
	}

	public boolean not_equal_replace_element_set_to_previous(org.omg.CosCollection.Iterator test, org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.not_equal_replace_element_set_to_previous(test,element);
	}

	public boolean remove_element_set_to_previous() throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.remove_element_set_to_previous();
	}

	public void remove_element() throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
_delegate.remove_element();
	}

	public boolean not_equal_remove_element_set_to_next(org.omg.CosCollection.Iterator test) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.not_equal_remove_element_set_to_next(test);
	}

	public boolean is_equal(org.omg.CosCollection.Iterator test) throws org.omg.CosCollection.IteratorInvalid
	{
		return _delegate.is_equal(test);
	}

	public boolean retrieve_element_set_to_previous(org.omg.CORBA.AnyHolder element, org.omg.CORBA.BooleanHolder more) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.retrieve_element_set_to_previous(element,more);
	}

	public void invalidate()
	{
_delegate.invalidate();
	}

	public boolean remove_element_set_to_next() throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.remove_element_set_to_next();
	}

	public boolean not_equal_remove_element_set_to_previous(org.omg.CosCollection.Iterator test) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.not_equal_remove_element_set_to_previous(test);
	}

	public boolean remove_previous_n_elements(int n, org.omg.CORBA.IntHolder actual_number) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.remove_previous_n_elements(n,actual_number);
	}

	public boolean retrieve_previous_n_elements(int n, org.omg.CosCollection.AnySequenceHolder result, org.omg.CORBA.BooleanHolder more) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.retrieve_previous_n_elements(n,result,more);
	}

	public boolean not_equal_replace_element_set_to_next(org.omg.CosCollection.Iterator test, org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.not_equal_replace_element_set_to_next(test,element);
	}

	public boolean replace_element_set_to_next(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.replace_element_set_to_next(element);
	}

	public boolean is_for(org.omg.CosCollection.Collection collector)
	{
		return _delegate.is_for(collector);
	}

	public boolean is_first()
	{
		return _delegate.is_first();
	}

	public boolean add_element_set_iterator(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid
	{
		return _delegate.add_element_set_iterator(element);
	}

	public boolean replace_next_n_elements(org.omg.CORBA.Any[] elements, org.omg.CORBA.IntHolder actual_number) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.replace_next_n_elements(elements,actual_number);
	}

	public boolean not_equal_retrieve_element_set_to_previous(org.omg.CosCollection.Iterator test, org.omg.CORBA.AnyHolder element) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.not_equal_retrieve_element_set_to_previous(test,element);
	}

	public boolean retrieve_element_set_to_next(org.omg.CORBA.AnyHolder element, org.omg.CORBA.BooleanHolder more) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.retrieve_element_set_to_next(element,more);
	}

	public boolean is_const()
	{
		return _delegate.is_const();
	}

	public void set_to_position(int position) throws org.omg.CosCollection.PositionInvalid
	{
_delegate.set_to_position(position);
	}

	public boolean is_in_between()
	{
		return _delegate.is_in_between();
	}

}

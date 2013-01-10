package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "EqualityKeyCollection".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public class EqualityKeyCollectionPOATie
	extends EqualityKeyCollectionPOA
{
	private EqualityKeyCollectionOperations _delegate;

	private POA _poa;
	public EqualityKeyCollectionPOATie(EqualityKeyCollectionOperations delegate)
	{
		_delegate = delegate;
	}
	public EqualityKeyCollectionPOATie(EqualityKeyCollectionOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.EqualityKeyCollection _this()
	{
		return org.omg.CosCollection.EqualityKeyCollectionHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.EqualityKeyCollection _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.EqualityKeyCollectionHelper.narrow(_this_object(orb));
	}
	public EqualityKeyCollectionOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EqualityKeyCollectionOperations delegate)
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
	public int remove_all_elements_with_key(org.omg.CORBA.Any key) throws org.omg.CosCollection.KeyInvalid
	{
		return _delegate.remove_all_elements_with_key(key);
	}

	public boolean locate_next_element(org.omg.CORBA.Any element, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid
	{
		return _delegate.locate_next_element(element,where);
	}

	public boolean contains_element(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid
	{
		return _delegate.contains_element(element);
	}

	public boolean add_or_replace_element_with_key_set_iterator(org.omg.CORBA.Any element, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid
	{
		return _delegate.add_or_replace_element_with_key_set_iterator(element,where);
	}

	public boolean contains_all_keys_from(org.omg.CosCollection.KeyCollection collector) throws org.omg.CosCollection.KeyInvalid
	{
		return _delegate.contains_all_keys_from(collector);
	}

	public boolean locate_or_add_element_set_iterator(org.omg.CORBA.Any element, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid
	{
		return _delegate.locate_or_add_element_set_iterator(element,where);
	}

	public int number_of_different_elements()
	{
		return _delegate.number_of_different_elements();
	}

	public boolean locate_next_element_with_key(org.omg.CORBA.Any key, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.KeyInvalid,org.omg.CosCollection.IteratorInvalid
	{
		return _delegate.locate_next_element_with_key(key,where);
	}

	public org.omg.CORBA.TypeCode element_type()
	{
		return _delegate.element_type();
	}

	public org.omg.CosCollection.Iterator create_iterator(boolean read_only)
	{
		return _delegate.create_iterator(read_only);
	}

	public boolean locate_element_with_key(org.omg.CORBA.Any key, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.KeyInvalid,org.omg.CosCollection.IteratorInvalid
	{
		return _delegate.locate_element_with_key(key,where);
	}

	public int number_of_elements_with_key(org.omg.CORBA.Any key) throws org.omg.CosCollection.KeyInvalid
	{
		return _delegate.number_of_elements_with_key(key);
	}

	public boolean is_empty()
	{
		return _delegate.is_empty();
	}

	public boolean locate_or_add_element_with_key_set_iterator(org.omg.CORBA.Any element, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid
	{
		return _delegate.locate_or_add_element_with_key_set_iterator(element,where);
	}

	public boolean locate_or_add_element(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid
	{
		return _delegate.locate_or_add_element(element);
	}

	public int remove_all_occurrences(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid
	{
		return _delegate.remove_all_occurrences(element);
	}

	public boolean locate_or_add_element_with_key(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid
	{
		return _delegate.locate_or_add_element_with_key(element);
	}

	public boolean remove_element(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid
	{
		return _delegate.remove_element(element);
	}

	public boolean locate_element(org.omg.CORBA.Any element, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid
	{
		return _delegate.locate_element(element,where);
	}

	public boolean add_element(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid
	{
		return _delegate.add_element(element);
	}

	public void replace_element_at(org.omg.CosCollection.Iterator where, org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
_delegate.replace_element_at(where,element);
	}

	public boolean add_or_replace_element_with_key(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid
	{
		return _delegate.add_or_replace_element_with_key(element);
	}

	public boolean remove_element_with_key(org.omg.CORBA.Any key) throws org.omg.CosCollection.KeyInvalid
	{
		return _delegate.remove_element_with_key(key);
	}

	public boolean retrieve_element_at(org.omg.CosCollection.Iterator where, org.omg.CORBA.AnyHolder element) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.retrieve_element_at(where,element);
	}

	public org.omg.CORBA.TypeCode key_type()
	{
		return _delegate.key_type();
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public boolean replace_element_with_key_set_iterator(org.omg.CORBA.Any element, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid
	{
		return _delegate.replace_element_with_key_set_iterator(element,where);
	}

	public void keys(org.omg.CORBA.Any[] elements, org.omg.CosCollection.AnySequenceHolder keys) throws org.omg.CosCollection.ElementInvalid
	{
_delegate.keys(elements,keys);
	}

	public boolean contains_all_from(org.omg.CosCollection.Collection collector) throws org.omg.CosCollection.ElementInvalid
	{
		return _delegate.contains_all_from(collector);
	}

	public void add_all_from(org.omg.CosCollection.Collection collector) throws org.omg.CosCollection.ElementInvalid
	{
_delegate.add_all_from(collector);
	}

	public int number_of_elements()
	{
		return _delegate.number_of_elements();
	}

	public boolean locate_next_element_with_different_key(org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.locate_next_element_with_different_key(where);
	}

	public void remove_element_at(org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
_delegate.remove_element_at(where);
	}

	public int number_of_occurrences(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid
	{
		return _delegate.number_of_occurrences(element);
	}

	public int number_of_different_keys()
	{
		return _delegate.number_of_different_keys();
	}

	public int remove_all()
	{
		return _delegate.remove_all();
	}

	public boolean replace_element_with_key(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid
	{
		return _delegate.replace_element_with_key(element);
	}

	public boolean contains_element_with_key(org.omg.CORBA.Any key) throws org.omg.CosCollection.KeyInvalid
	{
		return _delegate.contains_element_with_key(key);
	}

	public boolean add_element_set_iterator(org.omg.CORBA.Any element, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid
	{
		return _delegate.add_element_set_iterator(element,where);
	}

	public boolean all_elements_do(org.omg.CosCollection.Command what)
	{
		return _delegate.all_elements_do(what);
	}

	public boolean retrieve_element_with_key(org.omg.CORBA.Any key, org.omg.CORBA.AnyHolder element) throws org.omg.CosCollection.KeyInvalid
	{
		return _delegate.retrieve_element_with_key(key,element);
	}

	public boolean locate_next_different_element(org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.locate_next_different_element(where);
	}

	public void key(org.omg.CORBA.Any element, org.omg.CORBA.AnyHolder key) throws org.omg.CosCollection.ElementInvalid
	{
_delegate.key(element,key);
	}

}

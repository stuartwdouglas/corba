package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "EqualityCollection".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public class EqualityCollectionPOATie
	extends EqualityCollectionPOA
{
	private EqualityCollectionOperations _delegate;

	private POA _poa;
	public EqualityCollectionPOATie(EqualityCollectionOperations delegate)
	{
		_delegate = delegate;
	}
	public EqualityCollectionPOATie(EqualityCollectionOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.EqualityCollection _this()
	{
		return org.omg.CosCollection.EqualityCollectionHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.EqualityCollection _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.EqualityCollectionHelper.narrow(_this_object(orb));
	}
	public EqualityCollectionOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EqualityCollectionOperations delegate)
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
	public boolean locate_or_add_element_set_iterator(org.omg.CORBA.Any element, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid
	{
		return _delegate.locate_or_add_element_set_iterator(element,where);
	}

	public int number_of_elements()
	{
		return _delegate.number_of_elements();
	}

	public boolean locate_element(org.omg.CORBA.Any element, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid
	{
		return _delegate.locate_element(element,where);
	}

	public boolean retrieve_element_at(org.omg.CosCollection.Iterator where, org.omg.CORBA.AnyHolder element) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.retrieve_element_at(where,element);
	}

	public org.omg.CORBA.TypeCode element_type()
	{
		return _delegate.element_type();
	}

	public boolean remove_element(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid
	{
		return _delegate.remove_element(element);
	}

	public int number_of_different_elements()
	{
		return _delegate.number_of_different_elements();
	}

	public boolean contains_element(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid
	{
		return _delegate.contains_element(element);
	}

	public void remove_element_at(org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
_delegate.remove_element_at(where);
	}

	public boolean add_element(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid
	{
		return _delegate.add_element(element);
	}

	public boolean locate_next_different_element(org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		return _delegate.locate_next_different_element(where);
	}

	public boolean is_empty()
	{
		return _delegate.is_empty();
	}

	public org.omg.CosCollection.Iterator create_iterator(boolean read_only)
	{
		return _delegate.create_iterator(read_only);
	}

	public boolean locate_next_element(org.omg.CORBA.Any element, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid
	{
		return _delegate.locate_next_element(element,where);
	}

	public boolean contains_all_from(org.omg.CosCollection.Collection collector) throws org.omg.CosCollection.ElementInvalid
	{
		return _delegate.contains_all_from(collector);
	}

	public boolean locate_or_add_element(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid
	{
		return _delegate.locate_or_add_element(element);
	}

	public int number_of_occurrences(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid
	{
		return _delegate.number_of_occurrences(element);
	}

	public boolean add_element_set_iterator(org.omg.CORBA.Any element, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid
	{
		return _delegate.add_element_set_iterator(element,where);
	}

	public int remove_all()
	{
		return _delegate.remove_all();
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public void add_all_from(org.omg.CosCollection.Collection collector) throws org.omg.CosCollection.ElementInvalid
	{
_delegate.add_all_from(collector);
	}

	public boolean all_elements_do(org.omg.CosCollection.Command what)
	{
		return _delegate.all_elements_do(what);
	}

	public void replace_element_at(org.omg.CosCollection.Iterator where, org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
_delegate.replace_element_at(where,element);
	}

	public int remove_all_occurrences(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid
	{
		return _delegate.remove_all_occurrences(element);
	}

}

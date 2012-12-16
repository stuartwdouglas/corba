package org.omg.DynamicAny;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "DynFixed".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public class DynFixedPOATie
	extends DynFixedPOA
{
	private DynFixedOperations _delegate;

	private POA _poa;
	public DynFixedPOATie(DynFixedOperations delegate)
	{
		_delegate = delegate;
	}
	public DynFixedPOATie(DynFixedOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.DynamicAny.DynFixed _this()
	{
		return org.omg.DynamicAny.DynFixedHelper.narrow(_this_object());
	}
	public org.omg.DynamicAny.DynFixed _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.DynamicAny.DynFixedHelper.narrow(_this_object(orb));
	}
	public DynFixedOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(DynFixedOperations delegate)
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
	public org.omg.CORBA.Object get_reference() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_reference();
	}

	public void insert_typecode(org.omg.CORBA.TypeCode value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_typecode(value);
	}

	public org.omg.CORBA.TypeCode get_typecode() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_typecode();
	}

	public boolean set_value(java.lang.String val) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.set_value(val);
	}

	public org.omg.DynamicAny.DynAny copy()
	{
		return _delegate.copy();
	}

	public int get_ulong() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_ulong();
	}

	public void insert_float(float value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_float(value);
	}

	public org.omg.CORBA.Any get_any() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_any();
	}

	public short get_short() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_short();
	}

	public void from_any(org.omg.CORBA.Any value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.from_any(value);
	}

	public java.lang.String get_string() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_string();
	}

	public float get_float() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_float();
	}

	public void insert_ulonglong(long value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_ulonglong(value);
	}

	public void insert_reference(org.omg.CORBA.Object value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_reference(value);
	}

	public void insert_string(java.lang.String value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_string(value);
	}

	public org.omg.DynamicAny.DynAny current_component() throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.current_component();
	}

	public boolean get_boolean() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_boolean();
	}

	public void insert_boolean(boolean value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_boolean(value);
	}

	public java.lang.String get_value()
	{
		return _delegate.get_value();
	}

	public boolean next()
	{
		return _delegate.next();
	}

	public void insert_char(char value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_char(value);
	}

	public void insert_wstring(java.lang.String value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_wstring(value);
	}

	public org.omg.DynamicAny.DynAny get_dyn_any() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_dyn_any();
	}

	public org.omg.CORBA.Any to_any()
	{
		return _delegate.to_any();
	}

	public char get_char() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_char();
	}

	public boolean seek(int index)
	{
		return _delegate.seek(index);
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public void insert_short(short value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_short(value);
	}

	public org.omg.CORBA.TypeCode type()
	{
		return _delegate.type();
	}

	public void insert_double(double value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_double(value);
	}

	public long get_longlong() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_longlong();
	}

	public int component_count()
	{
		return _delegate.component_count();
	}

	public void insert_wchar(char value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_wchar(value);
	}

	public void insert_any(org.omg.CORBA.Any value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_any(value);
	}

	public void insert_ushort(short value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_ushort(value);
	}

	public short get_ushort() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_ushort();
	}

	public java.lang.String get_wstring() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_wstring();
	}

	public int get_long() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_long();
	}

	public void assign(org.omg.DynamicAny.DynAny dyn_any) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.assign(dyn_any);
	}

	public char get_wchar() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_wchar();
	}

	public void insert_longlong(long value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_longlong(value);
	}

	public void insert_long(int value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_long(value);
	}

	public void insert_dyn_any(org.omg.DynamicAny.DynAny value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_dyn_any(value);
	}

	public void rewind()
	{
_delegate.rewind();
	}

	public void insert_ulong(int value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_ulong(value);
	}

	public long get_ulonglong() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_ulonglong();
	}

	public void insert_octet(byte value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_octet(value);
	}

	public boolean equal(org.omg.DynamicAny.DynAny dyn_any)
	{
		return _delegate.equal(dyn_any);
	}

	public double get_double() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_double();
	}

	public byte get_octet() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_octet();
	}

}

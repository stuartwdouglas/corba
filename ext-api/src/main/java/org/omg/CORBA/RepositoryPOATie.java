package org.omg.CORBA;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Repository".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public class RepositoryPOATie
	extends RepositoryPOA
{
	private RepositoryOperations _delegate;

	private POA _poa;
	public RepositoryPOATie(RepositoryOperations delegate)
	{
		_delegate = delegate;
	}
	public RepositoryPOATie(RepositoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CORBA.Repository _this()
	{
		return org.omg.CORBA.RepositoryHelper.narrow(_this_object());
	}
	public org.omg.CORBA.Repository _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CORBA.RepositoryHelper.narrow(_this_object(orb));
	}
	public RepositoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RepositoryOperations delegate)
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
	public org.omg.CORBA.StructDef create_struct(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.StructMember[] members)
	{
		return _delegate.create_struct(id,name,version,members);
	}

	public org.omg.CORBA.ConstantDef create_constant(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType type, org.omg.CORBA.Any value)
	{
		return _delegate.create_constant(id,name,version,type,value);
	}

	public org.omg.CORBA.FixedDef create_fixed(short digits, short scale)
	{
		return _delegate.create_fixed(digits,scale);
	}

	public org.omg.CORBA.DefinitionKind def_kind()
	{
		return _delegate.def_kind();
	}

	public org.omg.CORBA.Contained lookup_id(java.lang.String search_id)
	{
		return _delegate.lookup_id(search_id);
	}

	public org.omg.CORBA.AliasDef create_alias(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType original_type)
	{
		return _delegate.create_alias(id,name,version,original_type);
	}

	public org.omg.CORBA.WstringDef create_wstring(int bound)
	{
		return _delegate.create_wstring(bound);
	}

	public org.omg.CORBA.UnionDef create_union(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType discriminator_type, org.omg.CORBA.UnionMember[] members)
	{
		return _delegate.create_union(id,name,version,discriminator_type,members);
	}

	public org.omg.CORBA.NativeDef create_native(java.lang.String id, java.lang.String name, java.lang.String version)
	{
		return _delegate.create_native(id,name,version);
	}

	public org.omg.CORBA.Contained lookup(java.lang.String search_name)
	{
		return _delegate.lookup(search_name);
	}

	public org.omg.CORBA.ValueBoxDef create_value_box(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType original_type_def)
	{
		return _delegate.create_value_box(id,name,version,original_type_def);
	}

	public org.omg.CORBA.StringDef create_string(int bound)
	{
		return _delegate.create_string(bound);
	}

	public org.omg.CORBA.Contained[] lookup_name(java.lang.String search_name, int levels_to_search, org.omg.CORBA.DefinitionKind limit_type, boolean exclude_inherited)
	{
		return _delegate.lookup_name(search_name,levels_to_search,limit_type,exclude_inherited);
	}

	public org.omg.CORBA.ContainerPackage.Description[] describe_contents(org.omg.CORBA.DefinitionKind limit_type, boolean exclude_inherited, int max_returned_objs)
	{
		return _delegate.describe_contents(limit_type,exclude_inherited,max_returned_objs);
	}

	public org.omg.CORBA.ModuleDef create_module(java.lang.String id, java.lang.String name, java.lang.String version)
	{
		return _delegate.create_module(id,name,version);
	}

	public org.omg.CORBA.ValueDef create_value(java.lang.String id, java.lang.String name, java.lang.String version, boolean is_custom, boolean is_abstract, org.omg.CORBA.ValueDef base_value, boolean is_truncatable, org.omg.CORBA.ValueDef[] abstract_base_values, org.omg.CORBA.InterfaceDef[] supported_interfaces, org.omg.CORBA.Initializer[] initializers)
	{
		return _delegate.create_value(id,name,version,is_custom,is_abstract,base_value,is_truncatable,abstract_base_values,supported_interfaces,initializers);
	}

	public org.omg.CORBA.Contained[] contents(org.omg.CORBA.DefinitionKind limit_type, boolean exclude_inherited)
	{
		return _delegate.contents(limit_type,exclude_inherited);
	}

	public org.omg.CORBA.EnumDef create_enum(java.lang.String id, java.lang.String name, java.lang.String version, java.lang.String[] members)
	{
		return _delegate.create_enum(id,name,version,members);
	}

	public org.omg.CORBA.SequenceDef create_sequence(int bound, org.omg.CORBA.IDLType element_type)
	{
		return _delegate.create_sequence(bound,element_type);
	}

	public org.omg.CORBA.PrimitiveDef get_primitive(org.omg.CORBA.PrimitiveKind kind)
	{
		return _delegate.get_primitive(kind);
	}

	public org.omg.CORBA.ArrayDef create_array(int length, org.omg.CORBA.IDLType element_type)
	{
		return _delegate.create_array(length,element_type);
	}

	public org.omg.CORBA.ExceptionDef create_exception(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.StructMember[] members)
	{
		return _delegate.create_exception(id,name,version,members);
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public org.omg.CORBA.TypeCode get_canonical_typecode(org.omg.CORBA.TypeCode tc)
	{
		return _delegate.get_canonical_typecode(tc);
	}

	public org.omg.CORBA.InterfaceDef create_interface(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.InterfaceDef[] base_interfaces, boolean is_abstract)
	{
		return _delegate.create_interface(id,name,version,base_interfaces,is_abstract);
	}

}

package org.omg.CORBA;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "UnionDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public class UnionDefPOATie
	extends UnionDefPOA
{
	private UnionDefOperations _delegate;

	private POA _poa;
	public UnionDefPOATie(UnionDefOperations delegate)
	{
		_delegate = delegate;
	}
	public UnionDefPOATie(UnionDefOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CORBA.UnionDef _this()
	{
		return org.omg.CORBA.UnionDefHelper.narrow(_this_object());
	}
	public org.omg.CORBA.UnionDef _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CORBA.UnionDefHelper.narrow(_this_object(orb));
	}
	public UnionDefOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(UnionDefOperations delegate)
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
	public void members(org.omg.CORBA.UnionMember[] a)
	{
		_delegate.members(a);
	}

	public org.omg.CORBA.StructDef create_struct(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.StructMember[] members)
	{
		return _delegate.create_struct(id,name,version,members);
	}

	public org.omg.CORBA.ConstantDef create_constant(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType type, org.omg.CORBA.Any value)
	{
		return _delegate.create_constant(id,name,version,type,value);
	}

	public org.omg.CORBA.Repository containing_repository()
	{
		return _delegate.containing_repository();
	}

	public org.omg.CORBA.DefinitionKind def_kind()
	{
		return _delegate.def_kind();
	}

	public java.lang.String absolute_name()
	{
		return _delegate.absolute_name();
	}

	public org.omg.CORBA.AliasDef create_alias(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType original_type)
	{
		return _delegate.create_alias(id,name,version,original_type);
	}

	public java.lang.String name()
	{
		return _delegate.name();
	}

	public void discriminator_type_def(org.omg.CORBA.IDLType a)
	{
		_delegate.discriminator_type_def(a);
	}

	public org.omg.CORBA.TypeCode type()
	{
		return _delegate.type();
	}

	public void name(java.lang.String a)
	{
		_delegate.name(a);
	}

	public org.omg.CORBA.UnionDef create_union(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType discriminator_type, org.omg.CORBA.UnionMember[] members)
	{
		return _delegate.create_union(id,name,version,discriminator_type,members);
	}

	public org.omg.CORBA.Contained lookup(java.lang.String search_name)
	{
		return _delegate.lookup(search_name);
	}

	public org.omg.CORBA.NativeDef create_native(java.lang.String id, java.lang.String name, java.lang.String version)
	{
		return _delegate.create_native(id,name,version);
	}

	public org.omg.CORBA.TypeCode discriminator_type()
	{
		return _delegate.discriminator_type();
	}

	public org.omg.CORBA.ValueBoxDef create_value_box(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType original_type_def)
	{
		return _delegate.create_value_box(id,name,version,original_type_def);
	}

	public org.omg.CORBA.Contained[] lookup_name(java.lang.String search_name, int levels_to_search, org.omg.CORBA.DefinitionKind limit_type, boolean exclude_inherited)
	{
		return _delegate.lookup_name(search_name,levels_to_search,limit_type,exclude_inherited);
	}

	public org.omg.CORBA.Container defined_in()
	{
		return _delegate.defined_in();
	}

	public java.lang.String version()
	{
		return _delegate.version();
	}

	public org.omg.CORBA.ContainerPackage.Description[] describe_contents(org.omg.CORBA.DefinitionKind limit_type, boolean exclude_inherited, int max_returned_objs)
	{
		return _delegate.describe_contents(limit_type,exclude_inherited,max_returned_objs);
	}

	public void version(java.lang.String a)
	{
		_delegate.version(a);
	}

	public org.omg.CORBA.ContainedPackage.Description describe()
	{
		return _delegate.describe();
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

	public java.lang.String id()
	{
		return _delegate.id();
	}

	public org.omg.CORBA.EnumDef create_enum(java.lang.String id, java.lang.String name, java.lang.String version, java.lang.String[] members)
	{
		return _delegate.create_enum(id,name,version,members);
	}

	public void move(org.omg.CORBA.Container new_container, java.lang.String new_name, java.lang.String new_version)
	{
_delegate.move(new_container,new_name,new_version);
	}

	public org.omg.CORBA.IDLType discriminator_type_def()
	{
		return _delegate.discriminator_type_def();
	}

	public org.omg.CORBA.ExceptionDef create_exception(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.StructMember[] members)
	{
		return _delegate.create_exception(id,name,version,members);
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public org.omg.CORBA.UnionMember[] members()
	{
		return _delegate.members();
	}

	public org.omg.CORBA.InterfaceDef create_interface(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.InterfaceDef[] base_interfaces, boolean is_abstract)
	{
		return _delegate.create_interface(id,name,version,base_interfaces,is_abstract);
	}

	public void id(java.lang.String a)
	{
		_delegate.id(a);
	}

}

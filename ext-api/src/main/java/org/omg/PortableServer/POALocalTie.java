package org.omg.PortableServer;


/**
 * Generated from IDL interface "POA".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public class POALocalTie
	extends _POALocalBase
{
	private POAOperations _delegate;

	public POALocalTie(POAOperations delegate)
	{
		_delegate = delegate;
	}
	public POAOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(POAOperations delegate)
	{
		_delegate = delegate;
	}
	public void set_servant(org.omg.PortableServer.Servant p_servant) throws org.omg.PortableServer.POAPackage.WrongPolicy
	{
_delegate.set_servant(p_servant);
	}

	public org.omg.PortableServer.ServantManager get_servant_manager() throws org.omg.PortableServer.POAPackage.WrongPolicy
	{
		return _delegate.get_servant_manager();
	}

	public org.omg.PortableServer.ServantRetentionPolicy create_servant_retention_policy(org.omg.PortableServer.ServantRetentionPolicyValue value)
	{
		return _delegate.create_servant_retention_policy(value);
	}

	public org.omg.PortableServer.POA[] the_children()
	{
		return _delegate.the_children();
	}

	public org.omg.CORBA.Object servant_to_reference(org.omg.PortableServer.Servant p_servant) throws org.omg.PortableServer.POAPackage.ServantNotActive,org.omg.PortableServer.POAPackage.WrongPolicy
	{
		return _delegate.servant_to_reference(p_servant);
	}

	public void deactivate_object(byte[] oid) throws org.omg.PortableServer.POAPackage.WrongPolicy,org.omg.PortableServer.POAPackage.ObjectNotActive
	{
_delegate.deactivate_object(oid);
	}

	public org.omg.PortableServer.POA the_parent()
	{
		return _delegate.the_parent();
	}

	public org.omg.PortableServer.RequestProcessingPolicy create_request_processing_policy(org.omg.PortableServer.RequestProcessingPolicyValue value)
	{
		return _delegate.create_request_processing_policy(value);
	}

	public org.omg.CORBA.Object id_to_reference(byte[] oid) throws org.omg.PortableServer.POAPackage.WrongPolicy,org.omg.PortableServer.POAPackage.ObjectNotActive
	{
		return _delegate.id_to_reference(oid);
	}

	public void destroy(boolean etherealize_objects, boolean wait_for_completion)
	{
_delegate.destroy(etherealize_objects,wait_for_completion);
	}

	public byte[] activate_object(org.omg.PortableServer.Servant p_servant) throws org.omg.PortableServer.POAPackage.ServantAlreadyActive,org.omg.PortableServer.POAPackage.WrongPolicy
	{
		return _delegate.activate_object(p_servant);
	}

	public org.omg.PortableServer.POA create_POA(java.lang.String adapter_name, org.omg.PortableServer.POAManager a_POAManager, org.omg.CORBA.Policy[] policies) throws org.omg.PortableServer.POAPackage.InvalidPolicy,org.omg.PortableServer.POAPackage.AdapterAlreadyExists
	{
		return _delegate.create_POA(adapter_name,a_POAManager,policies);
	}

	public org.omg.PortableServer.IdUniquenessPolicy create_id_uniqueness_policy(org.omg.PortableServer.IdUniquenessPolicyValue value)
	{
		return _delegate.create_id_uniqueness_policy(value);
	}

	public void the_activator(org.omg.PortableServer.AdapterActivator a)
	{
		_delegate.the_activator(a);
	}

	public org.omg.PortableServer.ThreadPolicy create_thread_policy(org.omg.PortableServer.ThreadPolicyValue value)
	{
		return _delegate.create_thread_policy(value);
	}

	public void set_servant_manager(org.omg.PortableServer.ServantManager imgr) throws org.omg.PortableServer.POAPackage.WrongPolicy
	{
_delegate.set_servant_manager(imgr);
	}

	public org.omg.PortableServer.ImplicitActivationPolicy create_implicit_activation_policy(org.omg.PortableServer.ImplicitActivationPolicyValue value)
	{
		return _delegate.create_implicit_activation_policy(value);
	}

	public org.omg.PortableServer.IdAssignmentPolicy create_id_assignment_policy(org.omg.PortableServer.IdAssignmentPolicyValue value)
	{
		return _delegate.create_id_assignment_policy(value);
	}

	public org.omg.CORBA.Object create_reference(java.lang.String intf) throws org.omg.PortableServer.POAPackage.WrongPolicy
	{
		return _delegate.create_reference(intf);
	}

	public org.omg.PortableServer.LifespanPolicy create_lifespan_policy(org.omg.PortableServer.LifespanPolicyValue value)
	{
		return _delegate.create_lifespan_policy(value);
	}

	public org.omg.PortableServer.Servant reference_to_servant(org.omg.CORBA.Object reference) throws org.omg.PortableServer.POAPackage.WrongAdapter,org.omg.PortableServer.POAPackage.WrongPolicy,org.omg.PortableServer.POAPackage.ObjectNotActive
	{
		return _delegate.reference_to_servant(reference);
	}

	public org.omg.PortableServer.POA find_POA(java.lang.String adapter_name, boolean activate_it) throws org.omg.PortableServer.POAPackage.AdapterNonExistent
	{
		return _delegate.find_POA(adapter_name,activate_it);
	}

	public org.omg.PortableServer.POAManager the_POAManager()
	{
		return _delegate.the_POAManager();
	}

	public void activate_object_with_id(byte[] id, org.omg.PortableServer.Servant p_servant) throws org.omg.PortableServer.POAPackage.ServantAlreadyActive,org.omg.PortableServer.POAPackage.ObjectAlreadyActive,org.omg.PortableServer.POAPackage.WrongPolicy
	{
_delegate.activate_object_with_id(id,p_servant);
	}

	public byte[] reference_to_id(org.omg.CORBA.Object reference) throws org.omg.PortableServer.POAPackage.WrongAdapter,org.omg.PortableServer.POAPackage.WrongPolicy
	{
		return _delegate.reference_to_id(reference);
	}

	public org.omg.PortableServer.Servant get_servant() throws org.omg.PortableServer.POAPackage.WrongPolicy,org.omg.PortableServer.POAPackage.NoServant
	{
		return _delegate.get_servant();
	}

	public org.omg.PortableServer.Servant id_to_servant(byte[] oid) throws org.omg.PortableServer.POAPackage.WrongPolicy,org.omg.PortableServer.POAPackage.ObjectNotActive
	{
		return _delegate.id_to_servant(oid);
	}

	public byte[] servant_to_id(org.omg.PortableServer.Servant p_servant) throws org.omg.PortableServer.POAPackage.ServantNotActive,org.omg.PortableServer.POAPackage.WrongPolicy
	{
		return _delegate.servant_to_id(p_servant);
	}

	public org.omg.PortableServer.AdapterActivator the_activator()
	{
		return _delegate.the_activator();
	}

	public org.omg.CORBA.Object create_reference_with_id(byte[] oid, java.lang.String intf) throws org.omg.PortableServer.POAPackage.WrongPolicy
	{
		return _delegate.create_reference_with_id(oid,intf);
	}

	public java.lang.String the_name()
	{
		return _delegate.the_name();
	}

}

package org.omg.dds;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "DataWriterListener".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public class DataWriterListenerPOATie
	extends DataWriterListenerPOA
{
	private DataWriterListenerOperations _delegate;

	private POA _poa;
	public DataWriterListenerPOATie(DataWriterListenerOperations delegate)
	{
		_delegate = delegate;
	}
	public DataWriterListenerPOATie(DataWriterListenerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.dds.DataWriterListener _this()
	{
		return org.omg.dds.DataWriterListenerHelper.narrow(_this_object());
	}
	public org.omg.dds.DataWriterListener _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.DataWriterListenerHelper.narrow(_this_object(orb));
	}
	public DataWriterListenerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(DataWriterListenerOperations delegate)
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
	public void on_offered_deadline_missed(org.omg.dds.DataWriter writer, org.omg.dds.OfferedDeadlineMissedStatus status)
	{
_delegate.on_offered_deadline_missed(writer,status);
	}

	public void on_liveliness_lost(org.omg.dds.DataWriter writer, org.omg.dds.LivelinessLostStatus status)
	{
_delegate.on_liveliness_lost(writer,status);
	}

	public void on_offered_incompatible_qos(org.omg.dds.DataWriter writer, org.omg.dds.OfferedIncompatibleQosStatus status)
	{
_delegate.on_offered_incompatible_qos(writer,status);
	}

	public void on_publication_match(org.omg.dds.DataWriter writer, org.omg.dds.PublicationMatchStatus status)
	{
_delegate.on_publication_match(writer,status);
	}

}

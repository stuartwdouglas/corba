package org.omg.dds;


/**
 * Generated from IDL interface "DomainParticipantListener".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public class _DomainParticipantListenerStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.dds.DomainParticipantListener
{
	private String[] ids = {"IDL:omg.org/dds/DomainParticipantListener:1.0","IDL:omg.org/dds/SubscriberListener:1.0","IDL:omg.org/dds/TopicListener:1.0","IDL:omg.org/dds/DataWriterListener:1.0","IDL:omg.org/dds/PublisherListener:1.0","IDL:omg.org/dds/DataReaderListener:1.0","IDL:omg.org/dds/Listener:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.dds.DomainParticipantListenerOperations.class;
	public void on_requested_incompatible_qos(org.omg.dds.DataReader reader, org.omg.dds.RequestedIncompatibleQosStatus status)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "on_requested_incompatible_qos", true);
				org.omg.dds.DataReaderHelper.write(_os,reader);
				org.omg.dds.RequestedIncompatibleQosStatusHelper.write(_os,status);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "on_requested_incompatible_qos", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DomainParticipantListenerOperations _localServant = (DomainParticipantListenerOperations)_so.servant;
			try
			{
				_localServant.on_requested_incompatible_qos(reader,status);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void on_offered_deadline_missed(org.omg.dds.DataWriter writer, org.omg.dds.OfferedDeadlineMissedStatus status)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "on_offered_deadline_missed", true);
				org.omg.dds.DataWriterHelper.write(_os,writer);
				org.omg.dds.OfferedDeadlineMissedStatusHelper.write(_os,status);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "on_offered_deadline_missed", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DomainParticipantListenerOperations _localServant = (DomainParticipantListenerOperations)_so.servant;
			try
			{
				_localServant.on_offered_deadline_missed(writer,status);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void on_offered_incompatible_qos(org.omg.dds.DataWriter writer, org.omg.dds.OfferedIncompatibleQosStatus status)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "on_offered_incompatible_qos", true);
				org.omg.dds.DataWriterHelper.write(_os,writer);
				org.omg.dds.OfferedIncompatibleQosStatusHelper.write(_os,status);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "on_offered_incompatible_qos", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DomainParticipantListenerOperations _localServant = (DomainParticipantListenerOperations)_so.servant;
			try
			{
				_localServant.on_offered_incompatible_qos(writer,status);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void on_data_on_readers(org.omg.dds.Subscriber subs)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "on_data_on_readers", true);
				org.omg.dds.SubscriberHelper.write(_os,subs);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "on_data_on_readers", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DomainParticipantListenerOperations _localServant = (DomainParticipantListenerOperations)_so.servant;
			try
			{
				_localServant.on_data_on_readers(subs);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void on_liveliness_changed(org.omg.dds.DataReader reader, org.omg.dds.LivelinessChangedStatus status)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "on_liveliness_changed", true);
				org.omg.dds.DataReaderHelper.write(_os,reader);
				org.omg.dds.LivelinessChangedStatusHelper.write(_os,status);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "on_liveliness_changed", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DomainParticipantListenerOperations _localServant = (DomainParticipantListenerOperations)_so.servant;
			try
			{
				_localServant.on_liveliness_changed(reader,status);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void on_sample_rejected(org.omg.dds.DataReader reader, org.omg.dds.SampleRejectedStatus status)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "on_sample_rejected", true);
				org.omg.dds.DataReaderHelper.write(_os,reader);
				org.omg.dds.SampleRejectedStatusHelper.write(_os,status);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "on_sample_rejected", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DomainParticipantListenerOperations _localServant = (DomainParticipantListenerOperations)_so.servant;
			try
			{
				_localServant.on_sample_rejected(reader,status);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void on_subscription_match(org.omg.dds.DataReader reader, org.omg.dds.SubscriptionMatchStatus status)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "on_subscription_match", true);
				org.omg.dds.DataReaderHelper.write(_os,reader);
				org.omg.dds.SubscriptionMatchStatusHelper.write(_os,status);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "on_subscription_match", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DomainParticipantListenerOperations _localServant = (DomainParticipantListenerOperations)_so.servant;
			try
			{
				_localServant.on_subscription_match(reader,status);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void on_requested_deadline_missed(org.omg.dds.DataReader reader, org.omg.dds.RequestedDeadlineMissedStatus status)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "on_requested_deadline_missed", true);
				org.omg.dds.DataReaderHelper.write(_os,reader);
				org.omg.dds.RequestedDeadlineMissedStatusHelper.write(_os,status);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "on_requested_deadline_missed", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DomainParticipantListenerOperations _localServant = (DomainParticipantListenerOperations)_so.servant;
			try
			{
				_localServant.on_requested_deadline_missed(reader,status);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void on_data_available(org.omg.dds.DataReader reader)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "on_data_available", true);
				org.omg.dds.DataReaderHelper.write(_os,reader);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "on_data_available", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DomainParticipantListenerOperations _localServant = (DomainParticipantListenerOperations)_so.servant;
			try
			{
				_localServant.on_data_available(reader);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void on_sample_lost(org.omg.dds.DataReader reader, org.omg.dds.SampleLostStatus status)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "on_sample_lost", true);
				org.omg.dds.DataReaderHelper.write(_os,reader);
				org.omg.dds.SampleLostStatusHelper.write(_os,status);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "on_sample_lost", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DomainParticipantListenerOperations _localServant = (DomainParticipantListenerOperations)_so.servant;
			try
			{
				_localServant.on_sample_lost(reader,status);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void on_liveliness_lost(org.omg.dds.DataWriter writer, org.omg.dds.LivelinessLostStatus status)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "on_liveliness_lost", true);
				org.omg.dds.DataWriterHelper.write(_os,writer);
				org.omg.dds.LivelinessLostStatusHelper.write(_os,status);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "on_liveliness_lost", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DomainParticipantListenerOperations _localServant = (DomainParticipantListenerOperations)_so.servant;
			try
			{
				_localServant.on_liveliness_lost(writer,status);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void on_publication_match(org.omg.dds.DataWriter writer, org.omg.dds.PublicationMatchStatus status)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "on_publication_match", true);
				org.omg.dds.DataWriterHelper.write(_os,writer);
				org.omg.dds.PublicationMatchStatusHelper.write(_os,status);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "on_publication_match", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DomainParticipantListenerOperations _localServant = (DomainParticipantListenerOperations)_so.servant;
			try
			{
				_localServant.on_publication_match(writer,status);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void on_inconsistent_topic(org.omg.dds.Topic the_topic, org.omg.dds.InconsistentTopicStatus status)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "on_inconsistent_topic", true);
				org.omg.dds.TopicHelper.write(_os,the_topic);
				org.omg.dds.InconsistentTopicStatusHelper.write(_os,status);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "on_inconsistent_topic", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DomainParticipantListenerOperations _localServant = (DomainParticipantListenerOperations)_so.servant;
			try
			{
				_localServant.on_inconsistent_topic(the_topic,status);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

}

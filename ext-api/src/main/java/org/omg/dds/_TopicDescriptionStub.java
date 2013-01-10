package org.omg.dds;


/**
 * Generated from IDL interface "TopicDescription".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public class _TopicDescriptionStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.dds.TopicDescription
{
	private String[] ids = {"IDL:omg.org/dds/TopicDescription:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.dds.TopicDescriptionOperations.class;
	public org.omg.dds.DomainParticipant get_participant()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_participant", true);
				_is = _invoke(_os);
				org.omg.dds.DomainParticipant _result = org.omg.dds.DomainParticipantHelper.read(_is);
				return _result;
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_participant", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			TopicDescriptionOperations _localServant = (TopicDescriptionOperations)_so.servant;
			org.omg.dds.DomainParticipant _result;
			try
			{
				_result = _localServant.get_participant();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public java.lang.String get_type_name()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_type_name", true);
				_is = _invoke(_os);
				java.lang.String _result = _is.read_string();
				return _result;
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_type_name", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			TopicDescriptionOperations _localServant = (TopicDescriptionOperations)_so.servant;
			java.lang.String _result;
			try
			{
				_result = _localServant.get_type_name();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public java.lang.String get_name()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_name", true);
				_is = _invoke(_os);
				java.lang.String _result = _is.read_string();
				return _result;
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_name", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			TopicDescriptionOperations _localServant = (TopicDescriptionOperations)_so.servant;
			java.lang.String _result;
			try
			{
				_result = _localServant.get_name();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

}

package org.omg.dds;


/**
 * Generated from IDL interface "MultiTopic".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public class _MultiTopicStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.dds.MultiTopic
{
	private String[] ids = {"IDL:omg.org/dds/MultiTopic:1.0","IDL:omg.org/dds/TopicDescription:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.dds.MultiTopicOperations.class;
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
			MultiTopicOperations _localServant = (MultiTopicOperations)_so.servant;
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

	public java.lang.String[] get_expression_parameters()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_expression_parameters", true);
				_is = _invoke(_os);
				java.lang.String[] _result = org.omg.dds.StringSeqHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_expression_parameters", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiTopicOperations _localServant = (MultiTopicOperations)_so.servant;
			java.lang.String[] _result;
			try
			{
				_result = _localServant.get_expression_parameters();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public java.lang.String get_subscription_expression()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_subscription_expression", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_subscription_expression", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiTopicOperations _localServant = (MultiTopicOperations)_so.servant;
			java.lang.String _result;
			try
			{
				_result = _localServant.get_subscription_expression();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public int set_expression_parameters(java.lang.String[] expression_parameters)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "set_expression_parameters", true);
				org.omg.dds.StringSeqHelper.write(_os,expression_parameters);
				_is = _invoke(_os);
				int _result = _is.read_long();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_expression_parameters", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiTopicOperations _localServant = (MultiTopicOperations)_so.servant;
			int _result;
			try
			{
				_result = _localServant.set_expression_parameters(expression_parameters);
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
			MultiTopicOperations _localServant = (MultiTopicOperations)_so.servant;
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
			MultiTopicOperations _localServant = (MultiTopicOperations)_so.servant;
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

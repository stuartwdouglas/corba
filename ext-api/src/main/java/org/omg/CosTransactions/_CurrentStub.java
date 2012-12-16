package org.omg.CosTransactions;


/**
 * Generated from IDL interface "Current".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public class _CurrentStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosTransactions.Current
{
	private String[] ids = {"IDL:omg.org/CosTransactions/Current:1.0","IDL:omg.org/CORBA/Current:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosTransactions.CurrentOperations.class;
	public org.omg.CosTransactions.Control suspend()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "suspend", true);
				_is = _invoke(_os);
				org.omg.CosTransactions.Control _result = org.omg.CosTransactions.ControlHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "suspend", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CurrentOperations _localServant = (CurrentOperations)_so.servant;
			org.omg.CosTransactions.Control _result;
			try
			{
				_result = _localServant.suspend();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosTransactions.Status get_status()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_status", true);
				_is = _invoke(_os);
				org.omg.CosTransactions.Status _result = org.omg.CosTransactions.StatusHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_status", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CurrentOperations _localServant = (CurrentOperations)_so.servant;
			org.omg.CosTransactions.Status _result;
			try
			{
				_result = _localServant.get_status();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void rollback() throws org.omg.CosTransactions.NoTransaction
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "rollback", true);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosTransactions/NoTransaction:1.0"))
					{
						throw org.omg.CosTransactions.NoTransactionHelper.read(_ax.getInputStream());
					}
					else 
					{
						throw new RuntimeException("Unexpected exception " + _id );
					}
				}
				finally
				{
				try
				{
					_ax.getInputStream().close();
				}
				catch (java.io.IOException e)
				{
					throw new RuntimeException("Unexpected exception " + e.toString() );
				}
			}
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "rollback", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CurrentOperations _localServant = (CurrentOperations)_so.servant;
			try
			{
				_localServant.rollback();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void resume(org.omg.CosTransactions.Control which) throws org.omg.CosTransactions.InvalidControl
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "resume", true);
				org.omg.CosTransactions.ControlHelper.write(_os,which);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosTransactions/InvalidControl:1.0"))
					{
						throw org.omg.CosTransactions.InvalidControlHelper.read(_ax.getInputStream());
					}
					else 
					{
						throw new RuntimeException("Unexpected exception " + _id );
					}
				}
				finally
				{
				try
				{
					_ax.getInputStream().close();
				}
				catch (java.io.IOException e)
				{
					throw new RuntimeException("Unexpected exception " + e.toString() );
				}
			}
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "resume", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CurrentOperations _localServant = (CurrentOperations)_so.servant;
			try
			{
				_localServant.resume(which);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public java.lang.String get_transaction_name()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_transaction_name", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_transaction_name", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CurrentOperations _localServant = (CurrentOperations)_so.servant;
			java.lang.String _result;
			try
			{
				_result = _localServant.get_transaction_name();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void set_timeout(int seconds)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "set_timeout", true);
				_os.write_ulong(seconds);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_timeout", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CurrentOperations _localServant = (CurrentOperations)_so.servant;
			try
			{
				_localServant.set_timeout(seconds);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void commit(boolean report_heuristics) throws org.omg.CosTransactions.NoTransaction,org.omg.CosTransactions.HeuristicHazard,org.omg.CosTransactions.HeuristicMixed
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "commit", true);
				_os.write_boolean(report_heuristics);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosTransactions/NoTransaction:1.0"))
					{
						throw org.omg.CosTransactions.NoTransactionHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosTransactions/HeuristicHazard:1.0"))
					{
						throw org.omg.CosTransactions.HeuristicHazardHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosTransactions/HeuristicMixed:1.0"))
					{
						throw org.omg.CosTransactions.HeuristicMixedHelper.read(_ax.getInputStream());
					}
					else 
					{
						throw new RuntimeException("Unexpected exception " + _id );
					}
				}
				finally
				{
				try
				{
					_ax.getInputStream().close();
				}
				catch (java.io.IOException e)
				{
					throw new RuntimeException("Unexpected exception " + e.toString() );
				}
			}
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "commit", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CurrentOperations _localServant = (CurrentOperations)_so.servant;
			try
			{
				_localServant.commit(report_heuristics);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void rollback_only() throws org.omg.CosTransactions.NoTransaction
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "rollback_only", true);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosTransactions/NoTransaction:1.0"))
					{
						throw org.omg.CosTransactions.NoTransactionHelper.read(_ax.getInputStream());
					}
					else 
					{
						throw new RuntimeException("Unexpected exception " + _id );
					}
				}
				finally
				{
				try
				{
					_ax.getInputStream().close();
				}
				catch (java.io.IOException e)
				{
					throw new RuntimeException("Unexpected exception " + e.toString() );
				}
			}
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "rollback_only", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CurrentOperations _localServant = (CurrentOperations)_so.servant;
			try
			{
				_localServant.rollback_only();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.CosTransactions.Control get_control()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_control", true);
				_is = _invoke(_os);
				org.omg.CosTransactions.Control _result = org.omg.CosTransactions.ControlHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_control", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CurrentOperations _localServant = (CurrentOperations)_so.servant;
			org.omg.CosTransactions.Control _result;
			try
			{
				_result = _localServant.get_control();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void begin() throws org.omg.CosTransactions.SubtransactionsUnavailable
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "begin", true);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosTransactions/SubtransactionsUnavailable:1.0"))
					{
						throw org.omg.CosTransactions.SubtransactionsUnavailableHelper.read(_ax.getInputStream());
					}
					else 
					{
						throw new RuntimeException("Unexpected exception " + _id );
					}
				}
				finally
				{
				try
				{
					_ax.getInputStream().close();
				}
				catch (java.io.IOException e)
				{
					throw new RuntimeException("Unexpected exception " + e.toString() );
				}
			}
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "begin", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CurrentOperations _localServant = (CurrentOperations)_so.servant;
			try
			{
				_localServant.begin();
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

package org.omg.CosConcurrencyControl;


/**
 * Generated from IDL interface "LockSetFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public class _LockSetFactoryStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosConcurrencyControl.LockSetFactory
{
	private String[] ids = {"IDL:omg.org/CosConcurrencyControl/LockSetFactory:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosConcurrencyControl.LockSetFactoryOperations.class;
	public org.omg.CosConcurrencyControl.TransactionalLockSet create_transactional()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_transactional", true);
				_is = _invoke(_os);
				org.omg.CosConcurrencyControl.TransactionalLockSet _result = org.omg.CosConcurrencyControl.TransactionalLockSetHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_transactional", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			LockSetFactoryOperations _localServant = (LockSetFactoryOperations)_so.servant;
			org.omg.CosConcurrencyControl.TransactionalLockSet _result;
			try
			{
				_result = _localServant.create_transactional();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosConcurrencyControl.TransactionalLockSet create_transactional_related(org.omg.CosConcurrencyControl.TransactionalLockSet which)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_transactional_related", true);
				org.omg.CosConcurrencyControl.TransactionalLockSetHelper.write(_os,which);
				_is = _invoke(_os);
				org.omg.CosConcurrencyControl.TransactionalLockSet _result = org.omg.CosConcurrencyControl.TransactionalLockSetHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_transactional_related", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			LockSetFactoryOperations _localServant = (LockSetFactoryOperations)_so.servant;
			org.omg.CosConcurrencyControl.TransactionalLockSet _result;
			try
			{
				_result = _localServant.create_transactional_related(which);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosConcurrencyControl.LockSet create_related(org.omg.CosConcurrencyControl.LockSet which)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_related", true);
				org.omg.CosConcurrencyControl.LockSetHelper.write(_os,which);
				_is = _invoke(_os);
				org.omg.CosConcurrencyControl.LockSet _result = org.omg.CosConcurrencyControl.LockSetHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_related", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			LockSetFactoryOperations _localServant = (LockSetFactoryOperations)_so.servant;
			org.omg.CosConcurrencyControl.LockSet _result;
			try
			{
				_result = _localServant.create_related(which);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosConcurrencyControl.LockSet create()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create", true);
				_is = _invoke(_os);
				org.omg.CosConcurrencyControl.LockSet _result = org.omg.CosConcurrencyControl.LockSetHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			LockSetFactoryOperations _localServant = (LockSetFactoryOperations)_so.servant;
			org.omg.CosConcurrencyControl.LockSet _result;
			try
			{
				_result = _localServant.create();
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

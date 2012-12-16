package org.omg.CORBA;


/**
 * Generated from IDL interface "IRObject".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public class _IRObjectStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CORBA.IRObject
{
	private String[] ids = {"IDL:omg.org/CORBA/IRObject:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CORBA.IRObjectOperations.class;
	public void destroy()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "destroy", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "destroy", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			IRObjectOperations _localServant = (IRObjectOperations)_so.servant;
			try
			{
				_localServant.destroy();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.CORBA.DefinitionKind def_kind()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request("_get_def_kind",true);
				_is = _invoke(_os);
				return org.omg.CORBA.DefinitionKindHelper.read(_is);
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_def_kind", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			IRObjectOperations _localServant = (IRObjectOperations)_so.servant;
			org.omg.CORBA.DefinitionKind _result;
		try
		{
			_result = _localServant.def_kind();
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

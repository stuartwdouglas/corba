package org.omg.CosConcurrencyControl;


/**
 * Generated from IDL interface "LockCoordinator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public class _LockCoordinatorStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosConcurrencyControl.LockCoordinator
{
	private String[] ids = {"IDL:omg.org/CosConcurrencyControl/LockCoordinator:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosConcurrencyControl.LockCoordinatorOperations.class;
	public void drop_locks()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "drop_locks", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "drop_locks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			LockCoordinatorOperations _localServant = (LockCoordinatorOperations)_so.servant;
			try
			{
				_localServant.drop_locks();
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

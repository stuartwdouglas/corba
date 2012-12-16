package org.omg.CosConcurrencyControl;


/**
 * Generated from IDL interface "LockSetFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public interface LockSetFactoryOperations
{
	/* constants */
	/* operations  */
	org.omg.CosConcurrencyControl.LockSet create();
	org.omg.CosConcurrencyControl.LockSet create_related(org.omg.CosConcurrencyControl.LockSet which);
	org.omg.CosConcurrencyControl.TransactionalLockSet create_transactional();
	org.omg.CosConcurrencyControl.TransactionalLockSet create_transactional_related(org.omg.CosConcurrencyControl.TransactionalLockSet which);
}

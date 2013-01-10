package org.omg.CosConcurrencyControl;


/**
 * Generated from IDL interface "TransactionalLockSet".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public interface TransactionalLockSetOperations
{
	/* constants */
	/* operations  */
	void lock(org.omg.CosTransactions.Coordinator current, org.omg.CosConcurrencyControl.lock_mode mode);
	boolean try_lock(org.omg.CosTransactions.Coordinator current, org.omg.CosConcurrencyControl.lock_mode mode);
	void unlock(org.omg.CosTransactions.Coordinator current, org.omg.CosConcurrencyControl.lock_mode mode) throws org.omg.CosConcurrencyControl.LockNotHeld;
	void change_mode(org.omg.CosTransactions.Coordinator current, org.omg.CosConcurrencyControl.lock_mode held_mode, org.omg.CosConcurrencyControl.lock_mode new_mode) throws org.omg.CosConcurrencyControl.LockNotHeld;
	org.omg.CosConcurrencyControl.LockCoordinator get_coordinator(org.omg.CosTransactions.Coordinator which);
}

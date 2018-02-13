not threadsafe object - an object has an mutable state

Race condition - Check then act
-------------------------------

Case I:

void makeWithdrawal(int amount){
    if(balance >= amount){
        balance-=amount;
    }
}

should be considered as an atomic unit. Behaviour is referred as 'mutual exclusion'
if the method - doesn't have any instance variable(state). then it is thread-safe.


Case II:

public class IDGen{
    private long id;

    long getNewId(){
        id++; // read, increment, write
    }
}


--------------------------------

Item 66 : Synchronized access to shared mutable data
Synchronized block has two parts
    - lock
    - code that needs to be protected

    Synchronized(object_ref}{
        critical code
    }

#Locking
** Intrinsic or monitor locks
Every object has a single lock
Auto acquire hte lock
At most one thread can acquire the lock
if the lock is unavailable then the waiting threads go to the BLOCKED state


**Synchronized Method
synchronized void makeWithdrawal(int amount){
                 if(balance >= amount){
                     balance-=amount;
                 }
             }
lock : the object which the method is invoked.

Locks are per object and not per method
Static synchronized methods use Class object for lock

---------------------------------
**
Coordinating access to a variable.
Synchronize everywhere variable is accessed
Ref - Item 66
synchronized public int getBalance(){
    return this.balance;
}

**
Gurad same mutable variable using the same lock

synchronized withdrawal(){
}

synchronized deposit(){
}

Java Memory Model
------------------
Inter thread communication
Memory barrier

happens before ordering
-----------------------
program order
Lock ~ got the same lock ! - Imp
Volatile variable - write happens before every subsequent read of that variable regardless of the thread doing their read. - Imp
Thread start - a call to the start() method calls before every other actions that happen within that thread.
join - all actions in a particular thread happens before that the thread that sucessful returns from a join on that thread.
interrupt -
Object.finalize()  - invoked by gc
Transitivity - based on actions

Volatile
--------
Stored in main memory - not in cache or registers
can only be used with shared mutable variables
Similar functionality can be achieved by the 'synchronized' keyword


**
Volatile only ensures memory visibilty
Locking ensures 'mutual exclusion' and 'memory visibility'

By reading a volatile variable, a thread can see the latest values of other non-volatile variables.

Atomic variable
---------------
file:///Users/mmukherjee/Downloads/20-8-supplementary-notes.pdf

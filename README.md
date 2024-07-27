# Project-22-Generic-List
Design of a class in Java that uses generics to store data.

The purpose of the class is to hold a dynamic array and to take the data type dynamically. For this, a generic class needs to be created.

NOTE: COLLECTION CLASS WILL NOT BE USED! WE NEED TO CREATE OUR OWN LIST CLASS.

Class features:

The default size of the array within the class is 10, and the number of elements in the array should double as needed.
There should be two types of constructor methods for the class:
MyList(): If the empty constructor is used, the initial size of the array should be 10.
MyList(int capacity): The initial size of the array should be taken from the capacity parameter.
size(): Returns the number of elements in the array.
getCapacity(): Returns the capacity value of the array.
add(T data): Should be used to add elements to the array of the class. If there is not enough space in the array, the size of t
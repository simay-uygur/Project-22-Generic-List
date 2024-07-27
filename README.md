# Project-22-Generic-List
Design of a class in Java that uses generics to store data.

The purpose of the class is to hold a dynamic array and to take the data type dynamically. For this, a generic class needs to be created.

NOTE: COLLECTION CLASS WILL NOT BE USED! WE NEED TO CREATE OUR OWN LIST CLASS.

Class features:

The default size of the array within the class is 10, and the number of elements in the array should double as needed.
There should be two types of constructor methods for the class:
* ListGeneric(): If the empty constructor is used, the initial size of the array should be 10.
* ListGeneric(int capacity): The initial size of the array should be taken from the capacityparameter.
* size(): Returns the number of elements in the array.
* getCapacity(): Returns the capacity value of the array.
* add(T data): Should be used to add elements to the array of the class. If there is not enough space in the array, double the size of t.
* get(int index): Returns the value at the given index. If an invalid index is entered, it returns null.
* remove(int index): Deletes the data at the given index and shifts the data after the deleted index to the left. If an invalid index is entered, it returns null.
* set(int index, T data): Replaces the data at the given index with the new data. If an invalid index is entered, it returns null.
* String toString(): A method that lists the elements in the array of the class.
int indexOf(T data): Returns the index of the given object in the list. If the object is not in the list, it returns -1.
* int lastIndexOf(T data): Returns the last index of the specified element in the list. If the object is not in the list, it returns -1.
* boolean isEmpty(): Tells whether the list is empty.
* T[] toArray(): Converts the elements in the list to an array in the same order.
* clear(): Deletes all elements in the list, making it an empty list.
* ListGeneric<T> sublist(int start, int finish): Returns a list for the index range given in the parameter.
* boolean contains(T data): Tells whether the value given in the parameter is in the array.



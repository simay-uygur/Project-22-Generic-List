/**
 * ListGeneric
 */
public class ListGeneric <T>{

    T[] dataArray;
    int size;

    ListGeneric(){
        dataArray = (T[]) new Object[10];
        size = 0;
    }

    ListGeneric(int capacity){
        dataArray = (T[]) new Object[capacity];
        size = 0;
    }

    public int size(){
        return size;
    }

    public int getCapacity(){
        return dataArray.length;
    }

    public void add(T data){
        if(size == dataArray.length){
            T[] temp = (T[]) new Object[dataArray.length * 2];
            for(int i = 0; i < dataArray.length; i++){
                temp[i] = dataArray[i];
            }
            dataArray = temp;
        }
        dataArray[size] = data;
        size++;
    }

    public T get(int index){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        return dataArray[index];
    }

    public T remove(int index){
        if(index < 0 || index >= size){
            return null;
        }
        T temp = dataArray[index];
        
        for(int i = index; i < size - 1; i++){
            dataArray[i] = dataArray[i + 1];
        }
        size--;

        return temp;
    }

    public T set(int index, T data){
        if(index < 0 || index >= size){
            return null;
        }
        T temp = dataArray[index];
        dataArray[index] = data;
        return temp;
    }

    public String toString(){
        String result = "[";
        for(int i = 0; i < size-1; i++){
            result += dataArray[i] + " ";
        }
        if(size > 0)
            result += dataArray[size-1] ;
        result += "]";    
        return result;
    }

    public int indexOf(T data){
        int ind=-1;
        for(int i=0; i<size; i++){
            if(dataArray[i].equals(data)){
                ind = i;
                break;
            }
        }
        return ind;
    }

    public int lastIndexOf(T data){
        int ind=-1;
        for(int i=0; i<size; i++){
            if(dataArray[i].equals(data)){
                ind = i;
            }
        }
        return ind;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public T[] toArray(){
        T[] temp = (T[])new Object[size];

        for(int i=0; i<size; i++){
            temp[i] = dataArray[i];
        }

        return temp;
    }

    public void clear(){
        size = 0;

        for(int i=0; i<dataArray.length; i++){
            dataArray[i] = null;
        }   
    }

    public ListGeneric<T> subList(int start,int finish){
        if(start < 0 || start >= size || finish < 0 || finish >= size || start > finish){
            return null;
        }

        ListGeneric<T> temp = new ListGeneric<>(finish-start+1);

        for(int i=start; i<=finish; i++){
            temp.add(dataArray[i]);
        }
        return temp;
    }

    public boolean contains(T data){
        for(int i=0; i<size; i++){
            if(dataArray[i].equals(data)){
                return true;
            }
        }
        return false;
    }

    
}

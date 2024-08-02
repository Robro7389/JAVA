public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int val) throws QueueException {
        if (this.isFull()){
            int[] temp = new int[data.length * 2];
            int i = front;
            int count = 0;
            do{
                temp[count++] = data[i++];
                i = i % data.length;
            }while(i != end);
            data = temp;
            front = 0;
            end = data.length;
        }
        return super.insert(val);
    }
}

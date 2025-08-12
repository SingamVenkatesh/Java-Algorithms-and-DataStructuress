package RecursionLearning.STACKSandQUEESS;

public class CustomCircularQueue
{
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int end=0;
    int front=0;
    int size=0;
    CustomCircularQueue()
    {
        this(DEFAULT_SIZE);
    }
    public CustomCircularQueue(int size)
    {
        this.data=new int[size];
    }
    public boolean isFull() {
        return size==data.length;// ptr is at last index
    }
    public boolean isEmpty()
    {
        return end==0;
    }


    public boolean insert(int item)
    {
        if(isFull())
        {
            return false;
        }
        data[end++]=item;
        end=end%data.length; // because when we remove the first element that place will be empty and when we again add someother element we can add ther its a ciruclar q i mean at 0 index like that
        // without shieftinf elements  like normal queue we are direct adding in the circular queue
        size++;
        System.out.println("INdex 0 element : " + data[0]);
        return true;
    }



    public int remove() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is empty");
        }
        //here first element need to be removed so we remove data[0] and shieft the elemtns towards  left
        int removed=data[front];
        System.out.println("this " +removed);
        front++;
        front = (front + 1) % data.length; // Circular increment
        size--;
        return removed;
    }

    public int front() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Circular QUeue is empty");
        }
        return data[front];
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("emtpyt");
            return;
        }

        int i=front;
        do {

                System.out.print(data[i] + " --> ");
                i++;
                i%=data.length;
            }while (i!=end);
        System.out.println("END");
        }

}

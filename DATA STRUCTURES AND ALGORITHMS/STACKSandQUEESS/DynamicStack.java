package RecursionLearning.STACKSandQUEESS;

public class DynamicStack extends RecursionLearning.STACKSandQUEESS.CustomStack
{
    DynamicStack()

    {
        super(); // it will call CustomStack
    }
    public DynamicStack(int size)

    {
        super(size);
    }
    @Override
    public boolean push(int item)
    {
        if(this.isFull())
        {
            //double the array size
            int[] temp=new int[data.length*2];
            // copy all previous items in temp.
            for (int i=0;i<data.length;i++)
            {
                temp[i]=data[i];

            }
            data=temp;
        }
        // at this point we know that array is not full
        return super.push(item);// calls custom stack push method
    }

}

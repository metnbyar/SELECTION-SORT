package selection_sort;

public class Selection_Sort {
static int[] Selectionsort(int a[],int n)
{
int indx,deger;
for(int i=0;i<n;i++)
{
	deger=a[i];
	indx=i;
	for (int j=i+1;j<n;j++)
	if(a[j]<deger)
	{
		deger=a[j];
		indx=j;
	}
        
	a[indx]=a[i];
	a[i]=deger;
}
return a;
}

    public static void main(String[] args) {
       int dizi[]={3,2,1,5,6,4,9,7,8};
	int n= dizi.length;
	for (int ii=0;ii<n;ii++)
	{
            System.out.print(dizi[ii]+" ");
	}
	
	Selectionsort(dizi,n);
	
	System.out.println("");
	for (int ii=0;ii<n;ii++)
	{
            System.out.print(dizi[ii]+" ");
	}
        System.out.println("");
    }
    
}
